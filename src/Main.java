import java.util.Scanner;

public class Main {

    public static void main(String[] args) {















        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String userName = scanner.nextLine();
        System.out.print("Last name: ");
        String userLastName = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Your Name is "+userName+
                " "+ userLastName+" and you are "+ age+ " years old" );

















    }
}