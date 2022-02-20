package member.service;

import member.domain.*;

public interface MemberService {
        String getBmi(BmiDTO bmi);
        String getCalc(CalcDTO calc);
        String getGoogle(GoogleDTO google);
        String getGrade(GradeDTO grade);
        String getUser(UserDTO login);


}

