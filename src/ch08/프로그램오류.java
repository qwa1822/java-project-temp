package ch08;

public class 프로그램오류 {
    public static void main(String[] args) {

        System.out.println(1);
        System.out.println(2);

        try{
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);
        }catch(ArithmeticException e){
            System.out.println("true");
            System.out.println("ArithemticException");
        } catch(Exception e){
            System.out.println("Exception");
            
            //모든 예외처리
        }
        System.out.println(6);
    }
}
