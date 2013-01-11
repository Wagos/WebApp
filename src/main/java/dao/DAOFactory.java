/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 * @author Ёжик
 */
@Deprecated
public class DAOFactory {

    private static ProjectDAO projectDAO = null;
    private static WorkerDAO workerDAO = null;
    private static WorkersProjectDAO workersProjectDAO = null;
    private static RolesDAO rolesDAO = null;
    private static DAOFactory instance = null;

    public static synchronized DAOFactory getInstance() {
        if (instance == null) {
            instance = new DAOFactory();
        }
        return instance;
    }

    public ProjectDAO getProjectDAO() {
        if (projectDAO == null) {
            projectDAO = new ProjectDAO();
        }
        return projectDAO;
    }

    public WorkerDAO getWorkerDAO() {
        if (workerDAO == null) {
            workerDAO = new WorkerDAO();
        }
        return workerDAO;
    }

    public WorkersProjectDAO getWorkersProjectDAO() {
        if (workersProjectDAO == null) {
            workersProjectDAO = new WorkersProjectDAO();
        }
        return workersProjectDAO;
    }

    public RolesDAO getRolesDAO() {
        if (rolesDAO == null) {
            rolesDAO = new RolesDAO();
        }
        return rolesDAO;
    }
}
