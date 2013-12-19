import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;
import java.awt.Transparency;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SimpleGView extends JFrame implements GView {
    private GWorld world;
    private Game game;
    private Graphics2D 2d_tool;

    public SimpleGView( GWorld world, Game game ) {
        this.world = world;
        this.game = game;
        /*Initialize Graphics tool*/
    }

    public void draw() {
        world.draw(2d_tool);
    }
}
