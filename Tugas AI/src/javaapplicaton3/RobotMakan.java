package javaapplicaton3;

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RobotMakan extends Applet implements ActionListener{
	 Button b;
	 int x = 30, y = 30; //posisi sampah
	 int statusMulutRobot = 300; //robot buka mulut
	 /**
	 * Initialization method that will be called after 
	 * the applet is loaded into the browser
	 */
	 public void init() {
	 // TODO start asynchronous download of heavy resources
	 b = new Button(null);
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
	 
	 // menggambar robot dengan mulut terbuka
	 g.fillArc( 100, 50, 100, 100, 0, statusMulutRobot ); 
	 
	 //menggambar sampah dalam bentuk kotak berwarna biru
	 g.setColor(Color.blue);
	 g.fillRect( 200, 120, x, y);
	 g.drawRect( 200, 120, x, y);
	 
	 }
	 
	 public void actionPerformed(ActionEvent e) {
	 if (e.getSource() == b) {
	System.out.println("Button 1 was pressed");
	 doSedot(); 
	 }
	else
	System.out.println("Button 2 was pressed");
	 }
	 
	 public void doSedot()
	 {
	 if(x == 0 && y==0) 
	 {
	 statusMulutRobot = 300; // robot buka mulut
	 x = 30;
	 y = 30;
	 } else {
	 x = 0; //posisi sampah sudah bersih
	 y = 0; //posisi sampah sudah bersih
	 statusMulutRobot = 360; // probot tutup mulut
	 }
	 repaint();
	 }
	private void repaint() {
		// TODO Auto-generated method stub
		
	}
}