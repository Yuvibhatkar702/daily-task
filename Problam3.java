import java.util.*;

// Maximum Sum of Non-Adjacent Elements

class Problam3{

    // 2 1 4 9
    public static int FindSum(int num[], int n){

        // base case

        if(n < 0){
            return 0;
        }
        if(num.length == 1){
            return num[n];
        }

        int include = FindSum(num, n-2) + num[n]; // 9 + 1
        int declude = FindSum(num, n-1) + 0; // 4 + 2

        int sum = Math.max(include, declude);

        return sum;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:- ");
        int size = sc.nextInt();

        System.out.println("Enter the Array:- ");
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        int sum = FindSum(arr, size-1);

        System.out.println(sum);
    }
}