package com.hibernate;

import com.hibernate.models.Orders;
import com.hibernate.models.Persons;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateDemo {

    public static void main(String[] args) {

        Persons persons = new Persons();

        persons.setFirstName("John");
        persons.setIsMarried(false);

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Persons.class)
                .addAnnotatedClass(Orders.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession(); //like opening connection

        Transaction transaction = session.beginTransaction(); // your prepared statement

        session.save(persons);

        transaction.commit();
    }
}
