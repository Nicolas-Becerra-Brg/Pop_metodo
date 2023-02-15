import java.util.Stack;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Arrelos_2 metodo = new Arrelos_2(5);
		 
		 metodo.Push('8');
		 metodo.Push('6');
		 metodo.Push('4');
		 metodo.Push('2');
		 metodo.Push('1');
		 
		 for(int i=0; i<metodo.stack.length;i++) {
			 System.out.println(metodo.stack[i]);
		 }
		 
		 metodo.pop();
		 
		 
		 

	}

}