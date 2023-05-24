public class StackCrud
{
    int arr[];
    int capacity;
    int top;

    public StackCrud(int capacity)
    {
        this.capacity=capacity;

    }
    void push(int data)
    {
        if(top==capacity-1)
        {
            throw new RuntimeException("Stack is full");

        }
        top++;
        arr[top]=data;


    }

    void pop()
    {
        if(isEmpty)
        {
            throw new RuntimeException("Stack is full");

        }
        top++;
        arr[top]=data;

    }

}