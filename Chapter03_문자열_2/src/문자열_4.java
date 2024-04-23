import javax.swing.*;
public class 문자열_4 extends JFrame{
	JTextField tf=new JTextField();
	public 문자열_4() {
		add("North",tf);
		
		setSize(350,300);
		tf.setText(String.valueOf(true));
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 문자열_4();
	}

}
