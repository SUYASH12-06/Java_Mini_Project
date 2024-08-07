import java.util.*;
public class javaminiproject {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int myNumber=(int)(Math.random()*100);   //Math.random() gives no in range of 0.0 to 1.0 ,multiplied with 100 so random no will be in btwn 100
        int userNumber=0;

        do{
            System.out.println("Guess your number (1-100): ");
            userNumber=sc.nextInt();
            if(userNumber==myNumber){
                System.out.println("Great! You are correct");
                break;
            }
            else if(userNumber>myNumber){
                System.out.println("Your number is too large!");
            }
            else{
                System.out.println("Your number is too small!");
            }
        }while(userNumber>=0);

        System.out.print("My number was: ");
        System.out.println(myNumber);

        
    }
}
