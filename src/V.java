import java.awt.*;
import java.util.*;

public class V {
	// ============================================================================
	// 크기
	static int SCREEN_WIDTH = 1280, SCREEN_HEIGHT = 720;
	
	// ============================================================================
	// 변수 값
	static int pageNum = 3, gameSpeed = 20;
	
	static int[] count = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	
	static int[] answer = {1, 3, 4, 1, 1, 5, 1, 5, 1, 2, 4, 3, 2, 5, 1, 5, 1, 1, 1, 3, 1, 3, 1, 2, 1, 5, 1, 5, 1, 5, 1, 1, 1, 1, 1, 1};
	
	static int[] score = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};;
	// ============================================================================
	// 좌표
	static int windowX = 300, windowY = 300;
	static int mainLogoX = SCREEN_WIDTH / 2, mainLogoY = SCREEN_HEIGHT / 2;
	static int x, y;
	// ============================================================================
	// 문자
	static String state = "inGame";
	static String[] roles = {"1. \"Man\" and \"Woman\" can't stand by each other", "     because, they are a divorced couple.", "2. \"Adults\" have to stand by a pond", "     because, human need water to survive.", "3. \"Child\" can't stand by a pond", "     because, there is a danger of child falling into the water.", "4. \"Child\" has to stand by \"Adult\"(Man and Woman)", "     because, child should be protected by adults.", "5. Only one person can stand bu the pond", "     because of the lack of water.", "6. Each row and column has as many people as the number", "     at the end.", "7. \"Blue\" means \"There are only men in this line\".", "8. \"Red\" means \"There are only women in this line\".", "9. \"White\" means \"There are only children in this line\".", "10. \"Purple\" means \"There are women and men in this line\"."};
	// ============================================================================
	// 불린 값
	
	// ============================================================================
	// 기타
	static Thread th;
	static Graphics buffg;
	// ============================================================================
	// 이미지
	static Image buffImage;
	static Image board = Toolkit.getDefaultToolkit().getImage("./Puzzles/Board.png");
	static Image piece1 = Toolkit.getDefaultToolkit().getImage("./Puzzles/Piece1.png");
	static Image piece2 = Toolkit.getDefaultToolkit().getImage("./Puzzles/Piece2.png");
	static Image piece3 = Toolkit.getDefaultToolkit().getImage("./Puzzles/Piece3.png");
	static Image piece4 = Toolkit.getDefaultToolkit().getImage("./Puzzles/Piece4.png");
	static Image piece5 = Toolkit.getDefaultToolkit().getImage("./Puzzles/Piece5.png");
}
