/*A World Builder*/
public interface WBuilder {
    public WBuilder withBackgroundImage( String image );
    public WBuilder withEnemies( int number );
    public WBuilder withRewards( int number );
    public WBuilder withObstacles( int number );
    public WBuilder withTraps( int number );
    public GWorld buildWorld();
}
