package nl.workingspirit.ski.designpatterns.iterator;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Stock implements Iterable<Card> {

   private Set<Card> stock = new HashSet<>();

   public void add(Card card) {
      this.stock.add(card);
   }

   @Override
   public Iterator<Card> iterator() {
     return this.stock.iterator();
   }
   
   public Collection<Card> unmod() {
      return Collections.unmodifiableCollection(this.stock);
   }
}
