package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeCalculator {
   Scanner maths = new Scanner(System.in);
   Scanner science = new Scanner(System.in);
   Scanner social = new Scanner(System.in);
   ArrayList<Integer> TotalSubject = new ArrayList<>();
   int TotalMark = 0;
   public void gradeCalculator(){
     System.out.print("Enter your Maths Mark: ");
     int Mamark = maths.nextInt();
     TotalSubject.add(Mamark);
     System.out.print("Enter your science Mark: ");
     int Smark = science.nextInt();
     TotalSubject.add(Smark);
     System.out.print("Enter your social Mark: ");
     int Slmark = social.nextInt();
     TotalSubject.add(Slmark);
     TotalMark = 0;
     for(int mark:TotalSubject){
        TotalMark+=mark;
     }
     double  percentage = Math.round(TotalMark * 0.3);
      if(percentage > 40 && Slmark > 40 && Smark > 40 && Mamark > 40){
        System.out.println("Your Total is "+ TotalMark);
        System.out.println("Your percentage is "+ percentage + "% your passed exam. Great Job!!");
     } else if(percentage > 40 && (Slmark < 40 || Smark < 40 || Mamark < 40)){
        System.out.println("Your Total is "+ TotalMark);
        System.out.println("Your failed beacuse you need score above 40 is all subject");
     }
     else if(percentage < 40){
        System.out.println("Your Total is "+ TotalMark);
        System.out.println("Your percentage is "+ percentage + " % your failed exam. Work Hard!!");
     }
   }
}