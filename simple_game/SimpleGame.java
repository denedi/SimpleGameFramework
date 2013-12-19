/*A Simple Game skeleton*/
public abstract class SimpleGame implements Game {
    protected GWorld simpleWorld;
    protected GView mainView;
    protected GController mainController;

    public final GState PAUSED;
    public final GState STOPPED;
    public final GState PLAYING;

    private GameState current;

    public SimpleGame() {
        STOPPED = new StoppedState();
        PAUSED = new PausedState();
        PLAYING = new PlayingState();
        current = STOPPED;
        init();
    }
    
    private void init() {
        simpleWorld = createWorld();
        mainView = createView();
        mainController = createController();
    }

    protected abstract GView createView();

    protected abstract GWorld createWorld();

    protected abstract GController createController(); 
    
    public void run() {
        play();
    }
    
    public void play() {
        while( true ){
            current.play(this);
        }
    }

    public void pause() {
        current.pause(this);
    }

    public void exit() {
        
    }

    public void setState( GState state ) {
        this.current = state;
    }

    public GState getState() {
        return this.current;
    }
}
