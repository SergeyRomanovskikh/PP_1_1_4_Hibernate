package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Util {
    public static SessionFactory getSessionFactory() {
           SessionFactory factory = new Configuration()
                   .configure("hibernate.cfg.xml")
                   .addAnnotatedClass(User.class)
                   .buildSessionFactory();
           return factory;
    }
}

