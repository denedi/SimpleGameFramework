/*A World Builder*/
public interface WBuilder {
    public void buildObstacles(int n, int x, int y);
    public void setRewards(int n, int x, int y);
    public void setTrap(int x, int y);
    public GWorld getWorld();
}
