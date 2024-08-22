import java.util.Scanner;

class IT24103408Lab4Q3{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

	String result = (number == 0) ? "zero" :(number > 0) ? "Positive" : "Negative" ;

        System.out.print("The number is: " + result);
        
    }

}