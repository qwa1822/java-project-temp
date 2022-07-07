package JavaFull;

import java.util.Scanner;

public class javaex02 {
    public static void main(String[] args) {

        double x;
        double y;
        double z;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter side x:" );
        x=sc.nextDouble();
        System.out.println("Enter side y:" );
        y=sc.nextDouble();


       z=Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenuse is:"+z);

        sc.close();

        //Math.sqrt 숫자의 제곱근을 반환하는것
        //삼각형의 빗변을 찾는 프로그램
        //빗변*빗변 ===
    }
}
