package extra_study;

public class Var_Args {

	public static void main(String[] args) {
		new Var_Args().Var_Args(1,"hello") ;
		new Var_Args().Var_Args(2,"hello","hi") ;
	}

	private void Var_Args(int x, String... y) {
		
		System.out.println(y[y.length-x]+" ");
	}

}
