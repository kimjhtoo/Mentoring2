import java.util.Scanner;

public class Mentoring2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int ff = 0; ff<7; ff++) {
            int a = sc.nextInt();
            if (a <= 100 && a >= 90) {
                System.out.println("A");
            } else if (a <= 89 && a >= 80) {
                System.out.println("B");
            } else if (a <= 79 && a >= 70) {
                System.out.println("C");
            } else if (a <= 69 && a >= 50) {
                System.out.println("D");
            } else if (a <= 49) {
                System.out.println("F");
            }
        }

    }
    }
