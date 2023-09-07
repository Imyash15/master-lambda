package work;

public class Main {
    public static void main(String[] args) {

//        MyInter i=()-> System.out.println("this is first lambda Expression");
//
//        i.sayHello();

//        SumInter sumInter= (a,b)->a+b;
//
//        System.out.println(sumInter.sum(6,9));

        LengthInter lengthInter=str ->str.length();
        System.out.println(lengthInter.getLength("this is it"));
    }
}
