package interrupting;

import static java.lang.Thread.sleep;

public class MainStop {
  public static void main(String[] args) throws InterruptedException {
    class StoppableThread extends Thread{
      boolean stop = false;
      public void run(){
        while (stop!=true){
          System.out.println("Thread is at step 1");
          System.out.println("Thread is at step 2");
          System.out.println("Thread is at step 3");
        }
      }

      public void setStop(){
        System.out.println("Stop set to true");
        stop=true;}
    }
    StoppableThread st=new StoppableThread();
    st.start();
    sleep(10);
    st.setStop();
  }
}
