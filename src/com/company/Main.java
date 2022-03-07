package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        String arg0 = args[0];

        testLoop();

    }

    public static void testLoop(){

        Random rand = new Random();

        int fileRange = 7;
        int domainRange = 5;

        LinkedList<LinkedList> mainList = new LinkedList<>();

        for (int i = 0; i < fileRange; i++) {

            LinkedList<Integer> internalList = new LinkedList<>();

            System.out.println("start loop");
            int current = fileRange;
            System.out.println("current i: "+i+" current position: "+current);
            int perms;
            int prev = 0;
            int j = 0;
            System.out.println("current i: "+i+" current position: "+current);

            while(current < fileRange + domainRange) {

                current = current + rand.nextInt(domainRange);
                if (current >= fileRange + domainRange)
                    break;
                if(current == prev)
                    current++;
                perms = rand.nextInt(3) + 1;
                prev = current;

                System.out.println("current j: "+j+" current position: "+current);

                //if (current >= fileRange + domainRange)
                //break;

                internalList.add(current);
                internalList.add(perms);
                j++;
                for(int k = 0; k < internalList.size();k++)
                    System.out.print(internalList.get(k));
                System.out.println();

            }
            mainList.add(internalList);
            System.out.println("complete");
        }
    }
}