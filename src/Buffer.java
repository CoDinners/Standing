
import java.awt.*;
import java.awt.image.ImageObserver;

public class Buffer {
	//===============================
	Board board = new Board();
	Pieces pieces = new Pieces();
	Stages stages = new Stages();
	End end = new End();
	//===============================
	public void buffer() {

		switch (V.pageNum) {
		case 3://∞‘¿”
			V.buffg.setColor(new Color(135, 184, 122));
			V.buffg.fillRect(0, 0, V.SCREEN_WIDTH, V.SCREEN_HEIGHT);
			
			V.buffg.setColor(new Color(255, 255, 255));
			V.buffg.setFont(new Font("8-bit pusab", Font.PLAIN, 12));
			
			for(int i = 0; i < V.roles.length; i++)
				V.buffg.drawString(V.roles[i], 650, 120 + 20 * i);
			
			board.board();
			pieces.pieces();
			stages.stages(1);
			end.end();
			
			if(V.state.equals("clear")) {
				V.buffg.setColor(new Color(0, 0, 0, 100));
				V.buffg.fillRect(0, 0, V.SCREEN_WIDTH, V.SCREEN_HEIGHT);
				V.buffg.setColor(new Color(255, 255, 255));
				V.buffg.drawString("CLEAR", 300, 360);
			}
			System.out.println(V.state);
			break;
		}
	}
}
