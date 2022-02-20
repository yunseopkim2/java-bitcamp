package member.controller;

import member.domain.BmiDTO;
import member.service.MemberService;
import member.service.MemberServiceImpl;

import java.security.Provider;
import java.util.Scanner;

/**
 * packageName: com.example.basic.controller
 * fileName   : DemoController
 * author     : kimyunseop
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-01-27   yunseopkim        최초 생성
 */
public class MemberController {
    public void execute(Scanner scanner) {
        MemberService service = new MemberServiceImpl();
        while (true) {
            System.out.println("메뉴 선택");
            String menu =  "0.Exit 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String res = "";
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit"); return;
                case "1" :
                    System.out.println(BmiDTO.BMI_APP + "\n이름 + 키 + 몸무게");
                    BmiDTO b = BmiDTO.getInstance();
                    b.setName(scanner.next());
                    b.setHeight(scanner.nextInt());
                    b.setWeight(scanner.nextInt());
                    res= service.getBmi(b);break;


            }
        }
    }
}