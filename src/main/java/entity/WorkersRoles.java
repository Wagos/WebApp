/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Ёжик
 */
@Entity
@Table(name = "workers_project")
public class WorkersRoles implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "idRole")
    private Integer idRole;

    @ManyToOne
    @JoinColumn(name = "idProject")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "idWorker")
    private Worker worker;

    @ManyToOne
    @JoinColumn(name = "roleName")
    private Role roleName;

    public WorkersRoles() {
        this.project = new Project();
        this.worker = new Worker();
        this.roleName = new Role();
    }

    public WorkersRoles(Integer idRole, Project project, Worker worker, Role roleName) {
        this.idRole = idRole;
        this.project = project;
        this.worker = worker;
        this.roleName = roleName;
    }


    public Integer getIdRole() {
        return idRole;
    }

    public void setIdRole(Integer idRole) {
        this.idRole = idRole;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Role getRoleName() {
        return roleName;
    }

    public void setRoleName(Role roleName) {
        this.roleName = roleName;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }


}
