import java.util.*;

public class Dictionary{
  private ArrayList<Pair> data;

  public Dictionary(){
    data = new ArrayList<Pair>();
  }
  public Dictionary(String[] words, String[] definitions){
    data = new ArrayList<Pair>();
    for (int x = 0; x < words.length; x++) {
      Pair p = new Pair(words[x], definitions[x]);
      data.add(p);
    }
  }
  public void addEntry(String word, String def){
    Pair p = new Pair(word, def);
    data.add(p); 
  }
  public String getDef(String word){
    for(int i = 0 ; i < data.size(); i++){ //initial: 4 op, repeat: 3 op
      if(data.get(i).getKey().equals(word)){ //3 op     5 op if true
        return data.get(i).getValue(); //2 op    3 op if false
      }
    }
    return ""; // 4 + (n/2)(3+3) = 3n+4
  } 
  
  public boolean randomFlashCard(){
    Scanner scan = new Scanner(System.in);
    
    Random r = new Random();
    int upperBound = data.size();
    int index = r.nextInt(upperBound);

    System.out.println(data.get(index).getDef()));

    String ans = scan.next();
    if(data.get(index).getKey().equals(ans)){
      System.out.println("Correct");
      return true;
    }
    else{
      System.out.println("Incorrect");
      return false;
    }
  }
}
