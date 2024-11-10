import java.util.Scanner;
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kampus, nomorKampus, atlet;
        String namaAtlet;

        System.out.print("Input the number of Polytechnics : ");
        nomorKampus = sc.nextInt();
        sc.nextLine();

        for(kampus=1; kampus<=nomorKampus; kampus++) {
            System.out.println("<<<<< Polytechnic "+nomorKampus+" >>>>>");
            System.out.println();
            System.out.println("=== Input athlete name for Badminton ===");
            for(atlet=1; atlet<=5; atlet++) {
                System.out.print("Athlete "+atlet+" name : ");
                namaAtlet = sc.nextLine();
                System.out.println("Athlete "+atlet+" for Badminton from Polytechnic "+nomorKampus+" is : "+namaAtlet);
            }
            System.out.println();
            System.out.println("=== Input athlete name for Tennis ===");
            for(atlet=1; atlet<=5; atlet++) {
                System.out.print("Athlete "+atlet+" name : ");
                namaAtlet = sc.nextLine();
                System.out.println("Athlete "+atlet+" for Tennis from Polytechnic "+nomorKampus+" is : "+namaAtlet);
            }
            System.out.println();
            System.out.println("=== Input athlete name for Basketball ===");
            for(atlet=1; atlet<=5; atlet++) {
                System.out.print("Athlete "+atlet+" name : ");
                namaAtlet = sc.nextLine();
                System.out.println("Athlete "+atlet+" for Basketball from Polytechnic "+nomorKampus+" is : "+namaAtlet);
            }
            System.out.println();
            System.out.println("=== Input athlete name for Volleyball ===");
            for(atlet=1; atlet<=5; atlet++) {
                System.out.print("Athlete "+atlet+" name : ");
                namaAtlet = sc.nextLine();
                System.out.println("Athlete "+atlet+" for Volleyball from Polytechnic "+nomorKampus+" is : "+namaAtlet);
            }
        }
    }
}
