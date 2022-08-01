package ch08_01;

import java.util.Arrays;

public class ex01 {
    public static void main(String[] args) {

        int[] numarr={0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(numarr));


        for(int i=0; i<100; i++){
            int n=(int)(Math.random()*10);
            int tmp=numarr[0];
            numarr[0]=numarr[n];
            numarr[n]=tmp;
        }

        System.out.println(Arrays.toString(numarr));
    }

}
