import java.util.*;

public class StudentGradeCalculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[]args) {
        System.out.println("Enter you marks of each subject out of 100 accordingly");


        int marks[] = new int[6];
        int i;
        float total = 0, avg;


        for (i = 0; i < 6; i++) {
            System.out.print("Enter Marks of Subject" + (i + 1) + ":");
            marks[i] = sc.nextInt();
            total = total + marks[i];

        }
            int avgPercentage = (int) (total / 6);

            System.out.println("Total marks obtained:" + total);
            System.out.println("Average Percentage : " + avgPercentage);

            System.out.print("Grade:");
            if (avgPercentage >= 90) {
                System.out.println("A");
            } else if (avgPercentage >= 80) {
                System.out.println("B");
            } else if (avgPercentage >= 70) {
                System.out.println("C");
            } else if (avgPercentage >= 60) {
                System.out.println("D");
            } else if (avgPercentage >= 50) {
                System.out.println("E");
            } else {
                System.out.println("F");
            }
        }
    }

