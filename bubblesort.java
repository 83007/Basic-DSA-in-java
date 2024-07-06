// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
class abc {
    static void bubblesort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void printarray(int arr[],int n){
        for(int i=0;i<n;i++)
        System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) {
int arr[]={3,6,1,9,2,7};
int n=arr.length;
bubblesort(arr,n);
printarray(arr,n);
    }
}
