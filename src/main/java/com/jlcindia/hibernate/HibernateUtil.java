package com.jlcindia.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import static org.hibernate.cfg.AvailableSettings.*;

public class HibernateUtil {

    public static SessionFactory sessionFactory = null;
    static {
        sessionFactory = new Configuration()
                .addAnnotatedClass(Customer.class)
                // use MySQl database
                .setProperty(DRIVER,"com.mysql.jdbc.Driver")
                .setProperty(URL, "jdbc:mysql://localhost:3306/hibernate_db")
                .setProperty(USER, "root")
                .setProperty(PASS, "Srivastava@123")
                // use Agroal connection pool
                .setProperty(HIKARI_MIN_IDLE_SIZE, 10)
                .setProperty(HIKARI_MAX_SIZE, 99)
                .setProperty(HIKARI_ACQUISITION_TIMEOUT,20000)
                .setProperty(HIKARI_IDLE_TIMEOUT,30000)
                // display SQL in console
                .setProperty(DIALECT,"org.hibernate.dialect.MySQLDialect")
                .setProperty(SHOW_SQL, true)
                .setProperty(FORMAT_SQL, true)
                .setProperty(HIGHLIGHT_SQL, true)
                .setProperty(HBM2DDL_AUTO, "create")
                .setProperty(CURRENT_SESSION_CONTEXT_CLASS,"thread")
                .buildSessionFactory();
    }
    protected static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
