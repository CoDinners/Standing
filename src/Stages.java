import java.awt.*;

public class Stages {
	public void stages(int n) {
		if (n == 1) {
			V.count[5] = 5;
			V.count[7] = 5;
			V.count[13] = 5;
			V.count[15] = 5;
			V.count[25] = 5;
			V.count[27] = 5;
			V.count[29] = 5;
			
			String[] num = {"1", "2", "1", "2", "1", "2", "2", "3", "1", "3", "0", "0"};
			int[] colr = {72, 229, 255, 197, 255, 197, 229, 197, 72, 197, 255, 255};
			int[] colg = {88, 71, 255, 61, 255, 61, 71, 61, 88, 61, 255, 255};
			int[] colb = {209, 71, 255, 206, 255, 206, 71, 206, 209, 206, 255, 255};
			
			
			V.buffg.setFont(new Font("8-bit pusab", Font.PLAIN, 20));
			for(int i = 0; i < 6; i++) {
				V.buffg.setColor(new Color(colr[i], colg[i], colb[i]));
				V.buffg.drawString(num[i], 27 * 4 + i * 87 + 33, 27 * 4 - 5);
			}
			for(int i = 6; i < 12; i++) {
				V.buffg.setColor(new Color(colr[i], colg[i], colb[i]));
				V.buffg.drawString(num[i], 27 * 4 - 30, 27 * 4 + (i - 6) * 87 + 55);
			}
		}
	}
}
