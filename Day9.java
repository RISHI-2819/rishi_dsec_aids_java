1. removing space:

import java.util.Scanner;
public class Main{
    public static void main( String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter string");
        String br= sc.nextLine();
        StringBuilder sb = new StringBuilder(br);
        for( int i = 0; i<sb.length(); i++){
            if( sb.charAt(i) == ' '){
                sb.deleteCharAt(i);
                i++;
            }
        }
        System.out.println(sb);
    }
}

2. LAST 3 LETTERS REVERSE:


import java.util.Scanner;
public class Main{
public static void main( String[]args){
    Scanner sc = new Scanner( System.in);
    System.out.print(" enter sentences:");
    String s = sc.nextLine();
    StringBuilder sb = new StringBuilder(s);
    if(sb.length()>=3){
        StringBuilder last = new StringBuilder( sb.substring(sb.length()-3));
        last.reverse();
        sb.replace(sb.length()-3,sb.length(),last.toString());
        System.out.println(sb);
    }
    else{
        System.out.println(" enter atleast 3 characters");
    }
}
}

3. removing first and last letter:

import java.util.Scanner;
public class Main{
public static void main( String[]args){
    Scanner sc = new Scanner( System.in);
    System.out.print(" Enter sentences:");
    String s = sc.nextLine();
    StringBuilder sb = new StringBuilder(s);
    if(sb.length()>=2){
        sb.deleteCharAt(sb.length()-1);
        sb.deleteCharAt(0);
        System.out.println(sb);
    }
    else{
        System.out.println(" enter atleast 3 characters");
    }
}
}

4.bufferd reader:

import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br=new BufferedReader( 
            new InputStreamReader(System.in));
        System.out.println(" enter your name");
        String name = br.readLine();
        System.out.print("welcome  " + name);
        
    }
}
5. removing vowels :

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            char ch = Character.toLowerCase(sb.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(sb);
    }
}

6.ODD NUMBER EVEN NUMBER  :
    import java.io.*;
public class Main{
    public static void main(String [] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the Starting Number : ");
        int Start = Integer.parseInt(br.readLine());
        System.out.print("Enter the ending Number : ");
        int End = Integer.parseInt(br.readLine());
        int Even= 0,Odd = 0;
        for(int i = Start;i<=End;i++){
            if(i%2==0){
                Even++;
            }else{
                Odd++;
            }
        }System.out.println("The number  of even number : "+Even);
        System.out.println("The number of Odd number : " + Odd);
    }
}

7.SERIAL NUMBER :

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            String name = sc.nextLine();
            sb.append(i).append(". ").append(name).append("\n");
        }

        System.out.print(sb);
    }
}

8.REMOVE SPECIAL CHARACTER:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {

            char ch = sb.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.println(sb);
    }
}
