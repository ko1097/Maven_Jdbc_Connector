package com.example;

import java.util.Random;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        // Random rand = new Random();
        // int a = rand.nextInt(50) + 1;         // 1-50
        // int b = rand.nextInt(10) + 1; 
        // Calculator calc = new Calculator();
        // int addition_result = calc.add(a, b);
        // int multiplication_result = calc.multiply(a, b);
        // int subrtaction_result = calc.subrtact(a, b);
        // int division_result = calc.division(a, b);
        // System.out.println( addition_result +" ==> addition_result" );
        // System.out.println( subrtaction_result +" ==> subrtaction_result" );
        // System.out.println( multiplication_result + " ==> multiplication_result");
        // System.out.println( division_result + " ==> division_result");
        // SpringApplication.run(App.class, args);

        // // NumberGame game = new NumberGame();
        // // game.letStart();
        // // StudentGradeCalculator gradeCalc = new StudentGradeCalculator();
        // // gradeCalc.gradeCalculator();
        }
      @Bean
        public CommandLineRunner run(FetchRecord fetchRecord) {
            return args -> {
                fetchRecord.fetchData(); // Spring injects FetchRecord and JdbcConnector
            };
        }

}

