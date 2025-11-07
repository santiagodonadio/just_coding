import java.util.Scanner;

public class helloworld {                       

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        int number_of_times;

        System.out.print("Enter a number: ");
        number_of_times = scnr.nextInt();

        System.out.println(number_of_times + " is what you entered");
        
    }



    
}