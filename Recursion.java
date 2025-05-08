


// print numbers in increasing order from 1 to n;

import java.util.Scanner;
public class Recursion{

public static void printInc(int n){

if(n==1){

System.out.println(n);
return;
}
printInc(n-1);
System.out.println(n+" ");
}

public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int n=sc.nextInt();

printInc(n);

}

}