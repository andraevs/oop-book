package wordcounter;

import java.io.*;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public class WordCounter extends Thread{
  private File[] files;
  private Map<String,Integer> wc = new TreeMap<>();

  public WordCounter(File[] files) {
    this.files = files;
  }

  public Map<String, Integer> getWc() {
    return wc;
  }

  public void run(){
    for(File file : files){
      try {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String currentLine;
        while( (currentLine = br.readLine()) != null){
          String words[] = currentLine.split(" ");
          for(String word : words){
            word = word.toLowerCase();
            if(wc.containsKey(word))
              wc.put(word, wc.get(word)+1);
            else
              wc.put(word,1);
          }
        }
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
