package com.example.employeedemo.hibernate;

import com.example.employeedemo.entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeHibernateDao {

    public Integer addEmployee(Employee employee) {
        Transaction tx = null;
        Integer employeeId = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            employeeId = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
        return employeeId;
    }
}