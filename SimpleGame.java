public class SimpleGame implements Game, Runnable {
    private GWorld simpleWorld;
    private GView mainView;
    private GController mainController;

    public SimpleGame() {
        simpleWorld = createWorld();
        mainView = new SView( simpleWorld );
        mainController = createController();
    }

    public void launch() {
        new Thread(this).start();
    }

    public void run() {
        simpleWorld.update();
    }

    protected GController createController() {
        
    }
}
