import java.util.*;

public class End {
	public void end() {
		int i;
		
		for(i = 0; i < 36; i++) {
			if(V.score[i] == 0)
				break;
		}
		
		if(i == 36) {
			V.state = "clear";
		}
	}
}
