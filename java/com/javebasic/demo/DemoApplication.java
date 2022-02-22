package com.javebasic.demo;

import member.controller.MemberController;
import oop.controller.OopController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import quiz.controller.QuizController;

import java.util.Scanner;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		MemberController memberController = new MemberController();
		OopController phoneController = new OopController();
		QuizController quizController = new QuizController();
		System.out.println("Menu\n"+"0.Exit"+" 1.Member"+" 2.Phone"+" 3.Quiz"+" 4.Algorithm");
		switch (scanner.next()){
			case "0" : System.out.println("### Exit ###");return;
			case "1" :
				System.out.println("### Auth ###");
				memberController.execute(scanner);break;
			case "2" :
				System.out.println("### OOP ###");
				phoneController.execute(scanner);break;
			case "3" :
				System.out.println("### Quiz ###");
				quizController.execute(scanner);break;
			case "4" :
				System.out.println("### Algorithm ###");

				break;

			default: System.out.println("Wrong Number");break;

		}
	}


}
