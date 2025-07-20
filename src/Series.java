import java.util.Scanner;
//// series 1 : 1! + 2! + . . . n! takes only one input
// series 2: 1!/x + 2!/x^2 + 3!/x^3 . . . n!/x^n. takes two inputs 
// series 3: 1!/x^k + 2!/x^k + 3!/x^k . . . n!/x^k. takes three inputs.
public class Series {
    int n,x ,k,series_num ;
    Series(int number_of_terms){
        n = number_of_terms ;
        series_num =1;
    }
    Series(int number_of_terms,int value_x){
        n = number_of_terms ;
        x = value_x;
        series_num = 2;

    }
    Series(int number_of_terms,int value_x,int power){
        n = number_of_terms ;
        x = value_x;
        k = power;
        series_num = 3;


    }
    double calculateSeries(){
        double sum = 0.0 ;
        double power_term;
        int fact = 1 ;
        if (series_num == 1){
            for (int i = 1 ; i <=n ; i++){
                fact = fact *i;
                sum = sum + fact;

            }
        }
        else if (series_num ==2 ) {
            for (int i = 1; i <= n; i++) {
                power_term = Math.pow(x, i);
                fact = fact *i;
                sum = sum + (fact/power_term);
            }

            
        }else{
            for (int i = 1; i <=n; i++) {
                power_term = Math.pow(x, k);
                fact = fact *i;
                sum = sum + (fact/power_term);
            }
        }
        return sum ;

    }
    
    public static void main(String[] args) {
        System.out.println("enter the number of terms");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter the value of x");
        int b = sc.nextInt();
        System.out.println("enter the power");
        int c = sc.nextInt();
        Series series_1 = new Series(a);
        Series series_2 = new Series(a,b);
        Series series_3 = new Series(a,b,c);

        double result1, result2, result3;
        result1 = series_1.calculateSeries();
        result2 = series_2.calculateSeries();
        result3 = series_3.calculateSeries();
        System.out.println("some of the series 1: " + result1);
        System.out.println("some of the series 2: " + result2);
        System.out.println("some of the series 3: " + result3);

    }
}
