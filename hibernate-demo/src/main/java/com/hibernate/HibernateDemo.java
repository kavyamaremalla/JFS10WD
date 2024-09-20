package com.hibernate;

import com.hibernate.models.Orders;
import com.hibernate.models.Persons;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HibernateDemo {

    public static void main(String[] args) {


        Configuration configuration = new Configuration().configure().addAnnotatedClass(Persons.class)
                .addAnnotatedClass(Orders.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession(); //like opening connection

        Transaction transaction = session.beginTransaction(); // your prepared statement

        Persons persons = session.get(Persons.class, 1);

        transaction.commit();

        persons.getOrders().forEach(order -> {
            System.out.println(order.getOrderId());
            System.out.println(order.getOrderNumber());
            System.out.println(order.getOrderDetails());
            System.out.println(order.getPersonId());
        });


    }
}
