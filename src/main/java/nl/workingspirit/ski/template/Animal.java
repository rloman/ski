package nl.workingspirit.ski.template;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Animal {
   
   private String name;
   private LocalDate birthDate;
   
   public Animal(String name, LocalDate birthDate) {
      this.name = name;
      this.birthDate = birthDate;
   }
   
   public Animal() {
      this.name = "Mickey - our cat";
      this.birthDate = LocalDate.of(2011, 3, 9);
   }
   
   public long getAge() {
      return ChronoUnit.YEARS.between(this.birthDate,  LocalDate.now());
   }
   
   public abstract void makeSound();

   
   public String getName() {
      return name;
   }

   
   public void setName(String name) {
      this.name = name;
   }

}
