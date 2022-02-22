package oop.controller;

import oop.domain.CelPhone;
import oop.domain.GalPhone;
import oop.domain.IPhone;
import oop.domain.Phone;
import oop.service.PhoneService;
import oop.service.PhoneServiceImpl;

import java.util.Scanner;

public class OopController {
    public void execute(Scanner scanner) {
        System.out.println("Menu\n" + "0.종료\n"
                + "1.은닉화(Encapsulation)\n"
                + "2.상속(Inheritance)\n"
                + "3.추상화(Abstraction)\n"
                + "4.다형성 Polymorphism");
        switch (scanner.next()) {
            case "0":
                System.out.println("종료");
                return;
            case "1":
                System.out.println("POJO 가 은닉화다.");
                break;
            case "2":
                System.out.println("extends 가 상속이다.");
                Phone phone = new Phone("금성전화가", "금성전자");
                CelPhone celPhone = new CelPhone("이동전화", "블랙베리", "이동");
                IPhone iPhone = new IPhone("애플");
                GalPhone galPhone = new GalPhone("삼성");
                PhoneService phoneService = new PhoneServiceImpl();
                System.out.println("[소메뉴 0.exit 1.집전화 2.휴대폰 3.아이폰 4.갤럭시폰]");
                switch (scanner.next()) {
                    case "0":
                        System.out.println("exit");
                    case "1":
                        System.out.println("### 집전화 ###");
                        phone.setCall("여보세여. ***입니다.");
                        phoneService.usePhone(phone);
                        break;
                    case "2":
                        System.out.println("### 휴대폰 ###");
                        celPhone.setCall("여보세여. ***입니다.");
                        phoneService.useCelPhone(celPhone);
                        break;
                    case "3":
                        System.out.println("### 아이폰 ###");
                        iPhone.setSearch("네이버");
                        phoneService.useIPhone(iPhone);
                        break;
                    case "4":
                        System.out.println("### 갤럭시 ###");
                        galPhone.setPay("삼성페이");
                        phoneService.useGalPhone(galPhone);
                        break;
                    default:
                        System.out.println("잘못된 입력입니다.");
                        break;
                }
                break;
            case "3":

        }
    }}
