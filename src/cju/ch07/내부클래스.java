package cju.ch07;




class AAAA{ //AAA는 BBB의 외부클래스
    int i=100;
    BBB b=new BBB();

    class BBB{  ///bbb는 AAA의 내부클래스
        void method(){
//            AAAA a=new AAAA();
//            System.out.println(a.i);
            System.out.println(i);
        }
}


}


public class 내부클래스 {
    public static void main(String[] args) {






    //내부클래스에서 외부클래스의 멤버들을 쉽게 접근할수 있다
        // 코드의 복잡성을 줄일 수 있다(캡슐화)



    }
}
