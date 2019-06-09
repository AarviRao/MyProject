package com.slokam.pack1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class WhatsAppController {
	@Autowired
	private WhatsAppService whatsAppService;
	
	public void saveWhatsAppData(WhatsAppPojo whatsAppPojo){
		System.out.println("entered into controller...!");
		whatsAppService.saveWhatsAppData(whatsAppPojo);
		System.out.println("exit from controller...!");
	}
	public void updateWhatsAppData(WhatsAppPojo whatsAppPojo){
		System.out.println("entered into controller...!");
		whatsAppService.updateWhatsAppData(whatsAppPojo);
		System.out.println("exit from controller...!");
	}
	public void deleteWhatsAppData(WhatsAppPojo whatsAppPojo){
		System.out.println("entered into controller...!");
		whatsAppService.deleteWhatsAppData(whatsAppPojo);
		System.out.println("exit from controller...!");
	}
	public WhatsAppPojo getByIdWhatsAppData(int id){
		System.out.println("entered into controller...!");
		WhatsAppPojo whatsAppPojo = whatsAppService.getByIdWhatsAppData(id);
		System.out.println("exit from controller...!");
		return whatsAppPojo;
	}
	public List<WhatsAppPojo> getAllData(){
		List<WhatsAppPojo> list =whatsAppService.getAllData();
		return list;
	}
}
