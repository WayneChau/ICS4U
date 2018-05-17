package Chau;

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
	Ball[] ball = new Ball[numBalls];
	
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Flying Flashing Balls");
		Group group = new Group();
        Canvas canvas = new Canvas(600, 600);
        canvas.setFocusTraversable(true);
        final GraphicsContext gc = canvas.getGraphicsContext2D();
        PlayerBall playerBall = new PlayerBall(500, 500, 0, (int)canvas.getWidth(), 0, (int)canvas.getHeight());
        playerBall.setColor(new Color( 0.5 , 0.5, 0.5, 1.0)); //PlayerBall outside color
        
        //create the balls for the game
		for (int i = 0; i < numBalls; i++) {
			ball[i] = new Ball(50, 50, 0, (int)canvas.getWidth(), 0, (int)canvas.getHeight());
			ball[i].setXSpeed(Math.random() * 16-8);
			ball[i].setYSpeed(Math.random() * 16-8);
			ball[i].setColor(new Color( 0 , 0.5, 0.5, 1.0));
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
					if (collisionBall(gc, playerBall) == true) {
						Platform.exit();
					}
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
	
	public boolean collisionBall (GraphicsContext gc, PlayerBall playerBall) {
		for (int i = 0; i < numBalls; i++) {
			if (playerBall.x >= playerBall.x && ball[i].x <= playerBall.x && ball[i].x >= playerBall.radius &&
					ball[i].y >= playerBall.y && ball[i].y <= playerBall.y && ball[i].y >= playerBall.radius) {
				return true;
			}
		}
		return false;
	}


	/**
	 * Clears the screen and paints the balls.
	 */
	public void draw(GraphicsContext gc) {
		gc.setFill(Color.BLACK);
		gc.fillRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
		for (int i = 0; i < numBalls; i++) {
			ball[i].draw(gc);
		}

		gc.drawImage(buffer, 0, 0); // double buffering
	}
	
	
	
}