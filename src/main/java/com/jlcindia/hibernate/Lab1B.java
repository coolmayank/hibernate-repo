package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import static java.lang.System.out;

public class Lab1B {

    public static void main(String[] args) {
        Transaction tx = null;
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession();
            tx =session.beginTransaction();
            Customer cust = (Customer)session.load(Customer.class, 2);
            System.out.println(cust);
            tx.commit();
            session.close();
        } catch (Exception ex) {
            tx.rollback();
            ex.printStackTrace();
        }
    }
}
