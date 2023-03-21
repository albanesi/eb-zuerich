import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib mir die erste Zahl");
        int firstNumber = scanner.nextInt();
        System.out.print("Gib mir die zweite Zahl");
        int secondNumber = scanner.nextInt();
        System.out.println("Was willst du machen");
        System.out.println("Mögliche Eingabemöglichkeiten sind");
        System.out.println("[multiplizieren], [dividieren], [addieren], [subtrahieren]");
        String action = scanner.nextLine();

        if (action.equals("multiplizieren")){
            System.out.println("Das resultat ist"+ firstNumber*secondNumber);
        }else if (action.equals("dividieren")){
            System.out.println("Das resultat ist"+ firstNumber/secondNumber);
        }else if (action.equals("addieren")){
            System.out.println("Das resultat ist"+ firstNumber/secondNumber);
        }else if(action.equals("subtrahieren")){
            System.out.println("Das resultat ist"+ (firstNumber-secondNumber));
        }else{
            System.out.println("Etwas ist schiefgegangen");
        }
    }
}