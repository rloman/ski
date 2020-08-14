package nl.example.app.concurrency.copy.on.write.arraylist;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Application {

    public static void main(String[] args) {
        // problem but rocks. Do you see why?
        {

            List<Integer> numbers = new ArrayList<>();
            numbers.addAll(Arrays.asList(1, 1, 2, 5, 3, 4, 5, 5, 6));

            int size = numbers.size();

            // rocks since the size is queried per iteration
            for (int index = 0; index < size; index++) {
                if (5 == numbers.get(index)) {
                    numbers.remove(index--);
                    System.out.println(numbers);
                }
            }
            System.out.println(numbers);
        }

        // fails
        {
            List<Integer> numbers = new ArrayList<>();
            numbers.addAll(Arrays.asList(1, 1, 2, 3, 5, 8, 13));

            boolean hit = false;

            try {
                for (int element : numbers) {

                    if (element == 5) {
                        numbers.remove(new Integer(5));
                    }
                }
            } catch (ConcurrentModificationException cme) {
                // should come here!!!
                hit = true;
            }

            assert hit;
        }

        // rocks!
        {
            List<Integer> numbers = new CopyOnWriteArrayList<>();
            numbers.addAll(Arrays.asList(1, 1, 2, 3, 5, 8, 13));


            boolean hit = false;

            try {
                for (int element : numbers) {

                    if (element == 5) {
                        numbers.remove(new Integer(5));
                    }
                }
            } catch (ConcurrentModificationException cme) {
                // should NOT come here!!!
                hit = true;
            }

            assert !hit;

        }


    }

}
