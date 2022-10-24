import rpg.Monster;

import java.util.*;

import java.util.ArrayList;

public class ArrayListsLecture {

    public static void main(String[] args) {


        // CHECK PULLED LECTURE IN WEYWOT JAVA EX FOR ALL COMMENTS ON THIS EX


        // create an empty array list
        ArrayList<Monster> monsterArrayList = new ArrayList<>();
        // comparison to
        Monster orc = new Monster(13,15,9,"Orc");
        Monster ogre = new Monster(11,59,13,"Ogre");
        Monster blueDragon = new Monster(19,225,23,"Blue Dragon");
        Monster frostGiant = new Monster(15,138,25,"Frost Giant");
        Monster goblin = new Monster(15,7,5,"Goblin");
        Monster werewolf = new Monster(11,58,7,"Werewolf");
        monsterArrayList.add(orc); // adds monster to the list
//        System.out.println(monsterArrayList.size());
//        System.out.println(monsterArrayList.get(0).getName()); // gets something out of the array list.. the number in () refers to the index of the object
        monsterArrayList.add(ogre);
//        System.out.println(monsterArrayList.size());
//        System.out.println(monsterArrayList.get(1).getArmorClass());
//        System.out.println(monsterArrayList);

        // how to add multiple objects to an arrayList all at once
        List<Monster> newMonsterList = new ArrayList<>(List.of(goblin, blueDragon, frostGiant, werewolf));
//        System.out.println(newMonsterList);
//        System.out.println(newMonsterList.get(1));
//        System.out.println(newMonsterList.get(1).getHitPoints());

        monsterArrayList.addAll(newMonsterList);
//        System.out.println(monsterArrayList);
        newMonsterList = monsterArrayList;
//        System.out.println(newMonsterList);
//        System.out.println(werewolf);
//        System.out.println(monsterArrayList.get(5));



        //Loop over arrayLists
        // traditional for loop
        // use traditional for loop when you need the index
        for (int i = 0; i < monsterArrayList.size(); i++ ) {
            if (i == monsterArrayList.size() - 1) {
                System.out.printf("%s%n", monsterArrayList.get(i));
            } else {
                System.out.printf("%s, ", monsterArrayList.get(i));
            }
        }

        //Enhanced for loop
        // simpler syntax but no access to the index
        for (Monster monster : monsterArrayList){
            System.out.println(monster.getHitPoints());
        }

        // When creating an ArrayList of primitive data types, use the corresponding object wrapper. ArrayLists can only contain objects
        ArrayList<Integer> myNumbers = new ArrayList<>(List.of(1,89,34,-67,99,23));
        System.out.println(myNumbers);
        Collections.sort(myNumbers);
        System.out.println(myNumbers);
        ArrayList<String> randomWords = new ArrayList<>(List.of("version","suntan","bond","defeat","later","rate"));
        System.out.println(randomWords);
        Collections.sort(randomWords);
        System.out.println(randomWords);

        // :: gives a reference to a method
        System.out.println(monsterArrayList);
        monsterArrayList.sort(Comparator.comparing(Monster :: getHitPoints));
        System.out.println(monsterArrayList);

        // to use the compare() method that we wrote in the monster class, we use
        //




    } // end of main method

} //  end of the CollectionsLecture class
