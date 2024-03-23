package javaapplicaton3;

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RobotBerjalan extends Applet implements ActionListener{
	 private Image robot_image;
	 Button b;
	 
	 int x = 30, y = 30; //posisi sampah
	 int z = 300; //posisi robot sedang membuka mulut
	 
	 int xPosRobot = 20; //posisi awal robot
	 int yPosRobot = 30; //posisi awal robot
	 
	 int xPosSampah = 20; //posisi awal sampah
	 int yPosSampah = 130; //posisi awal sampah
	 
	 /**
	 * Initialization method that will be called after 
	 * the applet is loaded into the browser.
	 */
	 public void init() {
	 // TODO start asynchronous download of heavy resources
	 b = new Button("Run");
	 
	 setLayout(new BorderLayout());
	 add("South",b);
	 
	 b.addActionListener(this); 
	 }
	 private void add(String string, Button b2) {
		// TODO Auto-generated method stub
		
	}
	private void setLayout(BorderLayout borderLayout) {
		// TODO Auto-generated method stub
		
	}
	//TODO overwrite start(), stop() and destroy() methods
	 public void paint( Graphics g )
	 {
	 super.paint( g );
	 g.drawString("Lokasi A", 0, 20);
	 g.drawString("Lokasi B", 270, 20);
	 //menggambar robot 
	 g.fillArc( xPosRobot, yPosRobot, 100, 100, 0, z ); 
	 
	 //menggambar sampah dalam bentuk kotak berwarna biru
	 g.setColor(Color.blue);
	 g.fillRect( xPosSampah, yPosSampah, x, y);
	 g.drawRect( xPosSampah, yPosSampah, x, y);
	 
	 }
	 public void actionPerformed(ActionEvent e) {
	 if (e.getSource() == b) {
	System.out.println("Button 1 was pressed");
	 if(xPosRobot == 20) {
	 doKeKanan();
	 } else {
	 doKeKiri();
	 }
	}
	else
	System.out.println("Button 2 was pressed");
	 }
	 public void doKeKanan()
	 {
	 z = 300;
	 xPosRobot = 220; // posisi robot pindah
	 repaint();
	 }
	 private void repaint() {
		// TODO Auto-generated method stub
		
	}
	public void doKeKiri()
	 {
	 z = 300;
	 xPosRobot = 20;
	 repaint();
	 }
	public Image getRobot_image() {
		return robot_image;
	}
	public void setRobot_image(Image robot_image) {
		this.robot_image = robot_image;
	}
	}


