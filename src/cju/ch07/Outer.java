package cju.ch07;





class Outer1{
    private int iv=0;
    protected  static int cv=0;
    final static int CONST=100;



    static class StaticInner{
        int iv=200;
        static int cv=200;
    }
}




public class Outer {






    public static void main(String[] args) {






        //객체생성 없이 사용가능.
        //static 내부클래스에서 static을 선언해줘야함.
    }
}
