package Lesson4.HW;

public class PhoneNumber {

    //HW1
    long num;
    String numType;
    //

    //HW2
    public PhoneNumber(){
        this.numType = "";
    }

    public PhoneNumber(long num, String numType){
        this.num = num;
        this.numType = numType;
    }
    //

    //HW3
    void print(){
        System.out.println(this);
    }

    void changeType(String numType){
        this.numType = numType;
    }

    long getNum(){
        return num;
    }

    @Override
    public String toString(){
        return "Номер абонента " + num + "; тип номера: " + numType;
    }
    public static void main(String[] args) {
        //HW1
        PhoneNumber phoneNumber = new PhoneNumber();
        phoneNumber.num = 8_965_666_33_22L;
        phoneNumber.numType = "Рабочий";
        System.out.println("Номер абонента " + phoneNumber.num + "; тип номера: " + phoneNumber.numType);
        System.out.println(); //для разделения вывода результатов задач
        //

        //HW2
        PhoneNumber phoneNumber1 = new PhoneNumber();
        PhoneNumber phoneNumber2 = new PhoneNumber(8_981_555_33_77L, "Домашний");

        phoneNumber1.num = 8_999_666_88_44L;
        phoneNumber1.numType = "Личный";

        System.out.println(phoneNumber1);
        System.out.println(phoneNumber2);
        System.out.println();//для разделения вывода результатов задач

        //HW3

        phoneNumber2.print();

        System.out.println(phoneNumber2.getNum());

        phoneNumber2.changeType("Пейджер");
        System.out.println(phoneNumber2);
    }
}
