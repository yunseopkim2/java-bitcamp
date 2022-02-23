package quiz.service;

import java.util.Scanner;

public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {
        int lotto[] = new int[6];
        for(int i = 0; i<=lotto.length; i++){
            int num = (int)(Math.random()*46)+1;
            lotto[i] = num;
            for(int j = 0; j<i; j++){
                if(lotto[i]==lotto[j]){
                    i--;
                }
            }
        }
            for(int i = 0; i<lotto.length; i++){
                System.out.println(lotto[i]);
            }
    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {
        String [][] seat = new String[7][7];
        String [] list = {"A","B","C","D","E","F","G"};
        for(int i = 0; i< seat.length; i++){
            for(int j = 0; j< seat.length; j++){
                seat[i][j] = " ㅁ ";
            }
        }

    }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void gugudan(Scanner scanner) {

    }
}
