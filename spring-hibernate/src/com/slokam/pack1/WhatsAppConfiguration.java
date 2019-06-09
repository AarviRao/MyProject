package com.slokam.pack1;

import java.util.Properties;
import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *  1.BasicDataSource
 *  2.LocalSessionFactory
 *  3.SessionFactory 
 *  4.HibernateTransactionManager 
 *  5.hibernateTemplate
 */
@Configuration
@EnableTransactionManagement
public class WhatsAppConfiguration {

	// creating the bean for BasicDataSource
	@Bean
	public BasicDataSource basicDataSource() {
		System.out.println("entered into data source..!!!");
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl("jdbc:mysql://localhost:3306/f23");
		basicDataSource.setUsername("root");
		basicDataSource.setPassword("root");
		basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
		System.out.println("exit from data source..!!!");
		return basicDataSource;
	}

	// creating the bean for LocaSessionFactoryBean
	@Bean
	public LocalSessionFactoryBean localSessionFactoryBean() {
		System.out.println("entered into locasessionfactory..!!!");
		LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
		// setting the dataSource
		localSessionFactoryBean.setDataSource(basicDataSource());
		// setting annotated or entity class
		localSessionFactoryBean.setAnnotatedClasses(WhatsAppPojo.class);

		// setting hibernate properties
		Properties properties = new Properties();
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");

		// setting properties into our local session factory bean
		localSessionFactoryBean.setHibernateProperties(properties);
		System.out.println("exit from locasessionfactory..!!!");
		return localSessionFactoryBean;
	}

	// creating the instance for session factory
	public SessionFactory sessionFactory() {
		System.out.println("entered into sessionfactory..!!!");
		System.out.println("entered into locasessionfactory..!!!");
		return localSessionFactoryBean().getObject();

	}

	// creating the instance for Hibernate transaction manger
	@Bean
	public HibernateTransactionManager hibernateTransactionManager() {
		System.out.println("entered into hibernateTransactionManager..!!!");
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
		// setting sesssion factory into hibernate transaction manager
		hibernateTransactionManager.setSessionFactory(sessionFactory());
		System.out.println("exit from hibernateTransactionManager..!!!");
		return hibernateTransactionManager;
	}

	// creating the instance for Hibernate Template
	@Bean
	public HibernateTemplate hibernateTemplate() {
		System.out.println("entered into hibernateTemplate..!!!");
		HibernateTemplate hibernateTemplate = new HibernateTemplate();
		hibernateTemplate.setSessionFactory(sessionFactory());
		System.out.println("exit from hibernateTemplate..!!!");
		return hibernateTemplate;
	}

	// creating the bean for user defined class or our class
	@Bean
	public WhatsAppDao whatsAppDao() {
		return new WhatsAppDao();
	}

	@Bean
	public WhatsAppService whatsAppService() {
		return new WhatsAppService();
	}

	@Bean(name="whatsappcontroller")
	public WhatsAppController whatsAppController() {
		return new WhatsAppController();
	}
}
