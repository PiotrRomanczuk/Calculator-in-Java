import java.util.Scanner;

public class Main {

    int a = 0;

    public static void main(String[] args) {
        int b = 1;
        int c = b;

        // System.out.println(a);
        System.out.println(b);
        System.out.println(c + 1);

        // Making a var scan wjich is a Scanner method
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a pokemon 1:");
        String pokemon1 = scan.nextLine();
        System.out.println(pokemon1);

        //
        scan.close();
    }
}
