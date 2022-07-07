package cju.ch07;


import java.util.Scanner;


class Car{
    String color;
    int door;


    void drive(){
        System.out.println("drive , Brrrr");
    }

}
class FireEngine extends Car{

    void stop(){
        System.out.println("water!!!");
    }

    void water(){
        System.out.println("water");
    }
}


public class 다형성 {

    public static void main(String[] args) {


        // 사용할수있는 멤버의 갯수를 조절하는것
        // 조상 자손관계의 참조변수는 서로 형변환가능

    Car c=new Car();
    FireEngine fe=(FireEngine) c;
    fe.water(); //컴파일





    }
}

