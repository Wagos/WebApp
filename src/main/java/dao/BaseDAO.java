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
public class BaseDAO {

//    @Autowired
//    private SessionFactory sessionFactory;
//
//    protected SessionFactory getSessionFactory() {
//        return sessionFactory;
//    }
//
//    public void saveObject(Object t){
//        sessionFactory.getCurrentSession().save(t);
//    }
//
//    public void updateObject(Object t){
//        sessionFactory.getCurrentSession().update(t);
//    }
//
//    public void deleteObject(Object o){
//        sessionFactory.getCurrentSession().delete(o);
//    }
//
//    public Object getObjectById(Class clas,Serializable id){
//        return sessionFactory.getCurrentSession().load(clas,id);
//    }
//
//    @SuppressWarnings("unchecked")
//    public List getAllObject(Class clas){
//        String className=clas.getName();
//        return sessionFactory.getCurrentSession().createQuery("from "+className).list();
//    }

}
