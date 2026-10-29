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