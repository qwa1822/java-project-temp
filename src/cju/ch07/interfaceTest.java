package cju.ch07;

import java.util.Scanner;

class A{
    public void method(I i){ 
        i.method();  //인터페이스 I를 구현한 넘들만 들어와라
    }


}
//B클래스의 선언과 구현을 분리
interface I{
    public void method();
}



class B implements I{
    public void method(){
        System.out.println("B클래스의 메서드");
    }
}



class C implements I{
    public void method(){
        System.out.println("B클래스의 메서드");
    }
}



public class interfaceTest {
    public static void main(String[] args) {


        //개발 시간을 단축할 수 있다.
        // 변경에 유리한 유연한 설계가 가능하다
        //표준화가 가능하다.
        //서로 관계없는 클래스들을 관계를 맺어 줄수있다.
        //-> 서로 상속관계에 있지도않고, 같은 조상클래스를 가지고 있지않은 서로 아무런관계도없는
        //클래스들에게 하나의인터페이스를 공통적으로 구현함으로써 관계를 맺어줄수있다.


        A a=new A();
        a.method(new C()); //A가 b를 사용(의존)

    }
}
