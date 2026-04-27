// conditional statement

// public class javaBasics{
// public static void main(String args[]){
// int age=16;
// if(age>=18){
// System.out.println("adult:vote ,drive");
// }
// if(age>13 && age <18){
// System.out.println("teenager");
// }
// else{
// System.out.println("not adult");
// }
// }
// }

// //print the largest value of 2

// // public class javaBasics{
// // public static void main (String args[]){
// // int A=1;
// // int B=5;
// // if(A>=B){
// // System.out.println("A is largest of 2");
// // }
// // else{
// // System.out.println("B is the largest of 2");
// // }
// // }
// // }

// //print if a is odd or even( div by 2 or multiple by 2)

// // import java.util.*;
// // public class javaBasics{
// // public static void main(String args[]){
// // Scanner sc = new Scanner(System.in);
// // int number =sc.nextInt();
// // if(number % 2==0){
// // System.out.println("even");

// // }
// // else{
// // System.out.println("odd");
// // }

// // }
// // }

// // Income tax calculatr

// // import java.util.*;
// // public class javaBasics{
// // public static void main(String args[]){
// // Scanner sc=new Scanner(System.in);
// // int income = sc.nextInt();
// // int tax;
// // if(income<500000){
// // tax =0;
// // }
// // else if(income>=500000&& income<1000000){
// // tax=(int)(income*0.2);
// // }
// // else{
// // tax=(int)(income*0.3);
// // }
// // System.out.println("your tax is ="+ tax);

// // }

// // }

// // print the largest of 3

// // public class javaBasics{
// // public static void main(String args[]){
// // int A=1, B=3, C=5;
// // if((A>=B) && (A>=C)){
// // System.out.println("largest is A");

// // }
// // else if (B>=C){
// // System.out.println("largest is B");
// // }
// // else{
// // System.out.println("largest is C");
// // }

// // }
// // }

// // ternary operator

// // switch statement
// // public class javaBasics{
// // public static void main(String args[]){
// // int number=2;
// // switch (number){
// // case 1:System.out.println("samosa");
// // break;
// // case 2:System.out.println("burger");
// // break;
// // case 3:System.out.println("chai");
// // break;
// // default:System.out.println("we wake up");
// // break;
// // }
// // }
// // }

// // Claculator

// import java.util.Scanner;
// public class javaBasics{
// public static void main(String args[]){
// Scanner sc= new Scanner(System.in);
// System.out.println("enter a:");
// int a= sc. nextInt();
// System.out.println("enter b:");
// int b= sc.nextInt();
// System.out.println("enter operator:");
// char operator= sc.next().charAt(0);

// switch (operator){
// case '+':System.out.println(a+b);
// break;
// case '-':System.out.println(a-b);
// break;
// case '*':System.out.println(a*b);
// break;
// case '/':System.out.println(a/b);
// break;
// case '%':System.out.println(a%b);

// }

// }
// }

// Loops
// public class javaBasica{
// public static void main(String args[]){
// int counter =0;
// while(counter <100){
// System.out.println("hello world");
// counter++;
// }
// System.out.println("printer hello world 10x");
// }
// }

// print number from 1 to 10
// import java.util.*;
// public class javaBasics{
// public static void main(String args[]){
// int counter =1;
// while(counter<=10){
// System.out.println(counter);
// counter++;
// }
// }
// }

// print number from 1 to n
// import java.util.*;
// public class javaBasics{
// public static void main(String args[]){
// Scanner sc= new Scanner(System.in);
// int rang=sc.nextInt();
// int counter=1;
// while(counter<=rang){
// System.out.print(counter + " ");
// counter++;
// System.out.print("");
// }
// }
// }

// print sum of first n natural numbers
// import java.util.*;
// public class javaBasics{
// public static void main(String args[]){
// Scanner sc= new Scanner(System.in);
// int n=sc.nextInt();
// int sum=0;

// int i=1;
// while(i<= n){
// sum +=i;
// i++;
// }
// System.out.println("sum is : " +sum);
// }
// }

// for loop
// public class javaBasic{
// public static void main(String args[]){
// for(int i=1; i<=10; i++){
// System.out.println("hello world");

// }

// }
// }

// print square pattern
// public class javaBasic{
// public static void main (String args[]){
// for(int line=1; line<=4; line++){
// System.out.println("****");
// }

// }

// }

// print reverse of a number
// public class javaBasic{
// public static void main (String args[]){
// int n=6721;
// while( n>0){
// int lastDigit =n%10;
// System.out.println(lastDigit + " ");
// n=n/10;
// }
// System.out.println();
// }
// }


//revers the given number
// public class javaBasic{
//     public static void main(String args[]){
//         int n =10899;
//         int rev =0;
//         while(n>0){
//             int lastDigit= n%10;
//             rev =(rev*10)+lastDigit;
//             n =n/10;
//         }
//         System.out.println(rev);
//     }
// } 
