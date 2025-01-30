import java.util.Scanner;

public class whileReview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade = 0;
        double sum = 0;
        double count = 0;
        while (grade >= 0) {
            System.out.print("Enter a grade 0-110: ");
            grade = input.nextDouble();
            if (grade >= 111) {
                System.out.println("You are invalid!");
            }
            else {
                sum += grade;
                count++;
                System.out.println("Your grade is " + grade);
                System.out.println("The average is " + sum/count);
            }

        }
    }
}