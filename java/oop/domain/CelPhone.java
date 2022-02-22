package oop.domain;

public class CelPhone extends Phone{
    protected boolean potable;
    protected String move;

    public CelPhone(String kind, String company, String move){
        super(kind, company);
        this.move = move;
    }

    public boolean isPotable() {
        return potable;
    }

    public void setPotable(boolean potable) {
        this.potable = potable;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return String.format("%s 인 제품을 사용해서 %s라고 통화한다.", super.getKind(),
                super.getCompany(),super.getCall(),move);
    }
}
