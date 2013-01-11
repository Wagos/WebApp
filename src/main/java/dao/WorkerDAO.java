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
public class WorkerDAO extends BaseDAO {

//    @Autowired
//    private SessionFactory sessionFactory;
//
//    public void addWorker(Worker worker){
//        sessionFactory.getCurrentSession().save(worker);
//    }
//    public void updateWorker(Worker worker){
//        sessionFactory.getCurrentSession().update(worker);
//    }
//
//    @SuppressWarnings("unchecked")
//    public List<Worker> getAllWorkers(){
//
//        return sessionFactory.getCurrentSession().createQuery("from Worker ").list();
//    }
//
//    @SuppressWarnings("unchecked")
//    public List<String> getWorkersNames(){
//        List<String>  workers=null;
//        workers=getSessionFactory().getCurrentSession().createSQLQuery("SELECT name FROM workers").list();
//        return workers;
//    }
//
//    public  void deleteWorker(String id){
//        sessionFactory.getCurrentSession().delete(new Worker(Integer.parseInt(id), null,null, null));
//    }
//    public Worker getWorker(String id){
//        return (Worker) sessionFactory.getCurrentSession().load(Worker.class,id);
//    }
}
