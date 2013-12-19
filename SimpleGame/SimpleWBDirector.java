public class SimpleWBDirector {
    SimpleWBuilder builder;
    
    public SimpleWBDirector( SimpleWBuilder builder ) {
        this.builder = builder;
    }

    public GWorld construct() {
        return builder.getWorld();
    }
}
