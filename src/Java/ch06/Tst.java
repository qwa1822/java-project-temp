package Java.ch06;

public class Tst {
    public static void main(String[] args) {

        Order o1=new Order();
        o1.OrderNumber=202020;
        o1.phoneNumber=01023450001;
        o1.address="서울시 강남구 역삼동 111-333";
        o1.date=20201102;
        o1.time=130258;
        o1.Orderprice=35000;
        o1.menuNumber=0003;

        System.out.println(o1.showInfo());


        Human n1=new Human(180,78.0,"Tomas",37);
        System.out.println(n1.showInfOo());

    }
}
