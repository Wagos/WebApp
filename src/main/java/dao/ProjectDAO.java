/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.springframework.stereotype.Repository;

/**
 * @author Ёжик
 */
@Repository
@Deprecated
public class ProjectDAO extends BaseDAO {

//    BaseDAO<Project> DAO=new BaseDAO<>();
//
//    public void addProject(Project project){
//        DAO.saveObject(project);
//    }
//
//    public void updateProject(Project project){
//        DAO.updateObject(project);
//    }
//
//    public List<Project> getAllProjects(){
//        List projects = null;
//        projects=DAO.getSession().createQuery("from Project").list();
//        DAO.close();
//        return projects;
//    }
//
//    @SuppressWarnings("unchecked")
//    public List<String> getProjectsNames(){
//        List<String> projects = null;
//        projects=getSessionFactory().getCurrentSession().createSQLQuery("SELECT name FROM projects").list();
//        return projects;
//    }
//    public void deleteProject(String id){
//        DAO.begin();
//        DAO.getSession().delete(new Project(Integer.parseInt(id),null, null));
//        DAO.commit();
//        DAO.close();
//    }
//    public Project getProject(String id){
//        Project project=(Project) DAO.getSession().load(Project.class,Integer.parseInt(id));
//        return project;
//    }
}
