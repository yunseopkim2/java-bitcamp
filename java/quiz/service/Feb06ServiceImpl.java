package quiz.service;

public class Feb06ServiceImpl implements Feb06Service{
    @Override
    public void quiz1(String[] arr) {
        System.out.println("Q1. 팀별 과제를 출력하세요.");

        String s = "";
        for(int i = 0; i< arr.length; i++){
            if(i % 5 ==0){
                s+= i + ":" + arr[i] + "\t";
            }
            System.out.println(s);
        }
    }

    @Override
    public void quiz2(String[] arr) {
        String s = "";

        System.out.println("Q2. 팀장이 맡은 과제만 출력하세요.");
        String b = "김윤섭";
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(b)){
                for(int j = 0; j<4; j++){
                    s += arr[i + j + 5] + ",";
                }
                if(i==18){break;}
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz3(String[] arr) {
        String s= "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        String c = "큐";
        for(int i = 0; i<arr.length; i++){
            if(arr[i].equals(c)){
                s = arr[i] + "담당한 사람" + arr[i%5];
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz4(String[] arr) {
        System.out.println("Q4. 팀원별 과제 수를 출력하세요.");
        String s = "";
        int[] inArr = new int[5];
        int[] resArr = new int[5];
        for (int i = 0; i<arr.length; i++){
            int a = i%5;
            for(int j = 0; j<5; j++){
                if(a==j){
                    inArr[j]++;
                }
                resArr = inArr;
            }
        }
for(int i = 0; i<5; i++){
    System.out.println(arr[i]+"("+resArr[i]+"개),");
}
    }
}
