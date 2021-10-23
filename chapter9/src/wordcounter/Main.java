package wordcounter;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    File parent = new File("files");
    File[] files = parent.listFiles();
    int numberOfFiles = files.length;
    int numberOfThreads = 2;
    WordCounter wordCounter[] = new WordCounter[numberOfThreads];
    int k = 0;
    for(int i = 0;i<numberOfThreads;i++){
      File[] currentFiles = new File[numberOfFiles/numberOfThreads];
      for(int j=0;j< numberOfFiles/numberOfThreads;j++)
        currentFiles[j]=files[j + k*numberOfFiles/numberOfThreads];
      wordCounter[i] = new WordCounter(currentFiles);
      wordCounter[i].start();
      wordCounter[i].join();
      k++;
    }
    Map<String,Integer> wc = new TreeMap<>();
    for(int i = 0 ;i < numberOfThreads;i++){
      Map<String,Integer> currentWc = wordCounter[i].getWc();
      for(String key : currentWc.keySet()){
        if(wc.containsKey(key))
          wc.put(key, wc.get(key)+currentWc.get(key));
        else
          wc.put(key,currentWc.get(key));
      }
    }
    System.out.println(wc);
  }
}
