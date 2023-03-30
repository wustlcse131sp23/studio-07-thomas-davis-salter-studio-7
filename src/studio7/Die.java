package studio7;

public class Die {
	
	private int n;
	
	public Die (int nSides) {
		n=nSides;
	}
	
	public int throwDie (){
		return (int)((Math.random()*(n-1)+1)+.5);
	}
	
	public static void main(String[] args) {
		Die n1 = new Die(6);
		System.out.println(n1.throwDie());
	}

}
