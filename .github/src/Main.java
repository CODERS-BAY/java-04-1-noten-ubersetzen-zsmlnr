import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner grades= new Scanner(System.in);
        int inputGrades= grades.nextInt();

        String notes = switch (inputGrades){
            case 1:
                 yield "Very Good";
            case 2:
                 yield "Good";
            case 3:
                 yield "Satisfactory";
            case 4:
                 yield "Sufficient";
            case 5:
                 yield "Not sufficient";
            default:
                yield ("Unexpected value: "+ inputGrades);
        };
        System.out.println(notes);


    }
}