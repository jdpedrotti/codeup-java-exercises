import rpg.Monster;

import java.util.*;

import static java.util.Map.entry;

public class HashMapsLecture {
    public static void main(String[] args) {

        Monster orc = new Monster(13,15,9,"Orc");
        Monster ogre = new Monster(11,59,13,"Ogre");
        Monster blueDragon = new Monster(19,225,23,"Blue Dragon");
        Monster frostGiant = new Monster(15,138,25,"Frost Giant");
        Monster goblin = new Monster(15,7,5,"Goblin");
        Monster werewolf = new Monster(11,58,7,"Werewolf");
        Monster orcWarChief = new Monster(16,93,15,"Orc War Chief");

        // Create a new hashmap defining the key and value data types between <> brackets
        HashMap<String, Monster> monsterHashMap = new HashMap<>();

        // add a key value pair to the hashmap using .put()
        monsterHashMap.put("orc", orc);
        // Access a value in the hashmap using .get() with the key
        System.out.println(monsterHashMap.get("orc"));
        System.out.println(monsterHashMap.get("orc").getHitPoints());

        // Replace a value in the hashmap using .replace()
        monsterHashMap.replace("orc", orcWarChief);
        System.out.println(monsterHashMap.get("orc"));
        System.out.println(monsterHashMap.get("orc").getHitPoints());

        // to add multiple objects to a hashmap at once
        // use Map.ofEntries();
        Map<String, Monster> intermediateMap = Map.ofEntries(
                entry("blue dragon", blueDragon),
                entry("ogre", ogre),
                entry("werewolf", werewolf),
                entry("frost giant", frostGiant),
                entry("goblin", goblin),
                entry("orc war chief", orcWarChief)
        );
        monsterHashMap.putAll(intermediateMap);

        System.out.println(monsterHashMap.get("frost giant"));
        System.out.println(monsterHashMap.get("werewolf").getHitPoints());

        // looping over hashmaps    technique 1:
        // user .entrySet to derive a set of entries
        // Each entry is represented as a Map. Entry<DataTypeOfKey,
        // DataTypeOfValue>>
        // Once you have an entrySet you can use an enhanced loop to loop over it
        System.out.println("Loop over entrySet");
        for(Map.Entry<String, Monster> monsterEntry : monsterHashMap.entrySet()){
            Monster monster = monsterEntry.getValue();
            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        }


        // Technique 2: let the keyset convert it to a list and loop over
        // the list

        // To create a list of specific properties in the objects
        // stored as HashMap values, we can use .keySet().stream().toList()

        List<String> monsterNames = new ArrayList<>(monsterHashMap.keySet().stream().toList());
        // Once you have a list, it can be sorted and do other list things to it
        Collections.sort(monsterNames);
        System.out.println(monsterNames);

        // The strings generated from the keyset are the keys to the HashMap
        // looping over this list allows me to access all the HashMap entries

        System.out.println("Loop over keySet converted to list");
        for (String monsterName : monsterNames){
            Monster monster = monsterHashMap.get(monsterName);
            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        }

        // Technique 3: the forEach loop

        System.out.println("For Each loop: ");
        monsterHashMap.forEach((key, monster) -> {
            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        });


        System.out.println("Output of the forEach over the treeMap");
        Map<String, Monster> monsterTreeMap = new TreeMap<>(monsterHashMap);
        monsterHashMap.forEach((key, monster) -> {
            System.out.printf("The %s has %d hit points, an armor class of %d, and does %d damage.%n", monster, monster.getHitPoints(), monster.getArmorClass(), monster.getDamage());
        });

        Object[] monstersArray = monsterHashMap.values().toArray();
        for (Object monster : monstersArray){
            int hitPoints = ((Monster) monster).getHitPoints();
            System.out.println(hitPoints);
        }

        Monster[] monstersArray2 = monsterHashMap.values().toArray(new Monster[0]);
        for (Monster monster : monstersArray2){
            System.out.println(monster.getName() + " has " + monster.getHitPoints() + " hit points");
        }








    } // end of main method
} // end of class
