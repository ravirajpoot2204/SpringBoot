package com.jpa.example;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.example.entities.User;
import com.jpa.example.repository.UserRepo;

@SpringBootApplication
public class JpaExampleBootApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaExampleBootApplication.class, args);
		UserRepo ur = context.getBean(UserRepo.class);
		User u = new User();
		/*
		 * u.setName("Ravi Rajpoot"); u.setStatus("OK"); u.setCity("Lucknow");
		 */
		/*
		 * User u1 = new User(); u1.setName("Rakesh Mishra"); u1.setCity("Hydrabad");
		 * u1.setStatus("Working"); User u2 = new User(); u2.setName("Komal Shukla");
		 * u2.setCity("Delhi"); u2.setStatus("Working"); User u3 = new User();
		 * u3.setName("Sachin Shukla"); u3.setCity("Banglore"); u3.setStatus("Working");
		 */
		/*
		 * Saving Single 
		 * User User out1=ur.save(u1);
		 * 
		 * User out2=ur.save(u2);
		 * 
		 * User out3=ur.save(u3);
		 */
		/*
		 * System.out.println(out1); System.out.println("*************************");
		 * System.out.println(out2); System.out.println("*************************");
		 * System.out.println(out3); System.out.println("*************************");
		 */
		/*
		 * Multiple Part
		 * 
		 *  List<User> users = List.of(u1,u2,u3); 
		 *  
		 *  Iterable<User> result = ur.saveAll(users);
		 *  
		 *  result.forEach(user->{ System.out.println(user); });
		 */
		/* System.out.println("Done"); */
		/* Update Data By ID */
		/*
		 * Optional<User> optional = ur.findById(102);
		 *  User user = optional.get();
		 * user.setName("Raju Mishra"); User result = ur.save(user);
		 * 
		 * System.out.println(result);
		 */
		
		/* Iterable<User> all = ur.findAll(); 
	all.forEach(user->{
		System.out.println(user);
	}); */
		/*
		 * List<User> list = ur.findByName("Rakesh Mishra");
		 * list.forEach(e->{System.out.println(e);});
		 */		
		/*Fetching all Data before deleting
		 * List<User> list = ur.findAll(); list.forEach(e -> { System.out.println(e);
		 * }); Optional<User> byId = ur.findById(104); User user = byId.get();
		 * ur.delete(user);
		 * 
		 * 
		 * System.out.println(
		 * "__________________________________________________________");
		 * System.out.println("Deleted"); System.out.println(
		 * "__________________________________________________________"); 
		 * Fetching all Data before deleting
		 * List<User> list1 = ur.findAll(); 
		 * list1.forEach(e -> { System.out.println(e); });
		 * 
		 */	
		
	}

}
