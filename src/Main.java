import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    System.out.print("Enter your digit : ");
    String input = ConsoleReadLine();

    String outPut = fizzBuzz(Integer.parseInt(input));

    System.out.println(outPut);
    }

    public static String fizzBuzz(int input){

        String result;

        if (input % 3 == 0 && input % 5 == 0){
           result = "FizzBuzz";
        } else if (input % 3 == 0) {
            result = "Fizz";
        } else if (input % 5 == 0) {
            result = "Buzz";
        }else {
            result = String.format("Number is : %s" , input);
        }
        return result;
    }

    public static String ConsoleReadLine(){
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        scanner.close();
        return result;
    }
}


//        1. Takes an integer `n`
//        2. If `n` is divisible by 3 → print `"Fizz"`
//        3. If `n` is divisible by 5 → print `"Buzz"`
//        4. If divisible by both → print `"FizzBuzz"`
//        5. Otherwise, → print `"Number: n"`