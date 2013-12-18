public class SimpleGame implements Game, Runnable {
    private GWorld simpleWorld;
    private GView mainView;
    private GController mainController;

    public SimpleGame() {
        init();
    }
    
    protected void init() {
        simpleWorld = createWorld();
        mainView = new SView( simpleWorld );
        mainController = createController();
    }

    protected GWorld createWorld() {
        return new SimpleWBDirector().construct(new SimpleWBuilder);
    }

    protected GView createView() {
        return new SimpleGView(simpleWorld);
    }

    protected GController createController() {
        return new SimpleGController(simpleWorld, mainView);
    }
    
    public void launch() {
        new Thread(this).start();
    }

    public void run() {
        simpleWorld.update();
    }
}
