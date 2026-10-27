
1.INSERTION

import java.util.Scanner;
public class main{ 
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
   int a[]=new int[5];
    a[0]=10;
    a[1]=20;
    a[2]=30;
    a[3]=40;
    int n=4;
    System.out.println("enter value");
    int value= sc.nextInt();
    System.out.println("enter index(0 to"+n+"):");
    int pos = sc.nextInt();
    if (pos<0|| pos>n||n==a.length){
        System.out.println("invalid insertion");
    }
    else{
        for( int i=n; i>pos; i--){
            a[i]=a[i-1];
        }
        a[pos]=value;
        n++;
        for( int i=0; i<n; i++){
            System.out.print( a[i]+ " ");
        }
    }
    sc.close();
}
}


2. UPDATION

public class main{
    public static void main( String[]args){
        int a[]={ 10,20,30,40};
        a[1]=99;
        for( int i=0; i<a.length; i++){
            System.out.print( a[i]+"");
        }
    }
}


3. DELETION:

public class main{
    public static void main( String[] args){
        int a[]={10,20,30,40,50};
        int n=5;
        int pos=2;
        for( int i=pos; i<n-1; i++){
            a[i]=a[i+1];
        }
        n--;
        for( int i=0;i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}

4.LINEAR SEARCH:
public class Main {
    public static void main(String[] args) {
        int a[] = {40, 10, 30, 20, 50};
        int key = 20;
        int pos = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                pos = i;
                break;
            }
        }

        if (pos != -1) {
            System.out.println("Found at index " + pos);
        } else {
            System.out.println("Not found");
        }
    }
}


5. BINARY SEARCH :

public class Main {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int key = 20;
        int low = 0;
        int high = a.length - 1;
        int pos = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == key) {
                pos = mid;
                break;
            }
            else if (key > a[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (pos != -1) {
            System.out.println("Found at index " + pos);
        }
        else {
            System.out.println("Not found");
        }
    }
}

6. Find the largest number:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];

        for (int i = 1; i < 5; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        System.out.println("Largest number = " + max);

        sc.close();
    }
}

7.smallest number:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];

        for (int i = 1; i < 5; i++) {
            if (a[i] < max) {
                max = a[i];
            }
        }

        System.out.println(" smallest number = " + max);

        sc.close();
    }
}

8.SECOND LARGEST NUMBER :

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        int largest = a[0];
        int second = Integer.MIN_VALUE;

        for (int i = 1; i < 5; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            }
            else if (a[i] > second && a[i] < largest) {
                second = a[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("Second largest element not found");
        }
        else {
            System.out.println("Second largest = " + second);
        }

        sc.close();
    }
}

9.SUM OF ARRAY:


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[5];
        int sum = 0;

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            sum = sum + a[i];
        }

        System.out.println("Sum of array = " + sum);

        sc.close();
    }
}