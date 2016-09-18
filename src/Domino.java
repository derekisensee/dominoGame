public class Domino {
	//Domino object
	int sideA;
	int sideB;
	
	public Domino(int a, int b) {
		sideA = a;
		sideB = b;
	}
	
	public int getSideA() {
		return sideA;
	}
	
	public int getSideB() {
		return sideB;
	}
	
	public String getPiece() {
		return sideA + " | " + sideB;
	}

	//main code
	public static void main(String[] args) {
		Domino[] doubleSix;
		doubleSix = new Domino[29];
		int totDom = 0;
		
		for(int i = 0; i <= 6; i++) {
			for(int j = 0; j <= i; j++) {
				doubleSix[totDom] = new Domino(i, j);
				totDom++;
			}
		}
		
		for(int a = 0; a < doubleSix.length-1; a++) {
			if(a == doubleSix.length-2) // if the 6 | 6
				System.out.print(doubleSix[a].getPiece());
			else if(doubleSix[a].getSideA() == doubleSix[a+1].getSideA())
				System.out.print(doubleSix[a].getPiece() + " , ");
			else
				System.out.println(doubleSix[a].getPiece());
		}
	}
}