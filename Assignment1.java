package Assignments;

public class Assignment1 {
    public void add(int x , int y){
        int sum= x+y;
       System.out.println("additon of two numbers is :" +sum);
    }   
    public void sub(int x , int y){
        int sub= x-y;
       System.out.println("subtractiton of two numbers is :" +sub);
    }   
    public void mul(int x , int y){
        int mul= x*y;
       System.out.println("multplication of two numbers is :" +mul);
    }   
    public void div(int x , int y){
        double div= x/y;
       System.out.println("division of two numbers is :" +div);
    }   
    public void mod(int x , int y){
        int mod= x%y;
       System.out.println("Modulus of two numbers is :" +mod);
    } 
    
    public static void main(String[] args) {
        int x=20 , y=10 ;
        Assignment1 as=new Assignment1();
        as.add(x,y);
        as.sub(x,y);
        as.mul(x,y);
        as.div(x,y);
        as.mod(x,y);
    
    
        
    }
}
    

