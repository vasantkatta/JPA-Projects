package com.vasant;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.vasant.entity.Customer;
import com.vasant.repo.CustomerRepository;

//@RunWith(SpringRunner.class)
@SpringBootTest
class CustomerDataApplicationTests {

	
	@Autowired
	CustomerRepository repo;

	@Test
	void contextLoads() {
	}
	
	@Test
	public void createTest()
	{
		
		Customer cust = new Customer();
		cust.setId(1);
		cust.setName("Vasant");
		cust.setEmail("k@gmail.com");
		
		cust.setId(2);
		cust.setName("Ria");
		cust.setEmail("R@gmail.com");
		
		repo.save(cust);
	}
	
	@Test
	public void getDetailsTest()
	{
		
		Customer c = repo.findById(1).get();
		assertNotNull(c);
		assertEquals("Vasant",c.getName());
	
		System.out.println("Get Details : "+c.getName());
	}

	
	@Test
	public void updateTest()
	{
		
		Customer cust = repo.findById(2).get();
		cust.setName("Jay");
		repo.save(cust);
		System.out.println("-----"+cust.getEmail()+"------");
	
	}
	
	@Test
	public void deleteTest()
	{
		
		repo.deleteById(1);
		
	}
	
}
