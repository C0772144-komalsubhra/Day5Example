package com.lambton;

import java.util.Scanner;

public class Airthmetic {

   int a,b,c;
   Scanner sc=new Scanner(System.in);
    public static void sum1(int a,int b){
        int sum=0;
        a =20;
        b=30;
        sum=a+b;
    }
    public static void sum2(int a,int b,float c) {
        float sum = 0;
        a=20;
        b=30;
        c= (float) 20.5;
        sum=a+b+c;
    }
    public static void sum3(float a,float b){
        float sum=0;
        a=20.5f;
        b=30.5f;
        sum=a+b;
    }
    public static void sum4(String a,String b) {
        String sum= String.valueOf(0);
        a="komal";
        b="sharma";
        sum=a+b;
    }
    public static void sum5(String a,int b) {
        int sum = 0;
        a="komal";
        b=30;
        sum= Integer.parseInt(a+b);
    }
    public static void sum6(int a,int b,int c) {
        int sum=0;
        a=20;
        b=30;
        c=40;
        sum=a+b+c;

    }
    public static void sum7(int a,int b,float c) {
        int sum=0;
        a=20;
        b=30;
        c=40;
        sum= (int) (a+b+c);

    }




}
