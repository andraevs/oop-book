package observer;

public class Main {
  public static void main(String[] args) {
    Page page = new Page("Useful mountaineering advices");
    Follower f1 = new Follower("Beginner");
    page.attach(f1);
    Follower f2 = new Follower("Advanced");
    page.attach(f2);
    page.addPost("Always bring water");
  }
}
