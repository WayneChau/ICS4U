package Chau;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import javax.xml.stream.EventFilter;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * This is the beginning of a simple game. You should expand it into a dodgeball
 * game, where the user controls an object with the mouse or keyboard, and tries
 * to avoid the balls flying around the screen. If they get hit, it's game over.
 * If they survive for 20 seconds (or some other fixed time), they go on to the
 * next level. <br>
 * <br>
 * Should be run at around 500x300 pixels.<br>
 * <br>
 * December 9, 2007.
 * 
 * @author Sam Scott
 */


@SuppressWarnings("serial")
public class GameApp extends Application{

	/**
	 * Buffer for double buffering.
	 */
	Image buffer;
	/**
	 * The number of balls on the screen.
	 */
	final int numBalls = 20;
	/**
	 * The pause between repainting (should be set for about 30 frames per
	 * second).
	 */
	final int pauseDuration = 20;
	/**
	 * An array of balls.
	 */
	//Ball[] ball = new Ball[numBalls];
    ArrayList <Ball> ball  = new ArrayList<Ball>(); 
    int counter = 0;//three lives
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Dodge Ball - 3 Lives, after 3 hits the games ends!");
		Group group = new Group();
        Canvas canvas = new Canvas(600, 600);
        canvas.setFocusTraversable(true);
        final GraphicsContext gc = canvas.getGraphicsContext2D();
        PlayerBall playerBall = new PlayerBall(500, 500, 0, (int)canvas.getWidth(), 0, (int)canvas.getHeight());
        playerBall.setColor(new Color( 0.5 , 0.5, 0.5, 1.0)); //PlayerBall outside color
        
        //create the balls for the game
		for (int i = 0; i < numBalls; i++) {
			
			Ball b = new Ball(50, 50, 0, (int)canvas.getWidth(), 0, (int)canvas.getHeight());
			ball.add(b);
			ball.get(i).setXSpeed(Math.random() * 16-8);
			ball.get(i).setYSpeed(Math.random() * 16-8);
			ball.get(i).setColor(new Color( 0 , 0.5, 0.5, 1.0));
		}
		
		//creates a thread to run the game
		Thread game = new Thread(new Runnable() {
			/**
			 * Repaints the canvas periodically.
			 */
			@Override
			public void run() {
				while (true) {
					draw(gc);
					playerBall.draw(gc);
					collisionBall(playerBall,canvas);
					try {
						Thread.sleep(pauseDuration);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		
		//Pressed
		canvas.setOnKeyPressed( event -> {
			if (event.getCode() == KeyCode.W) {
				playerBall.setYSpeed(-10);
			}
			if (event.getCode() == KeyCode.S) {
				playerBall.setYSpeed(10);
			}
			if (event.getCode() == KeyCode.A) {
				playerBall.setXSpeed(-10);
			}
			if (event.getCode() == KeyCode.D) {
				playerBall.setXSpeed(10);
			}
		});

		//Released
		canvas.setOnKeyReleased( event -> {
			if (event.getCode() == KeyCode.W) {
				playerBall.setXSpeed(0);
				playerBall.setYSpeed(0);
			}
			if (event.getCode() == KeyCode.S) {
				playerBall.setXSpeed(0);
				playerBall.setYSpeed(0);
			}
			if (event.getCode() == KeyCode.A) {
				playerBall.setXSpeed(0);
				playerBall.setYSpeed(0);
			}
			if (event.getCode() == KeyCode.D) {
				playerBall.setXSpeed(0);
				playerBall.setYSpeed(0);
			}
		});
		
		
		group.getChildren().add(canvas);
        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        
		game.start();		
		primaryStage.show();
		
	}
	
	public void collisionBall (PlayerBall playerBall, Canvas canvas) {
		
		double xpMid = playerBall.getX() + playerBall.getRadius();
		double ypMid = playerBall.getY() + playerBall.getRadius();
		for (int i = 0; i < ball.size(); i++) {
			double xbMid = ball.get(i).getX() + ball.get(i).getRadius();
			double ybMid = ball.get(i).getY() + ball.get(i).getRadius();
			double dist = Math.sqrt(Math.pow(xpMid-xbMid,2) + Math.pow(ypMid-ybMid,2));
			if (dist <= playerBall.getRadius() + ball.get(i).getRadius()) {
					ball.get(i).setX((int)(Math.random()*canvas.getWidth()));
					ball.get(i).setY((int)(Math.random()*canvas.getHeight()));
					System.out.println("HIT!!");
					counter++;
			}
			if (counter == 3) {
				Platform.exit();
				System.exit(0);
			}
		}
	}


	/**
	 * Clears the screen and paints the balls.
	 */
	public void draw(GraphicsContext gc) {
		gc.setFill(Color.BLACK);
		gc.fillRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
		for (int i = 0; i < numBalls; i++) {
			ball.get(i).draw(gc);
		}
	}
	
	
	
}