1.Bubble sort:

public class main{
    public static void main( String[]args){
        int a[]={40,10,30,20};
        for(int i =0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i; j++ ){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
            for( int i=0; i< a.length;i++){
                System.out.print(a[i]+" , ");
        }
    }
}

2.INSERTION SORT:


public class main{
    public static void main( String[]args){
        int a[]={ 40,10,30,20};
        for( int i=0;i<a.length; i++){
                int key=a[i];
                int j=i-1;
                while(j>=0&&a[j]>key){
                    a[j+1]=a[j];
                    j--;
                }
                a[j+1]=key;
            }
            for(int i=0;i<a.length;i++)
                System.out.print(a[i]+" ");
        }
    }


3. SELECTION SORT:

public class Main {
    public static void main(String[] args) {

        int a[] = {40, 10, 30, 20};

        for (int i = 0; i < a.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < a.length; j++) {

                if (a[j] < a[min]) {
                    min = j;
                }
            }

            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}


4.SUM OF ROWS AND COLUMNS:


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][3];
        int sum=0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
                sum=sum+a[i][j];
                System.out.println(" sum:"+sum);
            }
            System.out.println();
        }

        sc.close();
    }
}


5. 2 DIMENSIONAL ARRAYS:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int a[][] = new int[row][col];

        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

6.SUM OF ROWS:
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int a[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            int sum = 0;

            for (int j = 0; j < col; j++) {
                sum = sum + a[i][j];
            }

            System.out.println("Row " + (i + 1) + " Sum = " + sum);
        }

        sc.close();
    }
}

7.ARRAY TO LEFT POSITION

public class Main {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};

        int temp = a[0];

        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

        a[a.length - 1] = temp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

8.ROTATE TO LEFT POSTION:

public class Main {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};

        int temp = a[a.length - 1];

        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = temp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
