package com.imweiwei.ssh.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.imweiwei.ssh.entities.Shop;
import com.imweiwei.ssh.entities.User;

@Controller
public class UserService {

	
	@RequestMapping("/user_login")
	public String login(@RequestParam(value="user_name") String user_name,
			@RequestParam(value="user_password") String user_password,Model model) {
		
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		String sql="select * from USER where user_name=:user_name";
		NativeQuery<User> query=session.createNativeQuery(sql, User.class);
		query.setParameter("user_name", user_name);
		List<User> user_list=query.getResultList();
		
		if(user_list.get(0).getUser_password().equals(user_password)) {
			String sql1="select * from SHOP";
			NativeQuery<Shop> query1=session.createNativeQuery(sql1, Shop.class);
			List<Shop> list1=query1.getResultList();
			transaction.commit();
			model.addAttribute("user",user_list.get(0));
			model.addAttribute("pro_lists",list1.iterator());
			return "user";
		}else {
			return "user_login";
		}
	}
	
	@RequestMapping("/user_info")
	public String user_info(@RequestParam(value="user_id") String user_id,Model model) {
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		User user=session.get(User.class, Integer.parseInt(user_id));
		System.out.println(user);
		model.addAttribute("user",user);
		return "user_info";
	}
	@RequestMapping("/user_update")
	public String user_update(@ModelAttribute User user) {
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		User user2=session.get(User.class, user.getUser_id());
		user2.setUser_name(user.getUser_name());
		user2.setUser_password(user.getUser_password());
		user2.setUser_phone(user.getUser_password());
		user2.setUser_email(user.getUser_email());
		user2.setUser_address(user.getUser_address());
		session.update(user2);
		transaction.commit();
	    session.close();
	    sessionFactory.close();
		return "redirect:/index.jsp";
	}
}
