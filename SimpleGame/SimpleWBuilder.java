public class SimpleWBuilder implements WBuilder {
    private SimpleGWorld world;
    public SimpleWBuilder() {
        world = new SimpleGWorld();
    }

    public WBuilder withBackgroundImage( String image ) {
        return this;
    }

    public WBuilder withEnemies( int number ) {
        return this;
    }

    public WBuilder withRewards( int n ) {
        return this;
    }

    public WBuilder withObstacles( int n ) {
        return this;
    }
    
    public WBuilder withTraps( int n ) {
        return this;
    }

    public GWorld buildWorld() {
        return world;
    }
}
