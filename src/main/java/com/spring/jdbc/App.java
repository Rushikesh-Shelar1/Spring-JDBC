package com.spring.jdbc;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! My Program Started" );
		// spring jdbc=> JdbcTemplate
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
//
//		JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
//		
//		//insert query
//		
//		String query="insert into student1(id,name,city) value(?,?,?)";
//		
//		//fire query
//		
//		int result=template.update(query,456,"Ramesh Shelar","Pune");
//		System.out.println("number of record inserted..."+result);
        
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
		//INSERT
		Student student = new Student();
		student.setId(666);
		student.setName("John");
		student.setCity("Lucknow");

		int result = studentDao.insert(student);

		System.out.println("student added " + result);
        
		
    }
}
