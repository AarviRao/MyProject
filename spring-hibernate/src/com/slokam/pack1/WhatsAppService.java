package com.slokam.pack1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class WhatsAppService {
	@Autowired
	private WhatsAppDao whatsAppDao;
	
	public void saveWhatsAppData(WhatsAppPojo whatsAppPojo){
		System.out.println("entered into service...!");
		whatsAppDao.saveWhatsAppData(whatsAppPojo);
		System.out.println("exit from service...!");
	}
	public void updateWhatsAppData(WhatsAppPojo whatsAppPojo){
		System.out.println("entered into service...!");
		whatsAppDao.updateWhatsAppData(whatsAppPojo);
		System.out.println("exit from service...!");
	}
	public void deleteWhatsAppData(WhatsAppPojo whatsAppPojo){
		System.out.println("entered into service...!");
		whatsAppDao.deleteWhatsAppData(whatsAppPojo);
		System.out.println("exit from service...!");
	}
	public WhatsAppPojo getByIdWhatsAppData(int id){
		System.out.println("entered into service...!");
		WhatsAppPojo whatsAppPojo =whatsAppDao.getByIdWhatsAppData(id);
		System.out.println("exit from service...!");
		return whatsAppPojo;
	}
	public List<WhatsAppPojo> getAllData(){
		List<WhatsAppPojo> list =whatsAppDao.getAllWhatsAppData();
		return list;
	}
}
