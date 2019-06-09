package com.slokam.pack1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WhatsAppTest {
	public static WhatsAppPojo insertionData() {
		WhatsAppPojo insertionData = new WhatsAppPojo(1, "veera", "veera@gmail.com");
		return insertionData;
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(WhatsAppConfiguration.class);
		// getting the values for static method
		@SuppressWarnings("unused")
		WhatsAppPojo whatsAppPojo = WhatsAppTest.insertionData();
		WhatsAppController whatsAppController = (WhatsAppController) applicationContext.getBean("whatsappcontroller");
		// whatsAppController.saveWhatsAppData(whatsAppPojo);
		// whatsAppController.updateWhatsAppData(whatsAppPojo);
		// whatsAppController.deleteWhatsAppData(whatsAppPojo);
		// WhatsAppPojo whatsAppPojo2 =
		// whatsAppController.getByIdWhatsAppData(1);
		// System.out.println(whatsAppPojo2);

		List<WhatsAppPojo> list = whatsAppController.getAllData();
		for (WhatsAppPojo whatsAppPojo2 : list) {
			System.out.println("=============");
			System.out.println(whatsAppPojo2);
			System.out.println("=============");
		}
	}

}
