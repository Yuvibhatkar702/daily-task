import java.util.*;

class Problam1{
  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Declear array Size:- ");
    int n = sc.nextInt();
    int totalSum = 0;
    
    
    int arr[] = new int[n];
    
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
        totalSum += arr[i];
    }
    
    int left = arr[0];
    
    for(int i=1; i<arr.length; i++){
        
       int rightSum = totalSum - left - arr[i];
       
       if(left == rightSum){
           System.out.print("middle index is :- " + i);
           return;
       }
       
       left += arr[i];
    }
    
    System.out.print("No pivit is found");
    
  }
}