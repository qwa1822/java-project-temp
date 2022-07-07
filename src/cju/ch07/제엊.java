package cju.ch07;


class StaticTest{
    
    //객체 생성업시 사용가능
    static int width=200;
    static int height=120;


    static{

    }

    static int max(int a, int b){
        return a>b?a:b;
    }
}


public class 제엊 {
    public static final int WIDTH=200;



    public static void main(String[] args) {

        System.out.println("WIDTH"+WIDTH);


    }

}
