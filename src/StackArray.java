// Program for performing various operations on stack
public class StackArray {

    int max = 100;
    int stk[] = new int [max];
    int top;

    StackArray(){
        top = -1;
    }

    void push (int item){
        if (top == max)
            System.out.println("Stack overflow");
        else
            stk[++top] = item;
    }

    boolean isEmpty(){
        if (top < 0)
            return true;
        else
            return false;
    }

    int pop(){
      if (isEmpty()){
          System.out.println("Stack underflow");
          return 0;
      } else {
          return (stk[top--]);
      }
    }

    void stacktop(){
        if (isEmpty())
            System.out.println("Stack underflow");
        else
            System.out.println("Stack top is " + (stk[top]));
    }

    void display(){
        System.out.print("Stack--> ");
        if (top == -1)
            System.out.println("Empty");
        else
            for (int i=0; i<=top; i++)
                System.out.print(stk[i]+ " ");
        System.out.println("\n");
    }
}
