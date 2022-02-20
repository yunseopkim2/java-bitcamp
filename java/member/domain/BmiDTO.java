package member.domain;
/**
 * packageName:
 * fileName        :
 * author           : kimyunseop
 * date               : 2022-02-19
 * ================================
 *  DATE          AUTHOR       NOTE
 * ================================
 *  2022-02-19   kimyunseop   최초 생성
 */

public class BmiDTO {
    public static String BMI_APP = "BMI";
    private String name;
    private int height;
    private int weight;

    private final static BmiDTO bmiDTO = new BmiDTO();

    private BmiDTO() {
    }

    public static BmiDTO getInstance() {
        return bmiDTO;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}