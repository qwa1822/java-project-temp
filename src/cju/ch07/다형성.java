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

    Car car=null;
    FireEngine fe=new FireEngine();  //실제 인스턴스가 무엇인지가 중요.

    FireEngine fe2=(FireEngine)car; // 조상->자손으로 형변환
        Car car2=(Car)fe2;   //자손-->조상

        car2.drive();





    }
}

