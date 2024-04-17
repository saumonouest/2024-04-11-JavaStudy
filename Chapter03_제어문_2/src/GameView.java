import java.awt.*;
import javax.swing.*;
public class GameView extends JPanel{
	Image back,horse;
	int x=360;
	int y=360;
	public GameView()
	{
		// 변수의 초기화 => 생성자
		back=Toolkit.getDefaultToolkit().getImage("C:\\JavaDev\\i13975601745.png");
		horse=Toolkit.getDefaultToolkit().getImage("C:\\JavaDev\\20230822113956_9f301b7a11f3b342662caef0291d170e_gfgy.gif");
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
		g.drawImage(horse,x,y,120,80,this);
		
	}

}
