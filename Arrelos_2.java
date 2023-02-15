
public class Arrelos_2 {
	int max, top;
	public char[] stack;
	
	public Arrelos_2(int stackSize){
		this.stack = new char[stackSize];
		this.max = this.stack.length;
		this.top = 0;
	}
	public void pop() {
		if(top == 0) {
			System.out.println("Stack is empty");
			} else {
				System.out.println(stack[(top-1)]);
				stack[(top-1)] = 0;
				top--;
		}
	}
	
	public void Push(char value){

	     if(top==max){

	       System.out.println("FUERA !!!");

	       return;

	     }

	     stack[top]= value;
	     top ++;

	}
}
