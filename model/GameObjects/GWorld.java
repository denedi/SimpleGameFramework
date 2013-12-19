/*A Game World*/
public interface GWorld {
    public void update();
    public void draw( Graphics2d graphics );
    public GPlayer getPlayer();
    public int getScore();
}
