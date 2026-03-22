import java.util.*;

class Input {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int arr[] = new int[n]; // Simple array.

        // for (int i : arr) {
        //     System.out.print(i + " ");
        // }
        
        // ArrayList<Integer> list = new ArrayList<>(); // ArrayList
        // for (int i = 0; i < n; i++) {
        //     list.add(sc.nextInt());
        // }
        // for (int i : list) {
        //     System.out.print(i + " ");
        // }


        // //Take the infinate Input
        // String str  = sc.nextLine();

        // String ch[] = str.split(" "); // this is the String array we need to convet this into integer

        // ArrayList<Integer> intarr = new ArrayList<>();

        // for(String token : ch){
        //     int num = Integer.parseInt(token);
        //     intarr.add(num);
        // } 

        // for(int arr : intarr){
        //     System.out.print(arr + " ");
        // }


        int n = sc.nextInt(); // input the interger.
        
        String str1 = sc.nextLine();
        sc.nextLine();
        System.out.println(n + " " + str1);

        sc.close();



    }

}