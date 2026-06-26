import java.util.*;
public class conditionGrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = sc.nextInt();

        if(marks<=100 && marks>=90){
            System.out.println("MARKS="+marks+" AND GRADE = 'A+'");
        }
        else if(marks<=90 && marks>=80){
            System.out.println("MARKS="+marks+" AND GRADE = 'B+'");
        }
        else if(marks<=80 && marks>=70){
            System.out.println("MARKS="+marks+" AND GRADE = 'B'");
        }
        else if(marks<=70 && marks>=60){
            System.out.println("MARKS="+marks+" AND GRADE = 'C'");
        }
        else if(marks<=60 && marks>=50){
            System.out.println("MARKS="+marks+" AND GRADE = 'D'");
        }
        else if(marks<=50 && marks>=40){
            System.out.println("MARKS="+marks+" AND GRADE = 'E'");
        }
        else{
            System.out.println("MARKS="+marks+" AND GRADE = 'FAIL'");;
        }
        sc.close();
    }
}
