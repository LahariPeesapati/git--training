
 package Assignments;
public class Assignment5 {
    public static void main(String args[]){
        int array[] = {567,98,113,12,78};
        int temp=array[0];
        for(int i = 0; i<array.length; i++ ){
           if(array[i]>temp)
           temp=array[i];
        }
        System.out.println("Largest Number in the array is:"+ temp);
    }
}