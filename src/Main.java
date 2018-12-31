import java.awt.*;
import java.awt.event.*;

import javax.security.auth.x500.X500Principal;
import javax.swing.*;

public class Main extends JFrame implements KeyListener, Runnable, MouseListener, MouseMotionListener {
	// ====================================================
	Buffer buffer = new Buffer();

	// ====================================================
	public Main() {
		this.setSize(V.SCREEN_WIDTH, V.SCREEN_HEIGHT);
		this.setUndecorated(false);
		this.setVisible(true);
		this.setTitle("PUZZLES");
		this.setResizable(false);

		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);

		V.th = new Thread(this);
		V.th.start();

//		while(true)
//			this.setLocation(V.windowX, V.windowY);
	}

	public void run() {
		while (true) {
			repaint();

			try {
				V.th.sleep(V.gameSpeed);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public void paint(Graphics g) {
		if (V.buffg == null) {
			V.buffImage = createImage(V.SCREEN_WIDTH, V.SCREEN_HEIGHT);// 버퍼링용 이미지 생성
			if (V.buffImage == null)
				System.out.println("버퍼 이미지 없음 (생성 불가)");
			else
				V.buffg = V.buffImage.getGraphics();
		}
		buffer.buffer();
		g.drawImage(V.buffImage, 0, 0, this);
	}

	public void mouseDragged(MouseEvent arg0) {
	}

	public void mouseMoved(MouseEvent arg0) {
	}

	public void mouseClicked(MouseEvent arg0) {
	}

	public void mouseEntered(MouseEvent arg0) {
	}

	public void mouseExited(MouseEvent arg0) {
	}

	public void mousePressed(MouseEvent arg0) {
		V.x = arg0.getX();
		V.y = arg0.getY();

		if (V.state.equals("inGame")) {
			System.out.println(V.x + " " + V.y);

			for (int i = 0; i < 36; i++)
				System.out.print(V.count[i] + " ");

			System.out.print("\n");

			for (int i = 0; i < 6; i++) {
				for (int m = 0; m < 6; m++) {
					if (V.x >= 27 * 4 + m * 87 && V.x <= 27 * 4 + m * 87 + 88 && V.y >= 27 * 4 + i * 87
							&& V.y <= 27 * 4 + i * 87 + 88) {
						if (V.count[m + 6 * i] < 5)
							V.count[m + 6 * i]++;
						else if (V.count[m + 6 * i] == 5)
							V.count[m + 6 * i] = 0;
					}
				}
			}
			for (int i = 0; i < 36; i++)
				System.out.print(V.count[i] + " ");
			System.out.print("\n");

			for (int i = 0; i < 36; i++)
				if (V.count[i] == V.answer[i])
					V.score[i] = 1;
				else if (V.count[i] != V.answer[i])
					V.score[i] = 0;
		}
	}

	public void mouseReleased(MouseEvent arg0) {
	}

	public void keyPressed(KeyEvent e) {
	}

	public void keyReleased(KeyEvent e) {
	}

	public void keyTyped(KeyEvent e) {
	}

	public static void main(String[] args) {
		Main main = new Main();
	}

}
