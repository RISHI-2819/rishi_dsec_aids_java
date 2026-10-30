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
