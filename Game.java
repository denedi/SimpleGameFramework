/*A Game*/
public interface Game extends Runnable {
   public void run();
   public void play();
   public void pause();
   public void exit();
   public void setState(GState state);
   public GState getState();
}
