public class Demo
{
    public static void main(String[] args) 
    {
        scanner number = new scanner(System.in);   
    System.out.println("Enter username");
        if(number > 0)
        {
            System.out.println(number+" is a positive number");
        }
        else if(number < 0)
        {
            System.out.println(number+" is a negative number");
        }
        else
        {
            System.out.println(number+" is neither positive nor negative");
        }
    }
}