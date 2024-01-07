public class pattern {

    static void pattern1(int n){

        for (int i=1; i<=n ; i++) {
            for (int j =1; j<=n; j++) {
              System.out.print("* ");
            }
            System.out.println();
        }
    }

static void pattern2(int n1){
    for (int i =n1; i>=0; i--) {
        for (int j = 0; j <=i ; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}


public static void main(String[] args) {
    
// pattern1(4);
pattern2(4);
}

}
