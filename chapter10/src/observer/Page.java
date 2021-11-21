package observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Page {
  Set<Observer> observers = new HashSet<>();
  List<String> posts = new ArrayList<>();
  private String pageName;

  public Page(String pageName) {
    this.pageName=pageName;
  }

  public void attach(Observer o){
    observers.add(o);
  }

  public void detach(Observer o){
    observers.remove(o);
  }

  public void addPost(String p){
    posts.add(p);
    observers.forEach(o->o.update(p));
  }
}
