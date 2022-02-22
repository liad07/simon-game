package com.company;
import java.util.*;
public class Main {
public  static Scanner reader=new Scanner(System.in);
    public static void main(String[] args) {
int num;
int num2=1+(int)(Math.random()*(4));
System.out.println("pick color blue/yellow/green/red");
String str= reader.next();
        String str2 = "";

if (str.equals("blue")){
    num=1;
}
        if (str.equals("yellow")){
            num=2;
        }
        if (str.equals("green")){
            num=3;
        }
        if (str.equals("red")){
            num=4;
        }

        if (num2==1){
            str2="blue";
        }
        if (num2==2){
            str2="yellow";
        }
        if (num2==3){
            str2="green";
        }
        if (num2==4){
            str2="red";
        }
        System.out.println("you pick "+str);
        System.out.println("i pick "+str2);
        if (str.equals(str2)){
            System.out.println("you win");
        }
        else {
            System.out.println("you lose");
        }
    }
}
