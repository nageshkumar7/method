// public class Methods {
        
//     public static void main(String[] args) {
//         System.out.println("message1");
//         sayHi();
//         System.out.println("message2");
//     }
//     public static void sayHi(){
//         System.out.println("hello Nagesh");
//     }
// }

//EXAMPLE2
// public class Methods {

//     public static void main(String[] args) {
//         System.out.println("message1");
//         sayHi("Hello");//parameter
//         System.out.println("message2");
//     }
//     public static void sayHi(){//no parameter thats way error
//         System.out.println("Hi");

//     }
// }

//EXAMPLE2
// public class Methods {

//     public static int sum(int x,int y){
//         int sum=x+y;
//         return sum;
//     }
//     public static int sum(int x,int y){
//         return x+y;
//     }
//     public static void main(String[] args) {
//         System.out.println("message1");
//         sum(1,2);
//         System.out.println("message2");
//     }
//     public static int sum(int x,int y);
//         return x+y;
//     }
// }

//EXAMPLE3
// public class Methods {

//     static int add(int a,int b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         int result=add(10,20);
//         System.out.println(result);
//     }
// }

//EXAMPLE4
// public class Methods {

//     public static void main(String[] args) {
//         int x=1;
//         increment(x);
//         System.out.println(x);
//     }
//     public static void increment(int x){
//         x++;
//         System.out.println(x);
//     }
// }

//METHOD OVERLOADING
//EXAMPLE5
// public class Methods {
//         static void add(int a, int b){
//             System.out.println(a+b);
//         }
//         static void add(int a,int b, int c){
//             System.out.println(a+b+c);
//         }
//         public static void main(String[] args) {
//             add(10,20);
//             add(10, 20,30);
//         }
//     }
//EXAMPLE6
// public class Methods {

//     static int add(int a,int b){
//         return a+b;
//     }
//     static int add(int a,int b, int c){
//         return a+b+c;
//     }
//     static double add(double a ,double b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         System.out.println(add(10,20));
//         System.out.println(add(10,20,30));
//         System.out.println(add(10.5,20.5));
//     }
// }

//Question 1 — Method with Return Value

// import java.util.*;
// public class Methods {

//     static int square(int n){
//         return n*n;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int num=sc.nextInt();
//         int result=square(num);
//         System.out.println("Square="+result);
//         sc.close();
//     }
// }

//Question 2 — Method with Parameters + Return Value

// import java.util.*;
// public class Methods {

//     static int add(int a,int b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a first number:");
//         int num1=sc.nextInt();
//         System.out.println("Enter a second number:");
//         int num2=sc.nextInt();

//         int result=add(num1, num2);

//         System.out.println("Sum="+result);
//         sc.close();

//     }
// }

//Question 3 — max() naam ka method banao jo 2 integers receive kare aur bada number return kare.

// import java.util.*;
// public class Methods {

//     static int max(int a,int b){
//         if (a>b) {
//             return a;
//         }
//         else{
//             return b;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner (System.in);
//         System.out.println("enter first number:");
//         int num1=sc.nextInt();

//         System.out.println("Enter second number:");
//         int num2=sc.nextInt();

//         int result=max(num1, num2);
//         System.out.println("maximum number is: "+result);
//     }
// }

//Question 4

// import java.util.*;
// public class Methods {

//     static boolean isEven(int n){
//         return n % 2==0;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int num=sc.nextInt();
//         boolean result=isEven(num);
//         System.out.println("even="+result);
//     }
// }

//factorial

// import java.util.*;

// public class Methods {

//     static int factorial(int n){
//         int fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int num=sc.nextInt();
//         int result=factorial(num);
//         System.out.println("Factorial="+result);
//         sc.close();

//     }

// }

//YE CODE COMPLETE NAHI HAI

// import java.util.*;

// public class Methods {

//     static boolean isPrime(int n){
//         if (n<=1) {
//             return false;
            
//         }
//         for(int i=1;i<=n;i++){
//             if (n%i==0) {
//                 return false;
                
//             }
//             else{
//                 return false;
//             }
//         }
        
//     }
// }

//Reverse Number using Method:

import java.util.*;

public class method {

    static int reverse(int n){
        int rev=0;
        while (n!=0) {
            int digit = n%10;
            rev=rev*10+digit;
            n=n/10;
        } 
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        int result=reverse(num);
        System.out.println("Reverse="+result);
        sc.close();
    }
}   





