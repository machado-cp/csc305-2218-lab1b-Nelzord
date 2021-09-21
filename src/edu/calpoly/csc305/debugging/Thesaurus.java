package edu.calpoly.csc305.debugging;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;

public class Thesaurus {
  private Map<String, List<String>> synonyms;


  public Thesaurus() {
    synonyms = new HashMap<>();
    //synonyms.put("interesting", Arrays.asList());
  }

  //check if there is a key inside the map and if not it is put instead of called
  public void addAlternatives(String word, String ... alternatives) {
    if (synonyms.containsKey(word)) {
      synonyms.get(word).addAll(Arrays.asList(alternatives));
    } else {
      synonyms.put(word, Arrays.asList(alternatives));
    }



  }

  public List<String> alternatives(String word) {
    return synonyms.get(word);
  }
}
