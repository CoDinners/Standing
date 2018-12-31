
public class Pieces {
	public void pieces() {
		for(int i = 0; i < 6; i++) {
			for(int m = 0; m < 6; m++)
				if(V.count[m + 6 * i] == 0)
					V.buffg.drawImage(V.board, 27 * 4 + m * 87, 27 * 4 + i * 87, 88, 88, null);
				else if(V.count[m + 6 * i] == 1)
					V.buffg.drawImage(V.piece5, 27 * 4 + m * 87, 27 * 4 + i * 87, 88, 88, null);
				else if(V.count[m + 6 * i] == 2)
					V.buffg.drawImage(V.piece2, 27 * 4 + m * 87, 27 * 4 + i * 87, 88, 88, null);
				else if(V.count[m + 6 * i] == 3)
					V.buffg.drawImage(V.piece3, 27 * 4 + m * 87, 27 * 4 + i * 87, 88, 88, null);
				else if(V.count[m + 6 * i] == 4)
					V.buffg.drawImage(V.piece4, 27 * 4 + m * 87, 27 * 4 + i * 87, 88, 88, null);
				else if(V.count[m + 6 * i] == 5)
					V.buffg.drawImage(V.piece1, 27 * 4 + m * 87, 27 * 4 + i * 87, 88, 88, null);
			
		}
	}
}
