package Assignments;

public class Assignment4 {
    

public static void main(String args[]) {
    int arr[] = {99,34,56,20,11,0,45,60,77,83};
    
    sort(arr);
 
}
static void sort(int[] arr)
{
    int temp;
    for(int i=0;i<arr.length;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]);
    }
}
}