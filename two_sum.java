import java.util.*;

public class two_sum {

    // private static final int i = 0;

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr={-1,0,1,8,4,5,6};
        int target =in.nextInt();
        int[] result = check(arr, target);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println(Arrays.toString(result));
        } else {
            System.out.println("No such indices found.");
        }
    }



static int[] check(int[] arr,int tg){
    int[] a={-1,-1};
    int sum=0;
    
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sum=arr[i]+arr[j];

                if(sum==tg){    
                    a[0]=i;
                    a[1]=j;
                    return a;
                }

            }
        
        
        }
    
    return a ;
}
}