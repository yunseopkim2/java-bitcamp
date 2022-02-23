package quiz.controller;

import quiz.service.Feb06Service;
import quiz.service.Feb06ServiceImpl;
import quiz.service.Feb07Service;
import quiz.service.Feb07ServiceImpl;

import java.util.Scanner;

public class QuizController {
   public void execute(Scanner scanner){
       Feb06Service feb06Service = new Feb06ServiceImpl();
       Feb07Service feb07Service = new Feb07ServiceImpl();

       while(true) {
           System.out.println("0.Exit 1)2월6일 2)2월7일 3)2월8일 4)2월10일");
           switch (scanner.next()) {
               case "0":
                   System.out.println("### Exit ###");
                   return;
               case "1":
                   System.out.println("2월6일");
                   String[] arr = {"김승현", "김윤섭", "최민서", "한성수", "김태욱",
                           "정렬", "스택", "해시", "힙", "탐욕법",
                           "이분탐색", "큐", "그래프", "깊이우선탐색", "너비우선탐색",
                           "완전탐색", "DP"};
                   System.out.println("[소메뉴]\n 0.Exit \n1.팀별 과제 \n2.팀장이 맡은 과제 \n3.큐를 담당한 사람\n 4.팀원별 과제 수");
                   switch (scanner.next()) {
                       case "0":
                           System.out.println("Exit");
                           return;
                       case "1":
                           System.out.println("### 1.팀별 과제 ###");
                           feb06Service.quiz1(arr);
                           break;
                       case "2":
                           System.out.println("### 2.팀장이 맡은 과제 ###");
                           feb06Service.quiz2(arr);
                           break;
                       case "3":
                           System.out.println("### 3.큐를 담당한 사람 ###");
                           feb06Service.quiz3(arr);
                           break;
                       case "4":
                           System.out.println("### 4.팀원별 과제 수 ###");
                           feb06Service.quiz4(arr);
                           break;
                       default:
                           System.out.println("Wrong Number");
                           break;
                   }
               case "2" :
                   System.out.println("2월 7일");
                   System.out.println("[소메뉴]\n 0.Exit 1.주사위 2. 가위바위보 3. 소수 구하기 4.윤년/평년 5.임의숫자 맞추기");
                   switch (scanner.next()){
                       case "0":
                           System.out.println("### 종료 ###");return;
                       case "1":
                           System.out.println("### 1.주사위 ###");
                           feb07Service.dice(scanner);break;
                       case "2":
                           System.out.println("### 2.가위바위보 ###");
                           feb07Service.rps(scanner);break;
                       case  "3":
                           System.out.println("### 3.소수 구하기 ###");
                           feb07Service.getPrime(scanner);break;
                       case  "4":
                           System.out.println("### 4.윤년/평년 ###");
                           feb07Service.leapYear(scanner);break;
                       case  "5":
                           System.out.println("### 5.임의숫자 맞추기 ###");
                           feb07Service.numberGolf(scanner);break;
                       default:
                           System.out.println("Wrong Number"); break;
                   }
                   break;

           }

       }
}}
