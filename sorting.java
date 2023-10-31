package levvel2;
import java.util.*;
class sorting{
    void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    void arrange(int arr[], int n)
    {
        for(int i=0;i<n-1;i++)
        {  
            if((i%2==0)&&(arr[i]>arr[i+1]))
            {
                swap(arr,i,i+1);
            }
            else if((i%2!=0)&&(arr[i]<arr[i+1]))
            {
                swap(arr,i,i+1);
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        sorting obj=new sorting();
        obj.arrange(arr,n);
        System.out.println("The result is:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}