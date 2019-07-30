import java.util.NoSuchElementException;

public class LeakyStack {
	private String[] stack;
	private int top;
	private int bottom;
	private int size;
	public LeakyStack()
	{
		stack = null;
		top = -1;
		bottom = 0;
		size = 0;
	}
	
	public LeakyStack(int capacity)
	{
		stack = new String[capacity];
	}
	
	public boolean isEmpty()
	{
		return size == 0;
	}
	
	public String pop()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Stack UnderFlow");
		}
		String operation;
		if (top == 0)
		{
			operation = stack[top];
			stack[top] = null;
			top = stack.length - 1;
		}
		else
		{
			operation = stack[top];
			stack[top--] = null;
		}
		size--;
		
		return operation;
	}
	
	public void push(String operation)
	{
		if (top == stack.length - 1 || bottom > top)
		{
			top = bottom;
			stack[bottom++] = null;
			stack[top] = operation;
			if (bottom == stack.length)
			{
				bottom = 0;
			}
		}
		else
		{
			stack[++top] = operation;
		}
		
		size++;
		if (size > stack.length)
		{
			size = stack.length;
		}
	}
	
	public void display()
	{
		int stackTop = top;
		
		if (stackTop == -1)
		{
			System.out.println("Stack is empty");
			return;
		}
		
		for(int i = 0; i < size; i++)
		{
			System.out.print(stack[stackTop] + " ");
			stackTop--;
			if (stackTop < 0)
			{
				stackTop = stack.length - 1;
			}
		}
	}
}
