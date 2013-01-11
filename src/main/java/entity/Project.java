/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Ёжик
 */
@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue
    @Column(name = "idProject")
    private Integer id;

    @NotEmpty(message = "{errors.project.name}")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "{errors.project.description}")
    @Column(name = "description")
    private String description;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "idProject")
    private Set<WorkersRoles> workersRoles = new HashSet<>();

//    private Hashtable errors;

    public Set<WorkersRoles> getWorkersRoles() {
        return workersRoles;
    }

    public void setWorkersRoles(Set<WorkersRoles> workersRoleses) {
        this.workersRoles = workersRoleses;
    }

    public Project() {
        name = "";
        description = "";
//        errors = new Hashtable();
    }

    public Project(Integer id, String projectName, String description) {
        this.id = id;
        this.name = projectName;
        this.description = description;
//        errors = new Hashtable();
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String projectName) {
        this.name = projectName;
    }


    public String getName() {
        return name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//    public boolean validate(){
//        boolean ok=true;
//        if(name.equals("")){
//             setErrors("projectName", "Не указано название проекта");
//             ok=false;
//        }
//        if(description.equals("")){
//             setErrors("description", "Не указано описание проекта");
//             ok=false;
//        }
//        return ok;
//    }
//    public void setErrors(String key, String msg) {
//        errors.put(key,msg);
//    }
//    public String getErrors(String s) {
//        String errorMsg =(String)errors.get(s);
//        return (errorMsg == null) ? "":errorMsg;
//    }
}
