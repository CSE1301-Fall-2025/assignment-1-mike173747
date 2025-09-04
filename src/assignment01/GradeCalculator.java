import java.util.Scanner;

public class GradeCalculator {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.next () ;
       
        System.out.println("How many studios have you attended?");
        int studiosAttended = in.nextInt ();
        Double wsg = (15.0 * studiosAttended)/8.0 ;
        double wsgf = Math.round((wsg * 100.0)/ 100.0 );

        System.out.println("What is your quiz grade on average?");
        Double averageQuizGrade = in.nextDouble();
        Double waqg = (25.0 * averageQuizGrade)/100.0;
        double waqgf = Math.round((waqg * 100.0)/ 100.0 );


        System.out.println("What is your exam grade on average?");
        Double averageExamGrade = in.nextDouble();
        Double waeg = (60.0 * averageExamGrade)/100.0 ;
        double waegf = Math.round((waeg * 100.0)/ 100.0 );


        double totalgrade = Math.round(wsg + waqg + waeg);
        System.out.println("CSE Grade for:   " + name);
        System.out.println("Number of studios attended:   "  + studiosAttended);
        System.out.println(" Weighted studio grade (out of 15):   " + wsgf + "%"); 
        System.out.println("Average quiz grade:   "  + averageQuizGrade);
        System.out.println( " Weighted average quiz grade (out of 25):   " + waqgf + "%");
        System.out.println("Average exam grade:   "  + averageQuizGrade);
        System.out.println( " Weighted average exam grade (out of 60):   " + waegf + "%");
        System.out.println("Final Grade:   " + totalgrade + "%");




    }

}
