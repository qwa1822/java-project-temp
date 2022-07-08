package cju.ch07;

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


        A a=new A();
        a.method(new C()); //A가 b를 사용(의존)
    }
}
