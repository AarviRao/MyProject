package com.slokam.pack1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

public class WhatsAppDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// saving the data
	@Transactional
	public void saveWhatsAppData(WhatsAppPojo whatsAppPojo) {
		System.out.println("entered into dao...!!");
		hibernateTemplate.save(whatsAppPojo);
		System.out.println("exit from dao...!!");
	}

	// update
	@Transactional
	public void updateWhatsAppData(WhatsAppPojo whatsAppPojo) {
		System.out.println("entered into dao...!!");
		hibernateTemplate.update(whatsAppPojo);
		System.out.println("exit from dao...!!");
	}

	// delete
	@Transactional
	public void deleteWhatsAppData(WhatsAppPojo whatsAppPojo) {
		System.out.println("entered into dao...!!");
		hibernateTemplate.delete(whatsAppPojo);
		System.out.println("exit from dao...!!");
	}

	// getById
	@Transactional
	public WhatsAppPojo getByIdWhatsAppData(int id) {
		System.out.println("entered into dao...!!");
		WhatsAppPojo whAppPojo = (WhatsAppPojo) hibernateTemplate.load(WhatsAppPojo.class, id);
		System.out.println("exit from dao...!!");
		return whAppPojo;
	}
	//getAll
	@Transactional
	public List<WhatsAppPojo> getAllWhatsAppData() {
		System.out.println("entered into dao...!!");
		@SuppressWarnings("unchecked")
		List<WhatsAppPojo> whAppPojo = (List<WhatsAppPojo>) hibernateTemplate.find("from WhatsAppPojo");
		System.out.println("exit from dao...!!");
		return whAppPojo;
	}
}
