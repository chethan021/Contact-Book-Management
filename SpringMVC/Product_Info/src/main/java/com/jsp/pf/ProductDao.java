package com.jsp.pf;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
	
org.hibernate.cfg.Configuration con=new org.hibernate.cfg.Configuration().configure().addAnnotatedClass(Product.class);
    public void saveProduct(Product product ) {
        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(product);
        transaction.commit();
        session.close();

    }
   
}

