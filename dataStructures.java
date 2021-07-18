
class Stack{
    
    int stack[] = new int[2]; //Default size of the stack.
    int top = -1; 
    int size = 2; // Size of the stack.

    /* 
        This method is used to push or insert new element into the stack.
        The Size of stack will expand if the stack is already full
    
    */

    public int push(int element){

        if(top == size -1 ){
            expand();
        }

        top++;
        stack[top] = element;
        System.out.println("Element pushed at " + top);
        return top - 1; // Index at which the element is inserted!!
    }


    /* 
        This method is used to pop or delete an element into the stack.
        The Size of stack will shrink if the size is much larger than what is required.
    
    */

    public int pop(){

        if(isEmpty()){

            System.out.println("Stack Underflow!");
            return -1;
        }

        int element = stack[top];
        stack[top] = 0;
        top--;
        System.out.println("Element poped: " + element);
        return element; // Deleted element.  

    }

    // Checks if the stack is underflow..

    public boolean isEmpty(){
        if(top == -1){

            System.out.println("Stack Underflow!");
            return true;
        }
        return false;

    }
    
    // Returns element at the top..

    public int peek(){
        if(isEmpty()){

            System.out.println("Stack Underflow!");
            return -1;
        }

        int element = stack[top];
        System.out.println("Element peeked: " + element);
        return element;

    }

    // Returns the size of the stack..


    public int sizeof(){

        int size = 0;

        for(int i =0; i< this.size; i++){   // Instead of this for loop top can also be returned as the size.

            if(stack[i] != 0){

                size++;
            }
        }

        System.out.println("Size of the stack is " + size);
        return size;
    }

    // Checks if element is present inside the array or not.

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

    // Reduces the size of the stack.

    private void shrink(){

        int len =  sizeof();
        if(len <= (size/2)/2){
            size /= 2;
        }

        // new array for stack 
        int newStack[] = new int[size];
        // Copying all the values to new stack.
        System.arraycopy(stack, 0, newStack, 0, len);
        // Rereffrencing stack.
        stack = newStack;       
    }
    

    // Expands the size of the stack.
    private void expand(){
        int len = sizeof();
        int newStack[] = new int[size * 2];
        System.arraycopy(stack, 0, newStack, 0, len);
        stack = newStack;
        size *= 2;
    }

}


// Making a Node class.
class Node{

    int data;
    Node next;  // Self refference.
}

class LinkedLists{
    
    Node head; // The First node of the linked list.

    public void insert(int data)
    {
        
        Node node = new Node();
        node.data = data;
        node.next = null; //  As it would be inserted at the end.

        if(head==null) // If linked list does not exist.
        {
            head = node;
        }
        else
        {
            Node n = head;
            
            // Traversing to the end...
            while(n.next != null)
            {
                n = n.next;
            }

            n.next = node;      // overwritting null with reff(node)..

        }
    }

    public void insertAtStart(int data)
    {
        
        Node node = new Node();
        node.data = data;
        node.next = head; //  As it would be inserted at the end.
        head = node;
    }

    public void insertAt(int index, int data)
    {
        Node node  = new Node();
        node.data = data;
        node.next = null;

        if(index == 0)
        {
            insertAtStart(data);
        }

        else
        {

        


        // Traversing to the index 
        Node n = head;

        for(int i=0; i< index - 1; i++)
        {
            n = n.next;
        }

        node.next = n.next;
        n.next = node;

        }
    }


    private boolean isExist(){

        if(head != null)
        {
            return true;
        }
        return false;
    }

    public void show(){
        

        if(isExist()){
            Node node = head;

            while(node.next != null)
            {
                System.out.println(node.data);
                node = node.next;
            }  

            // For the last element with the refference null
            System.out.println(node.data);  
            
        }

        else
        {
            System.out.println("Linked List does not exist.");
        }
    }

    public void deleteAtStart()
    {

        head = head.next;
    }

    public void delete(int index)
    {
        if(index == 0)
        {
            deleteAtStart();
        }

        else
        {
            // Traversing to the index 
            Node n = head;
            Node temp = null;
            for(int i=0; i< index - 1; i++)
            {
                n = n.next;
            }
            temp = n.next;
            n.next = temp.next;
        }
    }
}




class dataStructures{

    public static void main(String args[]){

        /*
        // Stack example...
        Stack s =  new Stack();
        s.push(10);
        s.push(11);
        s.push(50);
        s.pop();
        s.peek()
        s.isPresent(11);
        */ 

        /*
        // Linked List example...

         LinkedLists list = new LinkedLists();
        list.insert(10);
        list.insert(55);
        list.insert(35);
        list.insertAtStart(15);
        list.insertAt(2, 77);
        list.delete(2);
        list.show();
        
        */
       

    }
}
