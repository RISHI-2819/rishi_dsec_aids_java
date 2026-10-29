1.SUM OF DIAGONAL:

import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc= new Scanner( System.in);
        int a[][]= new int[3][3];
        System.out.println(" enter the element");
        int sum=0;
        for( int i =0; i<3;i++){
            for(int j=0; j<3; j++){
                a[i][j]=sc.nextInt();
            }
        }
        for( int i=0;i<3;i++){
         sum = sum + a[i][i];
        }
        System.out.print(" digonal sum:"+sum);
    }
}

2.TRANSPOSING ARRAY:


import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner( System.in);
        int a[][]= new int[2][3];
        System.out.println(" enter the element");
        for( int i =0; i<2;i++){
            for(int j=0; j<3; j++){
                a[i][j]=sc.nextInt();
            }
        }
        for( int i = 0;i < 3; i++){
            for(int j = 0;j < 2; j++){
        System.out.print( a[j][i] +" ");
        }
        System.out.println();
        }
         sc.close();
    }
}

IDENTITY MATRIX:

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        boolean identity= true;
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                a[i][j]= sc.nextInt();
            }
        }

PALLINDROME 

    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        if (s.equalsIgnoreCase(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
FINDING LENGTH OF THE STRING:

import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Eneter the String : ");
        String name=sc.nextLine();
            int len=name.length();
        System.out.print(len);
    }
}
REVERSING THE STRING:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = sc.nextLine();
        String rev = " ";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
            System.out.print(rev);
    }
}

        for( int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if (i == j && a[i][j] != 1){
                    identity = false;
                }
                else if (i != j && a[i][j] != 0){
                    identity=  false;
                }
            }
        }
        if (identity){
            System.out.print(" identity matrix");
        }else{
            System.out.print("not identity matrix");
        }
    }
}

    
