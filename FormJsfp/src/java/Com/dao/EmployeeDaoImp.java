/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.dao;

import Com.entity.Employee;
import Com.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author A D M I N
 */
public class EmployeeDaoImp implements EmployeeDao{
    private Session session =null;

    @Override
    public void insert(Employee em) {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tran = session.beginTransaction();
        session.save(em);
        tran.commit();
        session.close();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Employee em, int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 @Override
    public Employee getEmpById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  

    @Override
    public List<Employee> getEmps() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
