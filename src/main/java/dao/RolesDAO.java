package dao;

/**
 * Created with IntelliJ IDEA.
 * User: Witkowsky Dmitry
 * Date: 1.11.12
 * Time: 22.26
 */
@Deprecated
public class RolesDAO {

//    BaseDAO<Role> DAO=new BaseDAO<>();
//
//    public void addRole(Role role){
//        DAO.saveObject(role);
//    }
//
//    public List<Role> getRoles(){
//        List<Role> roles=null;
//        roles=DAO.getSession().createQuery("from Role ").list();
//        DAO.close();
//        return roles;
//    }

//    private void addRoles(ArrayList roles){
//        try{
//        begin();
//        getSession().createSQLQuery("TRUNCATE TABLE roles").executeUpdate();
//        String text="";
//        for(int i=0;i<roles.size();i++){
//            text=text.concat(",('"+roles.get(i)+"') ");
//        }
//        text="INSERT INTO roles  VALUES "+text.substring(1);
//        getSession().createSQLQuery(text).executeUpdate();
//        commit();
//        }catch(HibernateException ex){
//            rollback();
//        }
//        finally{
//            close();
//        }
//    }
//
//    private void loadRoles() {
//        InputStream stream=this.getClass()
//                .getClassLoader().getResourceAsStream("settings/roles.xml");
//        if(stream!=null){
//            RolesDataParser rdp=new RolesDataParser();
//            ArrayList list= rdp.parse(stream);
//            if(list!=null && list.size()>0){
//                addRoles(list);
//            }
//        }
//    }
}
