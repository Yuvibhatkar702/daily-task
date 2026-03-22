import java.util.*;

public class SecoundLargest {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of ARRay:-  ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the Element of the Arrays:- ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int largest = 0;
        int secLargest = 0;

        for (int i : arr) {
            if(i > largest){
                secLargest = largest;
                largest = i; 
            }else if(i > secLargest && largest != i){
                secLargest = i;
            }
        }

         System.out.print(secLargest);
}
    }

   
