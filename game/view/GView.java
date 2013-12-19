

import java.awt.Graphics2D;
import javax.swing.JFrame;

public class GView extends JFrame {
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
