import javax.swing.plaf.synth.SynthStyleFactory;

public class Patterns {
    private static final int n = 0;
    public static void main(String[] args) {
        int n=4;
        //@11st butterfly
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

 
        int spaces= 2*(n-i);
        for(int j=1; j<=spaces; j++){
            System.out.print(" ");

        }
        for (int j=1 ;j <=i;j++){
            System.out.print("*");
        }
    System.out.println();
    }

    //lower half
    for(int i=n;i>=1 ;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }


    int spaces= 2*(n-i);
    for(int j=1; j<=spaces; j++){
        System.out.print(" ");

    }
    for (int j=1 ;j <=i;j++){
        System.out.print("*");
    }
System.out.println();
}

// @2nd rhombus

for(int i=1;i<=n;i++){
    for(int j=1;j<=n-i;j++){
        System.out.print(" ");
    
}

for(int j=1;j<=5;j++){
    System.out.print("*");
}
System.out.println();
}
 
// @3rd number pyramid

    for(int i =1;i<=n;i++){
        for(int j=1;j<n-i;j++){
            System.out.print(" ");
        }
        for(int j=1; j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

//@4th Pallindromic pattern
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");

        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }

//@5th diamond pattern

for(int i=1;i<=n;i++){
    for(int j=1;j<n-i;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
    }
    System.out.println();
}
    //Lower half
    for(int i=n;i>=1;i--){
        for(int j=1;j<n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        System.out.println();
   

    }


}
}

