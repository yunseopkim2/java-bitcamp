package member.service;

import member.domain.*;

import static member.domain.UserDTO.PASSWORD;
/**
 * packageName: com.example.basic.service
 * fileName   : StudentServiceImpl
 * author     : kimyunseop
 * date       : 2022-02-22
 * desc       :
 * ================================
 * DATE      AUTHOR        NOTE
 * ================================
 * 2022-02-22   yunseopkim        최초 생성
 */
public class MemberServiceImpl implements MemberService{
    /**
     * BMI = w / t * t
     * 고도 비만 : 35 이상
     * 중(重)도 비만 (2단계 비만) : 30 - 34.9
     * 경도 비만 (1단계 비만) : 25 - 29.9
     * 과체중 : 23 - 24.9
     * 정상 : 18.5 - 22.9
     * 저체중 : 18.5 미만
     * */
    @Override
    public String getBmi(BmiDTO bmi) {
        double BMI = bmi.getWeight() / (bmi.getHeight() * bmi.getHeight()) * 10000;
        String s = "";
        if (BMI >= 35) {
            s = "고드 비만";
        } else if (BMI >= 30) {
            s = "중(重)도 비만 (2단계 비만)";
        } else if (BMI >= 25) {
            s = "경도 비만 (1단계 비만)";
        } else if (BMI >= 23) {
            s = "과체중";
        } else if (BMI >= 18.5) {
            s = "정상";
        } else if (BMI < 18.5) {
            s = "저체중";

        }
        return bmi.getName()+" : "+s;
    }

    @Override
    public String getCalc(CalcDTO calc) {
        int res = 0;
        switch (calc.getOpcode()) {
            case "+":
                res = calc.getNum1() + calc.getNum2();
                break;
            case "-":
                res = calc.getNum1() - calc.getNum2();
                break;
            case "*":
                res = calc.getNum1() * calc.getNum2();
                break;
            case "/":
                res = calc.getNum1() / calc.getNum2();
                break;
        }
        return String.format("%d %s %d = %d ", calc.getNum1(), calc.getOpcode(), calc.getNum2(), res);
    }

    @Override
    public String getGoogle(GoogleDTO google) {
        return String.format("%s을(를) 검색한 결과입니다.", google.getSearch());
    }

    @Override
    public String getGrade(GradeDTO grade) {
        int total = grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String pass = (avg >= 60) ? "합격" : "불합격";

        return String.format("* ########## %s ########\n" +
                        " * 이름: %s\n" +
                        " * > 국어: %d점\n" +
                        " * > 영어: %d점\n" +
                        " * > 수학: %d점\n" +
                        " * 총점: %d점\n" +
                        " * 평균(정수): %d점\n" +
                        " * 합격여부: %s\n" +
                        " * #######################", GradeDTO.GRADE_APP,
                grade.getName(), grade.getKor(), grade.getEng(), grade.getMath(),
                total,
                avg,
                pass);
    }

    @Override
    public String getUser(UserDTO login) {
        return (login.getPw().equals(PASSWORD)) ?
                String.format("%s님 환영합니다. 로그인 성공", login.getName())
                :
                String.format("%s님의 비번 %s 가 틀립니다. 로그인 실패", login.getId() , login.getPw());
    }
    }


