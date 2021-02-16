import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            switch (i) {
                case 1:
                    System.out.println(i + " Very Good! ");
                    break;
                case 2:
                    System.out.println(i + " Good! ");
                    break;
                case 3:
                    System.out.println(i + " Satisfactory ");
                    break;
                case 4:
                    System.out.println(i + " Sufficient ");
                    break;
                case 5:
                    System.out.println(i + " Not Sufficient ");
                    break;
            }
        }


    }
}