/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amyqk
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age = 51; 
        String name="dad";
        
        int tween = 12;
        int teen = 19;
        int adult = 50;
        int senior = 200;
       
        /*if (age <= tween)
            System.out.print(name+" = Tween");
        else if (age <= teen)
            System.out.print(name+" = Teen");
        else if (age <= adult)
            System.out.print(name+" = Adult");
        else
            System.out.print(name+" = Senior");*/
        
        int A = 93;
        int A_minus = 90;
        int B_plus = 88;
        int B = 83;
        int B_minus = 80;
        int C_plus = 78;
        int C = 73;
        int C_minus = 70;        
        int D_plus = 68;
        int D = 63;
        int D_minus = 60;
        int F = 0;
        
        int grade = 87;
        String studentName = "Bob";
        
        if (grade >= A)
            System.out.println(studentName + "'s grade is an A !");
        else if (grade >= A_minus)
            System.out.println(studentName + "'s grade is an A- !");        
        else if (grade >= B_plus)
            System.out.println(studentName + "'s grade is a B+ !");
        else if (grade >= B_plus)
            System.out.println(studentName + "'s grade is a B+ !");
        else if (grade >= B)
            System.out.println(studentName + "'s grade is a B !");
        else if (grade >= B_minus)
            System.out.println(studentName + "'s grade is a B- !");
        else if (grade >= C_plus)
            System.out.println(studentName + "'s grade is a C+ !");
        else if (grade >= C)
            System.out.println(studentName + "'s grade is a C !");
        else if (grade >= C_minus)
            System.out.println(studentName + "'s grade is a C- !");
        else if (grade >= D_plus)
            System.out.println(studentName + "'s grade is a D+ !");
        else if (grade >= D)
            System.out.println(studentName + "'s grade is a D !");
        else if (grade >= D_minus)
            System.out.println(studentName + "'s grade is a D- !");
        else
            System.out.println(studentName + "has failed.");
    }
    
}
