import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;
public class Panel extends JPanel{
	private static final long serialVersionUID = 1L;
	private int level=0;
	public Panel()
	{
	super();
	level=Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
	
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		drawSnow(g,level,20,280,280,280);
		drawSnow(g,level,280,280,150,20);
		drawSnow(g,level,150,20,20,280);
		
	}
	public void drawSnow(Graphics g,int n,int x1, int y1, int x5, int y5)
	{
		int deltaX,deltaY,x2,x3,x4,y2,y3,y4;
		if(n==0)
		{
			g.drawLine(x1, y1, x5, y5);
		}
		else
		{
			deltaX=x5-x1;
			deltaY=y5-y1;
			x2=x1+deltaX/3;
			y2=y1+deltaY/3;
			x3=(int)(0.5*(x1+x5)+Math.sqrt(3)*(y1-y5)/6);
			y3=(int)(0.5*(y1+y5)+Math.sqrt(3)*(x5-x1)/6);
			x4=x1+2*deltaX/3;
			y4=y1+2*deltaY/3;
			drawSnow(g,n-1,x1,y1,x2,y2);
			drawSnow(g,n-1,x2,y2,x3,y3);
			drawSnow(g,n-1,x3,y3,x4,y4);
			drawSnow(g,n-1,x4,y4,x5,y5);
		}
	}
	
}
