package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Lab1A {
    public static void main(String[] args) {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            sf.getSchemaManager().exportMappedObjects(true);
            // inserting the customers
            sf.inTransaction(session -> {
                session.persist(new Customer("sri","sri@jlc",987808L,"Blore"));
            });

            sf.inTransaction(session -> {
                session.persist(new Customer("vas","vas@jlc",987800L,"Delhi"));
            });

            sf.inTransaction(session -> {
                session.persist(new Customer("mayank","mayank@jlc",887809L,"Delhi"));
            });

            sf.inTransaction(session -> {
                session.persist(new Customer("srinivas","srinivas@jlc",786809L,"Hyd"));
            });
    }
}