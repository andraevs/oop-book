package observer;

public class Follower implements Observer{
  private String followerName;

  public Follower(String followerName) {
    this.followerName = followerName;
  }

  @Override
  public void update(String p) {
    System.out.println(followerName + " read post "+p);
  }
}
