import java.util.Scanner;
public class Delivery {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int delay=sc.nextInt();
        if(delay>0){
            System.out.println("sorry for the delay,your product is delivery sucessfully");
            
        }
    }
}


import java.util.Scanner;
public class Spotify {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String user=sc.nextLine();
        if(user.equals("student"));
        {
            System.out.println("student spotify pay is 120");
        }
    }
}
import java.util.Scanner;
public class Spotify {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String user=sc.nextLine();
        if(user.equals("student"));
        {
            System.out.println("student spotify pay is 120");
        }
        else{
            System.out.println("spotify pay is 300");
        }
    }
}
import java.util.Scanner;
public class Spotify {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String user=sc.nextLine();
        if(user.equals("student"));
        {
            System.out.println("student spotify pay is 120");
        }
        else{
            System.out.println("spotify pay is 300");
        }
    }
}

import java.util.Scanner;
public class Water {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double usage=sc.nextDouble();
        if(usage<50){
            System.out.println("less usage");
        }
        elif if(usage<100){
            System.out.println("medium usage");
        }
        else{
            System.out.println("heavy usage of water");
        }
    }
}

import java.util.Scanner;
public class Nestedif {
    public static  void main(String[]args){
        Scanner sc=new Scanner(System.in);
        boolean ticket=sc.nextBoolean();
        boolean boarding=sc.nextBoolean();
        if(ticket){
            if(boarding){
                System.out.print("boarding allowed");
            }
            else{
                System.out.println("get pass");
            }
            else{
               System.out.println("ticekt required") ;
            }
        }
    }
}

import java.util.Scanner;
public class Switch {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        Switch (choice){
            case 1:
                System.out.println("bus selected");
                        break;
            case 2:
                System.out.println("car selected");
                break;
            case 3:
                System.out.println("train selected");
                break;
            default:
                System.out.println("invalid");
        }
    }
}
import java.util.Scanner;
public class Water {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double usage=sc.nextDouble();
        if(usage<50){
            System.out.println("less usage");
        }
        elif if(usage<100){
            System.out.println("medium usage");
        }
        else{
            System.out.println("heavy usage of water");
        }
    }
}
import java.util.Scanner;
public class Atm {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        if(balance<1000){
            System.out.print("low balance");
        }
    }
}