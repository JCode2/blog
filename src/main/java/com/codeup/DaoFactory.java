package com.codeup;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DaoFactory {
    private static SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static Session session = sessionFactory.openSession();

    private static Posts postDao;

        public static Posts getPostsDao() {
            if (postDao == null) {
                postDao = new HibernatePostDao(session);
            }
            return postDao;
        }
}
