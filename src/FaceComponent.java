import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class FaceComponent extends JComponent{
	
	int R = (int)(Math.random()*256);
	int G = (int)(Math.random()*256);
	int B = (int)(Math.random()*256);
	
	Color randomColor = new Color(R,G,B);
	
	
	private int number;
	Suprise messages = new Suprise();
	
	public FaceComponent(int number){
		this.number=number;
	}
	
	public void paintComponent(Graphics g){
		
		//Recover Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		super.paintComponent(g2);
		//g2.clearRect(0, 0, 1200, 1200);
		
			
		//Draw the head
		Ellipse2D.Double head = new Ellipse2D.Double(20, 40, 400, 600);
		g2.setColor(randomColor);
		g2.fill(head);
		g2.draw(head);
		
		
		//Draw the eyes
		g2.setColor(Color.GREEN);
		Rectangle eye = new Rectangle(150, 280, 60, 60);
		g2.fill(eye);
		eye.translate(100, 0);
		g2.fill(eye);
		
		//Draw the pupils
		g2.setColor(Color.WHITE);
		Rectangle pup = new Rectangle(150, 280, 30, 30);
		g2.fill(pup);
		pup.translate(100, 0);
		g2.fill(pup);
		
		//Draw the mouth   
		CubicCurve2D.Double mouth1 = new CubicCurve2D.Double(80, 460, 300, 800, 400, 300, 380, 460);
		g2.setColor(Color.RED);
		g2.setStroke(new BasicStroke(25));
		g2.draw(mouth1);
		
		//Draw the greeting
		g2.setColor(Color.BLUE);
		g2.setFont(new Font("TimesRoman", Font.PLAIN, 50));
		g2.getFontMetrics();
		//husk 
		//g2.drawString("", 5, 700); 
		drawString(g2,messages.getHappyMessage(this.number), 5, 600);
		
	}
	
	 private void drawString(Graphics g, String text, int x, int y) {
         for (String line : text.split("\n"))
             g.drawString(line, x, y += g.getFontMetrics().getHeight());
         
     }

//	private void drawtabString(Graphics g, String text, int x, int y) {
//	     for (String line : text.split("\t"))
//	         g.drawString(line, x += g.getFontMetrics().getHeight(), y);
//	 }
//	
	
    
    
}

