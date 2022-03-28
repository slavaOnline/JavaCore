package Lesson4;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] strings = {"adsf", "pkm"};
        List<String> arrayList2 = Arrays.asList(strings);
        ArrayList<String> arrayList = new ArrayList<>();

        Employee employee1 = new Employee("Slava", 480000);
        Employee employee2 = new Employee("Andrei", 5000000);
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        System.out.println(employeeArrayList);



        arrayList.add("Hello1");
        arrayList.add("Hello2");
        arrayList.add("Hello3");
        arrayList.add("Hello4");
        arrayList.add("Hello5");
        arrayList.add("Hello6");

        arrayList.remove("Hello5");
        arrayList.remove(0);

        arrayList.add(2,"Hello6");

        System.out.println(arrayList);
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.size());

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals("Hello6")) {
                System.out.println("Hello6 есть");
            }
        }

        System.out.println();
        HashMap<String, Employee> hashMap = new HashMap<>();
        hashMap.put("id405$2", employee1); // <String, Employee>
        hashMap.put("id455$8", employee2);
        hashMap.put("id405$3", employee1);
        hashMap.put("id455$4", employee2);
        hashMap.put("id405$2", employee2); // <String, Employee>
        System.out.println(hashMap);



        for (Map.Entry<String, Employee> mapEntry: hashMap.entrySet()) {
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }


        HashMap<Character, Integer> charSet = new HashMap<>();
        String word = "Слава ведёт преподавание";
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (charSet.get(chars[i]) == null) {
                charSet.put(chars[i], 1);
            }
            else {
                charSet.put(chars[i], charSet.get(chars[i]) + 1);
            }
        }

        //автор - множество книги
        HashMap<String, ArrayList<String>> authorsAndTheirBooks = new HashMap<>();

        /*
        Scanner sc = new Scanner(System.in);
        String name;
        String nameOfBook;
        for (int i = 0; i < 5; i++) {
            name = sc.nextLine();
            nameOfBook = sc.nextLine();

            if (authorsAndTheirBooks.get(name) != null) {
                authorsAndTheirBooks.get(name).add(nameOfBook);
            }
            else {
                ArrayList<String> tmp = new ArrayList<>();
                tmp.add(nameOfBook);
                authorsAndTheirBooks.put(name, tmp);
            }

        }
        System.out.println(authorsAndTheirBooks);



        System.out.println(charSet);

         */

        System.out.println();
        HashMap<String, String> testHashMap = new HashMap<>();
        testHashMap.put("Arckadiy", "asdf");
        testHashMap.put("Dmitriy", "asdf");
        testHashMap.put("Boris", "asdf");
        testHashMap.put("Yan", "asdf");
        System.out.println(testHashMap);

        LinkedHashMap<String, String> testLinkedHashMap = new LinkedHashMap<>();
        testLinkedHashMap.put("Arckadiy", "asdf");
        testLinkedHashMap.put("Dmitriy", "asdf");
        testLinkedHashMap.put("Boris", "asdf");
        testLinkedHashMap.put("Yan", "asdf");
        System.out.println(testLinkedHashMap);

        TreeMap<String, String> testTreeMap = new TreeMap<>();
        testTreeMap.put("Arckadiy", "asdf");
        testTreeMap.put("Dmitriy", "asdf");
        testTreeMap.put("Boris", "asdf");
        testTreeMap.put("Yan", "asdf");
        System.out.println(testTreeMap);

        System.out.println();
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Альфа");
        hashSet.add("Альфа");
        hashSet.add("Омега");
        hashSet.add("Бета");
        hashSet.add("Альфа");
        hashSet.add("Омега");
        hashSet.add("Альфа");
        hashSet.add("Омега");
        hashSet.add("Бета");
        hashSet.add("asfgsdgf");
        System.out.println(hashSet);

        LinkedHashSet<String> hashSet1 = new LinkedHashSet<>();
        hashSet1.add("Альфа");
        hashSet1.add("Альфа");
        hashSet1.add("Омега");
        hashSet1.add("asfgsdgf");
        hashSet1.add("Бета");
        hashSet1.add("Альфа");
        hashSet1.add("Омега");
        hashSet1.add("Альфа");
        hashSet1.add("Омега");
        hashSet1.add("Бета");
        System.out.println(hashSet1);


        System.out.println();
        TreeSet<String> hashSet2 = new TreeSet<>();
        // null
        hashSet2.add("Альфа");
        hashSet2.add("Омега");
        hashSet2.add("Бета");
        hashSet2.add("asfgsdgf"); //iter = asfgsdgf
        // null
        System.out.println(hashSet2);
        System.out.println();

        Iterator<String> iterator = hashSet2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();
        String[] names = {"asf", "safwsdf", "asdfaf"};
        for (String object: names) {
            System.out.println(object);
        }


        System.out.println();

        ArrayList<Employee> arrayList1 = new ArrayList<>();
        arrayList1.add(employee2);
        arrayList1.add(employee1);
        System.out.println(arrayList1);
        Collections.sort(arrayList1);
        System.out.println(arrayList1);





    }

}
