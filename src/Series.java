import java.util.Scanner;

public class Series {
    int n,x ,y,Snum ;
    Series(int number_of_terms){
        n = number_of_terms ;
        Snum =1;
    }
    Series(int number_of_terms,int value_x){
        n = number_of_terms ;
        x = value_x;
        Snum = 2;

    }
    Series(int number_of_terms,int value_x,int power){
        n = number_of_terms ;
        x = value_x;
        y = power;
        Snum = 3;


    }
    double calculateSeries(){
        double sum = 0.0 ;
        double power_term;
        int fact = 1 ;
        if (Snum == 1){
            for (int i = 1 ; i <=n , i++){
                fact = fact *i;
                sum = fact*i;

            }
        else if (Snum ==2 ) {
            for (int j = 0; j <= n; j++) {
                power_term = Math.pow(x, j);
                fact = fact *j;
                sum = sum + (fact/power_term);
            }

            
        }else{
            for (int j = 0; j <=n; j++) {
                power_term = Math.pow(x, y);
                fact = fact *j;
                sum = sum + (fact/power_term);
            }
        }
        return sum ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms");
        int a = sc.nextInt();
        System.out.println("enter the value of x");
        int b = sc.nextInt();
        System.out.println("enther the power");
        int c = sc.nextInt();
        
    }
}
