import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == 1 || i == number || j == 1 || j == number) {
                    System.out.print(number + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
