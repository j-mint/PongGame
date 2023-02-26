import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Ball extends Rectangle {

	Random random;
	int xVelocity;
	int yVelocity;

	Ball(int x, int y, int width, int height) {
		super(x, y, width, height);
		random = new Random();
		int randomXDirection = random.nextInt(2);
		if (randomXDirection == 0)
			randomXDirection--;
		setXDirection(randomXDirection);
		
		int randomYDirection = random.nextInt(2);
		if (randomYDirection == 0)
			randomYDirection--;
		setYDirection(randomYDirection);

	}

	public void setXDirection(int randomXDirection) {
		xVelocity = randomXDirection;
	}

	public void setYDirection(int randomYDirection) {
		yVelocity = randomYDirection;
	}

	public void move() {
		x+= xVelocity;
		y+= yVelocity;
	}

	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillOval(x, y, width, height);
	}
}
