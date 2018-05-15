package Chau;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
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
	final int numBalls = 100;
	/**
	 * The pause between repainting (should be set for about 30 frames per
	 * second).
	 */
	final int pauseDuration = 40;
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
        PlayerBall playerBall = new PlayerBall(50, 50, 0, (int)canvas.getWidth(), 0, (int)canvas.getHeight());
        
        //create the balls for the game
		for (int i = 0; i < numBalls; i++) {
			ball[i] = new Ball(50, 50, 0, (int)canvas.getWidth(), 0, (int)canvas.getHeight());
			ball[i].setXSpeed(Math.random() * 16-8);
			ball[i].setYSpeed(Math.random() * 16-8);
			ball[i].setColor(new Color( Math.random() , Math.random(), Math.random(), 1.0));
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
					try {
						Thread.sleep(pauseDuration);
					} catch (InterruptedException e) {
					}
				}
			}
		});
		
        group.getChildren().add(canvas);
        Scene scene = new Scene(group);
        primaryStage.setScene(scene);
        
		game.start();		
		primaryStage.show();
		
	}
	


	/**
	 * Clears the screen and paints the balls.
	 */
	public void draw(GraphicsContext gc) {
		gc.setFill(Color.WHITE);
		gc.fillRect(0, 0, gc.getCanvas().getWidth(), gc.getCanvas().getHeight());
		for (int i = 0; i < numBalls; i++) {
			ball[i].draw(gc);
		}

		gc.drawImage(buffer, 0, 0); // double buffering
	}
	
	
}