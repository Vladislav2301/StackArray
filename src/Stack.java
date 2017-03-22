import java.util.Scanner;

public class Stack {

    public static void main(String args[]) {

        StackArray s = new StackArray();
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.println("Choose operation: ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Exit");
            int choice = in.nextInt();

            switch (choice){
                case 1: {
                    System.out.print("enter value to push: ");
                    int p = in.nextInt();
                    s.push(p);
                    s.display();
                    break;
                }
                case 2:
                    s.pop();
                    s.display();
                    break;
                case 3:
                    return;
                default:
                    continue;
            }
        }
    }
}
