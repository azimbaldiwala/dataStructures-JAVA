
class Stack{
    
    int[] stack = new int[5]; //Default size of the stack.
    int top = -1; 
    int size = 5; // Size of the stack.

    public int push(int element){

        if(top == size){
            System.out.println("Stack Overflow!");
            return -1; 
        }

        top++;
        stack[top] = element;
        System.out.println("Element pushed at " + top);
        return top - 1; // Index at which the element is inserted!!
    }

    public int pop(){

        if(top == -1){

            System.out.println("Stack Underflow!");
            return -1;
        }

        int element = stack[top];
        stack[top] = 0;
        top--;
        System.out.println("Element poped: " + element);
        return element; // Deleted element.  

    }


    public int peek(){
        if(top == -1){

            System.out.println("Stack Underflow!");
            return -1;
        }

        int element = stack[top];
        System.out.println("Element peeked: " + element);
        return element;

    }

    public int sizeof(){

        int size = 0;

        for(int i =0; i< this.size; i++){

            if(stack[i] != 0){

                size++;
            }
        }

        System.out.println("Size of the stack is " + size);
        return size;
    }

    public int isPresent(int element){
        
        int present = -1;
        
        for(int i=0; i< this.size; i++){

            if(stack[i] == element){

                present = 0;
                break;
            }
        }

        if(present == -1){
            System.out.println("Element not found!");
            return -1;
        }
        System.out.println("Element found!");
        return present;

    }

}


class dataStructures{

    public static void main(String args[]){

        Stack s =  new Stack();
        s.push(10);
        s.push(11);
        s.push(50);
        s.pop();
        s.peek();
        s.sizeof();
        s.isPresent(1);
    }
}
