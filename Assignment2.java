package Assignments;

public class Assignment2 {
    
 public static void main(String[] args) 
    {
        int a=10;
        int b=20;
        int c=30;
        Assignment2 as=new Assignment2();
        as.largestofthree(a,b,c);
    }
    public void largestofthree (int a,int b,int c)
    {
        if(a>b && a>c)
        {
            System.out.println(a+" is the largest number");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the largest number");
        }
        else{
            System.out.println(c+" is the largest number");
        }
    }
}