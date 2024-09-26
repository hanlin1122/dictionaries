public class SortedDictionary extends Dictionary{
  public void addEntry(String word, String def){
    Pair p = new Pair(word, def);
    int index = BSA(word);
    data.add(p, index);
  }
  public String getDef(String word){
    int low = 0;
    int high = data.size();
    int mid;
    while(low <= high){
      mid = (low + high) / 2;
      if (word.compareTo(data.get(mid).getKey()) < 0){
        high = mid - 1;
      }
      else if(word.compareTo(data.get(mid).getKey()) > 0){
        low = mid + 1;
      }
      else{
        return data.get(mid).getValue();
      }
    }
    return "Not Found.";
  }
  public int BSA(String word){
    int low = 0;
    int high = data.size();
    int mid;
    while(low <= high){
      mid = (low+high)/2;
      if(word.compareTo(data.get(mid).getKey()) < 0){
        high = mid-1;
      }
      else if(word.compareTo(data.get(mid).getKey()) > 0){
        low = mid+1;
      }
      else{
        return mid;
      }
    }
    return low;
  }
}
