package com.codeup;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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

    @Override
    public Post showPost(int id) {
        Query query = session.createQuery("FROM Post where id = :id");
        query.setParameter("id", id);
        return (Post) query.getSingleResult();
    }

    @Override
    public Post showEdit(int id) {
        Query query = session.createQuery("FROM Post where id = :id");
        query.setParameter("id", id);
        return (Post) query.getSingleResult();
    }

    @Override
    public void update(Post existing) {
        Transaction tx = session.beginTransaction();
        session.update(existing);
        tx.commit();
    }
}
