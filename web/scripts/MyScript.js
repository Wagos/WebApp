/**
 * Created with IntelliJ IDEA.
 * User: Admin
 * Date: 19.12.12
 * Time: 10:27
 * To change this template use File | Settings | File Templates.
 */

(function($){

    jQuery.fn.dynamicEdit= function(settings){

        var options= $.extend({},$.fn.dynamicEdit.defaults,$.dynamicEdit.types['default'],$.dynamicEdit.types[settings.type],settings);




        var doThm=function(){
            var editing;
            var self=$(this);

            $(this).bind(options.event,function(){

                if(editing){
                    return;
                }
                var oldContent=self.children();
                var form=$('<form/>');
                var url = options.url || self.attr("url");
                var adding=self.attr('add')!==undefined;
                if(!url){
                    return;
                }
                //form.attr("action",target);
                form.attr("method",options.method);

                options.element.apply(form,[options,this]);

                var replace=function(){
                    if(adding){
                        form.remove();
                    }else{
                        form.replaceWith(oldContent);
                    }
                    editing=false;
                    return false;
                };

                form.append(jQuery('<button type="submit">').text("OK"));
                form.append(jQuery('<button type="reset">').text("Cancel").click(replace));
                form.ajaxForm({
                    url: url,
                    success: function(){
                        if(adding){
                            var root=$(document.createElement(options.rootElem));
                            $("input",form).each(function(){
                                var elem=$(document.createElement(options.childElem));
                                elem.text($(this).val())
                                    .attr("id",$(this).attr("id"))
                                    .attr("inputType",$(this).attr("type"));
                                root.append(elem);

                            });
                            if(options.addTarget){
                                $(options.addTarget).append(root);
                            }
                        }else{
                            oldContent.each(function(){
                                if($(this).attr("inputType")!="file"){
                                    $(this).text($("#"+$(this).attr("id"),form).val());
                                }
                            });
                        }
                        replace();
                    },
                    error: function(){
                    }
                });
                if(!adding){
                    form.append(jQuery('<button type="button">').text("Delete").click(function(){
                        $.ajax({
                            url: options.delUrl,
                            type  : "POST",
                            data: {
                                id : $("#id",form).val()
                            },
                            success: self.remove()
                        });
                    }));
                    self.empty().append(form);
                }else{
                    self.after(form);
                }
                editing=true;

            });
        };
        return this.each(doThm);
    };

    $.dynamicEdit = {
        types : {
            default:{
                element : function(options,parent){
                    var form=this;
                    if(options.inputList){
                        var list=options.inputList;
                        for(var key in list){
                            form.append(jQuery('<input>')
                                .attr("type",list[key])
                                .attr("id",key)
                                .attr("name",key)
                                .val($("#"+key,parent).text())
                            );
                        }

                    }else{
                        $("[id][inputType]",parent).each(function(){
                            var type=$(this).attr("inputType");
                            var id=$(this).attr("id");
                            var val=$(this).text();
                            form.append(jQuery('<input type="'+type+'" id="'+id+'">').val(val).attr("name",id));
                        });
                    }
                }
            },
            worker:{
                inputList   : {
                    id      : 'hidden',
                    fio     : 'text',
                    email   : 'text',
                    image   : 'file'
                },
                url  : "SaveWorker",
                delUrl: "DeleteWorker"
            },
            project:{
                inputList   : {
                    id      : 'hidden',
                    name     : 'text',
                    description   : 'text'
                },
                url  : "SaveProject",
                delUrl: "DeleteProject"
            }
        }
    };

    $.fn.dynamicEdit.defaults={
        method  : "POST",
        type    : "default",
        event   : "click",
        rootElem: "tr",
        childElem: "td"
    }

})(jQuery);


jQuery(function () {

    $(".Worker").dynamicEdit({
        type: "worker",
        addTarget: "#table"
    });

    $(".Project").dynamicEdit({
        type: "project",
        addTarget: "#table"
    });
//    $("[editable]").live('click',function(){
//        //var oldContent=$(this).html();
//        var form=$('<form/>');
//        form.attr("action",$(this).attr("editable"));
//        form.attr("method","POST");
//        $(this).children("[id][inputType]").each(function(){
//            var type=$(this).attr("inputType");
//            var id=$(this).attr("id");
//            var val=$(this).text();
//            form.append(jQuery('<input type="'+type+'" id="'+id+'" >').val(val).attr("name",id));
//        });
//
//        var replace=function(){
//            form.replaceWith(oldContent);
//        };
//        form.append(jQuery('<button type="submit">').text("OK"));
//        form.append(jQuery('<button type="reset">').text("Cancel").click(replace));
//        form.ajaxForm({
//            success: function(){
//                oldContent.children("[id][inputType]").each(function(){
//                    if($(this).attr("inputType")!="file")
//                        $(this).text($("#"+$(this).attr("id"),form).val());
//                });
//                replace();
//            }
//        });
//        var oldContent =$(this).replaceWith(form);
//
//    })
});

//function doRequest(target,method){
//    $.ajax({
//        url: target,
//        type: "POST",
//        data: "id=1",
//        success: function(dat1a){
//            $('#result21').html(dat1a)
//        }
//    });
//}
//$.editable.addInputType('worker',{
//    element:function(settings,original){
//        var id=jQuery('<input type="hidden" id="id" >');
//        var fio=jQuery('<input type="text" id="fio">');
//        var email=jQuery('<input type="text" id="email">');
//        var photo = jQuery('<input type="file" id="photo">');
//
//        var hidden = $('<input type="hidden">');
//        $(this).append(hidden);
//
//        $(this).append(id);
//        $(this).append(fio);
//        $(this).append(email);
//        $(this).append(photo);
//
//
//        return(hidden);
//    },
//    content:function(string, settings, original){
//        var id=$(string).get(0).innerText;
//        var fio=$(string).get(2).innerText;
//        var email=$(string).get(4).innerText;
//        $("#id",this).attr("value",id);
//        $("#fio",this).attr("value",fio);
//        $("#email",this).attr("value",email);
//    }
////    submit:function (settings, original) {
////        var value ="id="+$("#id").val() + "&fio=" + $("#fio").val()+"&email="+$("#email").val();
////        return value;
////    }
//});
//$(document).ready(function(){
//    $('.edit').editable('Save',{
//
//        submit: 'OK',
//        cancel: 'Cancel',
////        onblur: 'cancel',
//        type: 'worker'
////        success: function(data){
////            $('#result').html(data)
////        }
//    });
//})  ;

