package member.controller;

import member.domain.*;
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
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();

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
                case "2" :
                    System.out.println(CalcDTO.CALC_APP + "\n 숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = service.getCalc(calc);break;

                case "3" :
                    System.out.println(GoogleDTO.GOOGLE_APP + "\n검색");
                    google.setSearch(scanner.next());
                    res = service.getGoogle(google);
                case "4" :
                    System.out.println("학생 수는 몇명입니다?");
                    GradeDTO a = GradeDTO.getInstance();
                    a.setName(scanner.next());
                    a.setKor(scanner.nextInt());
                    a.setEng(scanner.nextInt());
                    a.setMath(scanner.nextInt());
                    res = service.getGrade(a);break;
                case "5" :
                    System.out.println(UserDTO.LOGIN_APP + "\n아이디, 비번 이름");
                    UserDTO c = UserDTO.getInstance();
                    c.setName(scanner.next());
                    c.setId(scanner.next());
                    c.setPw(scanner.next());
                    res = service.getUser(c); break;
                default:
                    System.out.println("잘못된 입력입니다.");
            }
            System.out.println(res);
        }
    }
}