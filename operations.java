OPERATIONS:
1.APPEND:

import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner( System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder( s );
        sb.append(" java");
        System.out.println(sb);
    }
}

2. INSERT:

import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner( System.in);
        System.out.print(" Enter the String:");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder( s );
        sb.insert(1,"i");
        System.out.println(sb);
    }
}

3.DELETE:

import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner( System.in);
        System.out.print(" Enter the String:");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder( s );
        sb.delete(5,11);
        System.out.println(sb);
    }
}

4. DELETE CHARAT():

import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner( System.in);
        System.out.print(" Enter the String:");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder( s );
        sb.deleteCharAt(3);
        System.out.println(sb);
    }
}

5. REVERSE:

import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner( System.in);
        System.out.print(" Enter the String:");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder( s );
        sb. reverse();
        System.out.println(sb);
    }
}

6.REPLACE:
import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner( System.in);
        System.out.print(" Enter the String:");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder( s );
        sb. replace(0,2,"yo");
        System.out.println(sb);
    }
}

7.CHAR AT():

import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner( System.in);
        System.out.print(" Enter the String:");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder( s );
        System.out.println(sb.charAt( 2));
    }
}

8.SET CHARAT():

import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner( System.in);
        System.out.print(" Enter the String:");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder( s );
        sb.setCharAt(4,'y');    
        System.out.println(sb);
    }
}

9.length():

import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner( System.in);
        System.out.print(" Enter the String:");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder( s );    
        System.out.println(sb.length());
    }
}

10.TWO STRING:

import java.util.Scanner;
public class main{
    public static void main(String[]args){
        Scanner sc = new Scanner( System.in);
        System.out.print(" Enter the String:");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder( s );
        String r = sb.toString();    
        System.out.println(r);
    }
}