package week2;

import acm.program.GraphicsProgram;
import acm.graphics.GOval;
import acm.util.RandomGenerator;


public class RandomCircles extends GraphicsProgram {
private static final int NUC = 10;
private static final double max_radius = 50;
private static final double min_radius = 5;




public void run ()
{
	RandomGenerator rgen = new RandomGenerator();
	for (int i =  0; i <=10; i++) {
		
	int x = rgen.nextInt(10,200);
	int y = rgen.nextInt(50,400);
	int r = rgen.nextInt(5,50);

	GOval circle = new GOval (x,y,r, r);
	circle.setColor(rgen.nextColor());
	circle.setFilled(true);
		add (circle);
	
	
	
	
		
		
	}

	
}

}
