package quiz.service;

import java.util.Scanner;

public class Feb07ServiceImpl implements Feb07Service{
    @Override
    public void dice(Scanner scanner) {
        String s = "";
        int num = (int)(Math.random()*6)+1;
        switch (num){
            case 1 : s= "1번";break;
            case 2 : s= "2번";break;
            case 3 : s= "3번";break;
            case 4 : s= "4번";break;
            case 5 : s= "5번";break;
            case 6 : s= "6번";break;
        }
        System.out.println(s);

    }

    @Override
    public void rps(Scanner scanner) {
        int user = (int)(Math.random()*3);
        int com = (int)(Math.random()*3);
        System.out.println(user);
        System.out.println(com);
        String s = "";
        if(user==com) s = "Draw";
        else s = user - com == 1 ? "WIN" : "LOSE" ;
        System.out.println(s);

    }

    @Override
    public void getPrime(Scanner scanner) {
        System.out.println("두 수를 입려하시오.");
        System.out.println("num1");
        int num1 = scanner.nextInt();
        System.out.println("num2");
        int num2 = scanner.nextInt();
        int count = 0;
        for(int i = 0; i <= num2; i++){
            for(int j = 2; j<=i; j++){
                if(i%j ==0){
                    count++;
                }
            }
            if(count==1){
                System.out.println(i+" ");
            }
            count = 0;
        }

    }

    @Override
    public void leapYear(Scanner scanner) {
        int year = scanner.nextInt();
        System.out.println((year % 4 ==0)&&(year % 100 != 0)||(year % 400 ==0)? "윤년입니다" : "평년입니다" );
    }

    @Override
    public void numberGolf(Scanner scanner) {
    int answer = (int)(Math.random()*100)+1;
    int input = 0;

    while(true){
        System.out.println("1~100 자연수 입력");
        input = scanner.nextInt();
        if(answer>input){
            System.out.println("up");
        }else if(answer<input){
            System.out.println("down");
        }else if(answer==input){
            System.out.println("정답");break;
        }else{
            System.out.println("잘못된 입력입니다.");return;
        }
    }
    }
}
