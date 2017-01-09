package com.codeup;

/**
 * Created by joshua on 1/9/17.
 */
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

    public class HibernateUtil {

        public static SessionFactory getSessionFactory() {
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure()
                    .build();

            return new MetadataSources(registry)
                    .buildMetadata()
                    .buildSessionFactory();
        }
    }


