import java.util.Scanner;

public class switchcase {

    public static void main(String[] args) {

        System.out.println("Enter your age");
        Scanner ok = new Scanner(System.in);

        int age;
        age = ok.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are going to become an adult");
                break;
            case (23):
                System.out.println("You are going to join  job");
                break;
            case (25):
            System.out.println("You are going to get marry");
            break;
            
            default:
            System.out.println("Enjoy your life");
       
        }
    }
}
