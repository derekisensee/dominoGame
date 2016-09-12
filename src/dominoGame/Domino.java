package dominoGame;

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
}
