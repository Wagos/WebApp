/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


/**
 * @author Ёжик
 */
@Entity
@Table(name = "workers")
public class Worker implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "idWorker")
    private Integer id;

    @Column(name = "name")
    @NotEmpty(message = "{errors.worker.name}")
    private String fio;

    @Column(name = "Email")
    @Email(message = "{errors.worker.email}")
    @NotEmpty(message = "{errors.worker.emptyEmail}")
    private String email;

    @Column(name = "photo")
    @Lob
    private byte[] photo;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "idWorker")
    private Set<WorkersRoles> workersRoles = new HashSet<>();
//    private Hashtable errors;


    public Set<WorkersRoles> getWorkersRoles() {
        return workersRoles;
    }

    public void setWorkersRoles(Set<WorkersRoles> workersRoles) {
        this.workersRoles = workersRoles;
    }

    public Worker(Integer id, String fio, String email, byte[] photo) {
        this.id = id;
        this.fio = fio;
        this.email = email;
        this.photo = photo;
//        errors = new Hashtable();
    }

    public Worker() {
        fio = "";
        email = "";
        photo = new byte[0];
//        errors = new Hashtable();
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

//    public boolean validate(){
//        boolean ok=true;
//
//        if(fio.equals("")){
//            setErrors("fio", "Не указано имя сотрудника");
//            ok=false;
//        }
//        if(email.equals("")||email.indexOf("@")<0) {
//            setErrors("email", "Не указана почта сотрудника");
//            ok=false;
//        }
//
//        return ok;
//    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }


    public byte[] getPhoto() {
        return photo;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getErrors(String s) {
//        String errorMsg =(String)errors.get(s);
//        return (errorMsg == null) ? "":errorMsg;
//    }
//
//    public void setErrors(String key, String msg) {
//        errors.put(key,msg);
//    }

    public String photoBase64() {
        return Base64.encode(photo);
    }

}
