//package com.test;
//
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.http.HttpStatus;
// 
//import com.MissionManagementApiApplication;
//import com.service.BiographyService;
//import model.Biography;
//
//
//public class Test {
//
//	public static void main(String[] args) {
//		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MissionManagementApiApplication.class);
//
//		BiographyService bs = applicationContext.getBean(BiographyService.class);
//
//		System.out.println("Getting Biograpies:");
//
//		for (Biography b : bs.getBiography(70)) {
//			System.out.println(b);
//		}
//
////		System.out.println("\nGetting person with ID 2");
////
////		Person personById = client.getById(2L);
////
////		System.out.println(personById);
////
////		System.out.println("Adding a Person");
////		Person p = new Person();
////		p.setAge(50);
////		p.setFirstName("David");
////		p.setLastName("Blain");
////		HttpStatus status = client.addPerson(p);
////		System.out.println("Add Person Response = " + status);
//
//		applicationContext.close();
//	}
//}

