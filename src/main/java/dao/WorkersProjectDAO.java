/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 * @author Ёжик
 */
@Deprecated
public class WorkersProjectDAO {

//    BaseDAO<WorkersRoles> DAO=new BaseDAO<>();
//
//    public WorkersProjectDAO() {
//        //loadRoles();
//
//    }
//
//
//
//    public List<WorkersRoles> getWorkersRoles(){
//        List roles=DAO.getSession().createQuery("from WorkersRoles ")
//                .list();
//        DAO.close();
//        return roles;
//    }
//
//    public void setWorkersProject(String idWorker, String idProject, String role){
//        WorkersRoles wp=new WorkersRoles(null,
//                new Project(Integer.parseInt(idProject),null,null)
//                ,new Worker(Integer.parseInt(idWorker),null,null,null)
//                , role);
//        DAO.saveObject(wp);
//        DAO.close();
//    }
//
//    public void removeWorkersProject(String id){
//        DAO.begin();
//        DAO.getSession().delete(new WorkersRoles(Integer.parseInt(id), null, null, null));
//        DAO.commit();
//        DAO.close();
//    }

}
