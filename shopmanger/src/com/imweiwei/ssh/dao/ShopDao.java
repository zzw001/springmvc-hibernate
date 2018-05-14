package com.imweiwei.ssh.dao;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.imweiwei.ssh.entities.Product;
import com.imweiwei.ssh.entities.User;

public class ShopDao {

	public List<Object[]> getAllPro() {
		
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		String hql="select s.*,p.* from SHOP_PRODUCT s, PRODUCT p where s.pro_id=g.pro_id";
		Query query=session.createQuery(hql);
		List<Object[]> list=query.list();
		return list;
	}
}
