package Java.ch06;

public class Order {
    public int OrderNumber;
    public int phoneNumber;
    public String address;
    public int date;
    public int time;
    public int Orderprice;
    public int menuNumber;


    public String showInfo(){
        return "주문접수번호는"+OrderNumber+"주문 핸드폰 번호는"+phoneNumber+
                ",주소는"+address+"주문날짜는"+date+"주문시간은"+time+"주문가격은"+
                Orderprice+",메뉴번호는 "+menuNumber;
    }



}
