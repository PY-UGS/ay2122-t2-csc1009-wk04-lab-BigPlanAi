public class StackOfIntegers{
    private int[] elements;
    private int size = 0;

    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
            for (int i = 0 ; i< 10; i++){
                stack.push(i);
            }
            while(!stack.empty()){
                System.out.print(stack.pop() + " ");
            }
    }
    public StackOfIntegers() {
        this.elements = new int[16];
    }

    public StackOfIntegers(int capacity) {
        this.elements = new int[capacity];
    }


    public boolean empty(){
        return this.size == 0;
    }

    public int peek(){
        return this.elements[this.size -1 ];
    }

    public void push(int value){
        this.elements[this.size++]  =value;
    }

    public int pop(){
        return this.elements[--this.size];
    }

    public int getSize(){
        return this.size;
    }

    
}