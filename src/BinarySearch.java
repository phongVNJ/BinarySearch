import javax.swing.*;
import java.security.Key;
import java.util.Scanner;

public class BinarySearch {
    int binarySearch(int arr[],int low, int high,int value){
        if (high>=low){
            int mid = low +(high-low)/2;
            if (arr[mid]==value){
                return mid;
            }
            if (arr[mid]>value){
                return binarySearch(arr,low,mid-1,value);
            }
            return binarySearch(arr,mid+1,high,value);
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();
        int arr [] ={2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int n =arr.length;
        int value = 14;
        int result = ob.binarySearch(arr,0,n-1,value);
        if (result==-1)
            System.out.printf("Khong tim thay gia tri"+value);
        else
            System.out.printf("phan tu"+value+"duoc tim thay tai chi so"+result);
    }




}
