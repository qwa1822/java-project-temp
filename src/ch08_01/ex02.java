package ch08_01;

import java.util.Arrays;

public class ex02 {
    public static void main(String[] args) {

        int[] ball=new int[45];


        for(int i=0; i<ball.length; i++)
            ball[i]=i+1;

            int tmp=0;
            int j=0;


            for(int c=0; c<6; c++){
                j=(int)(Math.random()*ball.length);
                tmp=ball[c];
                ball[c]=ball[j];
                ball[j]=tmp;


            }
            for(int i=0; i<6; i++){
                System.out.printf("ball[%d]=%d\n",i,ball[i]);
            }
    }
}
