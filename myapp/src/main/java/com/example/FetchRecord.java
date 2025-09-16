package com.example;
import java.util.Scanner;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class FetchRecord {
    Scanner sc = new Scanner(System.in);
    private JdbcConnector jdc;
     @Autowired
    public FetchRecord(JdbcConnector jdc) {
        this.jdc = jdc;
    }
    public void fetchData(){
       System.out.println("Kindly Enter your Roll no to get your result");
       int id = sc.nextInt();
       System.out.println("all records" +jdc.findRecordsBasedOnId(id));
       
    }
}
