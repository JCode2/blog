package com.codeup;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class HibernatePostDao implements Posts {

    private Session session;

    public HibernatePostDao(Session session) {this.session = session;}

//    @SuppressWarnings("unchecked")
//    private List<Post> posts;


    @Override
    public List<Post> all() {
        return session.createQuery("from Post").list();
    }

    @Override
    public void save(Post post) {
        Transaction tx = session.beginTransaction();
        session.save(post);
        tx.commit();
    }

}
