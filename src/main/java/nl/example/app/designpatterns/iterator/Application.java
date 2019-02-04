package nl.example.app.designpatterns.iterator;

import java.util.Collection;
import java.util.Iterator;

public class Application {

   public static void main(String[] args) {

      Card aas = new Card("Aas");
      Card boer = new Card("Boer");
      Card joker = new Card("Joker");

      Stock cards = new Stock();
      cards.add(aas);
      cards.add(boer);
      cards.add(joker);

      // stomme manier
//      for (Card element : cards.getStock()) {

//         System.out.println(element);

//      }

      // probleem
//      cards.getStock().remove(aas);

	 // slimme en goede manier
      for (Card element : cards) {

         System.out.println(element);
      }
      
      Iterator<Card> kaartenIterator = cards.iterator();
      
      while(kaartenIterator.hasNext()) {
         Card c = kaartenIterator.next();
         System.out.println(c);
      }

      
   }

}
