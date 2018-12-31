
public class Board {
	public void board() {
		for(int i = 0; i < 6; i++) {
			for(int m = 0; m < 6; m++)
				V.buffg.drawImage(V.board, 27 * 4 + m * 87, 27 * 4 + i * 87, 88, 88, null);
		}
	}
}
