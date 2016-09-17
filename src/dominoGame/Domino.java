public class Domino {
	int sideA;
	int sideB;
	
	public Domino(int a, int b) {
		sideA = a;
		sideB = b;
	}
	
	public String getPiece() {
		return sideA + " | " + sideB;
	}

	public static void main(String[] args) {
		Domino d = new Domino(3, 2);
		System.out.println(d.getPiece());
	}
}
