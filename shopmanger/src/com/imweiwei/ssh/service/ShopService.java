package com.imweiwei.ssh.service;

import java.util.List;
import java.util.Set;

import org.apache.catalina.User;
import org.apache.jasper.tagplugins.jstl.core.Out;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imweiwei.ssh.entities.Product;
import com.imweiwei.ssh.entities.Shop;

@Controller
public class ShopService {


	@RequestMapping("/show_shop")
	public String show_shop(@RequestParam(value="shop_name") String shop_name,
			@RequestParam(value="shop_password") String shop_password,Model model) {
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		String sql="select * from SHOP where SHOP.shop_name = :shop_name";
		NativeQuery<Shop> query=session.createNativeQuery(sql, Shop.class);
		query.setParameter("shop_name", shop_name);
		List<Shop> list=query.getResultList();
		System.out.println(list);
		if(list.get(0).getShop_password().equals(shop_password)) {
			
//			String sql1="select * from PRODUCT where pro_id in "
//					+ "(select pro_id from SHOP_PRODUCT where shop_id= :shop_id )";
//			NativeQuery<Product> query1=session.createNativeQuery(sql1, Product.class);
//			query1.setParameter("shop_id", list.get(0).getShop_id());
//			List<Product> list1=query1.getResultList();
			Shop shop=session.get(Shop.class, list.get(0).getShop_id());
			Set<Product> products=shop.getItem();
			System.out.println(products.size());
			model.addAttribute("shop_name", shop_name);
			model.addAttribute("pro_lists", products.iterator());
			
			return "shop";
		}else {
			return "shop_login";
		}
		
	}
}
