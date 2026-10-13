public class greater {
    public static void main(String[] args){
        int a=0;
        int b=5;
        String greater =(a>b)?"a is greater":"b is greater";
        System.out.println(greater);
        String equal =(a==b)?"a is equal to b": "a is not equal to b";
        System.out.println(equal);
    }
}

public class Evenodd {
    public static void main(String[] args){
        int a=5;
        String result=(a%2==1)?"odd":"even";
        System.out.println(result);
    }
}

public class Vote {
    public static void main(String[] args){
        int a=20;
        String result=(a>=18)?"eligible ":"not eligible";
        System.out.println(result);

    }
}public class Mark {
    public static void main(String[]args){
        int a=33;
        int pass=40;
        String result=(a>pass)?"pass":"fail";
        System.out.println(result);
    }
}

public class Account {
    public static void main(String[]args){
        int balance=2000;
        balance+=1500;
        System.out.println(balance);
        balance-=500;
        System.out.println(balance);
        balance*=2;
        System.out.println(balance);
    }
}

public class Boolean {
    public static void main(String[]args){
        boolean id=true;
        boolean ticket=false;
        System.out.println(id && ticket);
    }
}
public class Or {
        public static void main(String[]args){
            boolean id=true;
            boolean ticket=false;
            System.out.println(!id);
        }
    }
import java.util.Scanner;
public class Positive
{
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int num= Sc.nextInt();
        String result=(num>0)?"positive":(num<0)?"negative":"zero";
        System.out.println(result);1

    }

}

import java.util.Scanner;
public class Divisible
{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        String result=(num%3==0&& num%5==0)?"divisible by 3 and 5":"not divisible by 3 and 5";
        System.out.println(result);
    }

}
public class Biggest {
    public static void main(String[]args){
        int a=10;
        int b=20;
        int c= 25;
        int num=(a>=b)?((a>=c)?a:c):((b>c)?b:c);
        System.out.println(num);

    }
}