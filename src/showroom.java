import java.util.Scanner;

public class showroom{
  static String name;
  static long mobno;
  static double cost;
  static double dis;
  static double amt;
  public static void input(String name,long mobno,double cost){
    System.out.println(" customer: "+name + " mobile number: "+mobno + " cost: "+cost);

  }
  public static void calculate(double dis,double amt,double cost){

    
    if (cost<=10000){
        dis = cost*0.05;
        amt=cost - dis;
    }
    else if (cost>=10000 && cost<=20000) {
        dis = cost*0.10;
        amt=cost - dis;
    } 
    else if(cost>=20000 && cost<=35000) {
        dis = cost*0.15;
        amt=cost - dis;
    }
    else if(cost>=35000) {
        dis = cost*0.20;
        amt=cost - dis;
        }
    System.out.println("Discount: "+dis+" amount " +amt );

  }
  public static void main(String[] args) {
    double costjoe  = 20000;
    input("joe",81111111,costjoe);
    
    calculate(dis,amt,costjoe);

}
}

