package com.imweiwei.ssh.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sun.javafx.collections.MappingChange.Map;

public class HibernateTest {

	private SessionFactory sessionFactory;
	private Session session;
	private Transaction transaction;
	
	@BeforeEach
	public void init() {
		Configuration configuration=new Configuration().configure();
		sessionFactory=configuration.buildSessionFactory();
		session=sessionFactory.openSession();
		transaction=session.beginTransaction();
	}
	
	@AfterEach
	public void destroy() {
		transaction.commit();
		session.close();
		sessionFactory.close();
	}
	
	@Test
	public void testShop(){

		String sql="select * from SHOP";
		NativeQuery<Shop> query=session.createNativeQuery(sql, Shop.class);
		List<Shop> list=query.getResultList();
		System.out.println(list.size());
	}
	
	@Test
	public void testProductAdd() {
		Product product=new Product("鸭肉", "温氏", "温氏集团","肉类代理", new Date().toString(), "肉类",13.5);
		session.save(product);
	}
	@Test
	public void testSPAdd() {
		Shop shop=new Shop("fruit", "123456", "1-102");
		Product product1=new Product("苹果", "水果店", "农场主","水果批发商",new Date().toString(), "肉类",3D);
		Product product2=new Product("犁", "水果店", "农场主","水果批发商",new Date().toString(), "肉类",3D);
		Product product3=new Product("桃子", "水果店", "农场主","水果批发商",new Date().toString(), "肉类",3D);
		shop.getItem().add(product1);
		shop.getItem().add(product2);
		shop.getItem().add(product3);
		session.save(shop);
		session.save(product1);
		session.save(product2);
		session.save(product3);
	}
	@Test
	public void testUserAdd() {
		User user=new User("zzw", "zzw", "1234567890", "zzw@zzw.com", "guangzhou");
		session.save(user);
	}
	@Test
	public void testGetAll() {
		
		String sql="select * from SHOP";
		NativeQuery<Shop> query=session.createNativeQuery(sql, Shop.class);
		List<Shop> list=query.getResultList();
//		Set<Shop> set=new HashSet<>();
//		for(Shop shop:list) {
//			set.add(shop);
//		}
//		list=new ArrayList<>();
//		for(Shop shop:set) {
//			list.add(shop);
//		}
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0).getItem());
		
		
	}
}
