import java.util.Scanner;
import java.util.*;
class posineg
{
    public static void main(String[] args) 
    {
        Scanner number = new Scanner (System.in);   
    System.out.println("Enter username");
    int n1=0;
        if(number>n1)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number<n1)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }   
    }
}