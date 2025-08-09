import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter your digit : ");
        String input = consoleReadLine();

        for (int i = 0; i <= Integer.parseInt(input); i++) {

            String outPut = fizzBuzz(i);

            System.out.println(outPut);
        }
    }

    public static String fizzBuzz(int input) {

        if (input % 15 == 0) return "FizzBuzz";
        if (input % 3 == 0) return "Fizz";
        if (input % 5 == 0) return "Buzz";
        return String.format("Number is %d", input);
    }

    public static String consoleReadLine() {
        return scanner.nextLine();
    }
}


//        1. Takes an integer `n`
//        2. If `n` is divisible by 3 → print `"Fizz"`
//        3. If `n` is divisible by 5 → print `"Buzz"`
//        4. If divisible by both → print `"FizzBuzz"`
//        5. Otherwise, → print `"Number: n"`