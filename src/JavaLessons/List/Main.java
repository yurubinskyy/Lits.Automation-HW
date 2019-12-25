package List;

import java.util.*;

public class Main {
    public static void main(String[] args) {

       /* String [] arrayName = {"Jack", "Rob", "Jon", "Bob", "Ivan", "Petro"};

        ArrayList<String> arrayList = new ArrayList();


        for (int i = 0; i < arrayName.length; i++) {
             arrayList.add(arrayName[i]);
            System.out.println(arrayList.get(i));
        }

        for (int i = arrayList.size()-1 ; i >= 0; i--) {
            System.out.println(arrayList.get(i));
        }*/

        /*Random random= new Random();

        List<Integer> numbers = new ArrayList();

        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(100));
        }

        System.out.println(numbers);

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
            iterator.remove();
        }

        System.out.println("Numbers:" + numbers);*/

       /* Person p1 = new Person ("Max", 13);
        Person p3 = new Person("Jack", 10);
        Person p4 = new Person("Nick", 15);

        TreeSet<Person> sortedPeople = new TreeSet();
        sortedPeople.add(p1);
        sortedPeople.add(p4);
        sortedPeople.add(p3);

        System.out.println(sortedPeople);

        //System.out.println(p1.compareTo(p2));*/

       HashMap<String, String> stringStringHashMap = new HashMap();
       stringStringHashMap.put("dfgh", "dssd");

       TreeMap<String, String> stringStringTreeMap = new TreeMap();
       stringStringTreeMap.put("key", "dssd");

       //LinkedHashMap<String, String> linkedHashMap =


    }
}
