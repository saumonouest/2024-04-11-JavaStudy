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
		horse=Toolkit.getDefaultToolkit().getImage("C:\\JavaDev\\ILTJ5Peu8OT3FO57X6X9p7H_pXW_zFJclGEvZQZl51DXBZlJx-NGNmjwLa5yIN45nP689dcSRRytkLOZGtO5IQ.gif");
	}
	@Override
	public void paint(Graphics g) {
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
		g.drawImage(horse,x,y,120,80,this);
		
	}

}
