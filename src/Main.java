import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Array
//        Student[] studentArray = new Student[3];
//        studentArray[0] = new Student("Jing");
//        studentArray[1] = new Student("Jang");
//        studentArray[2] = new Student("Cheeta");
//
//        for (int i = 0; i < studentArray.length; i++) {
//            System.out.println(studentArray[i]);
//        }
//
//        for (Student s : studentArray) {
//            System.out.println(s);
//        }

            // ArrayList
//        ArrayList<String> subject = new ArrayList<>();
//        ArrayList<Student> studentArrayList = new ArrayList<>();
//
//        studentArrayList.add(new Student("Chai"));
//        studentArrayList.add(new Student("Big"));
//        studentArrayList.add(new Student("Zen"));
//        Student s1 = new Student("Mary");
//        studentArrayList.add(s1);
//
//        System.out.println("Size: " + studentArrayList.size());
//        System.out.println("Empty? " + studentArrayList.isEmpty());
////        System.out.println(studentArrayList);
//        for (Student s : studentArrayList ) {
//            s.addScore(100);
//            System.out.println(s);
//        }
//
//        System.out.println(studentArrayList.contains(s1) ? "yes" : "no");

            // HashSet, TreeSet
//        HashSet<Integer> integerHashSet = new HashSet<>();
//        integerHashSet.add(10);
//        integerHashSet.add(70);
//        integerHashSet.add(1016);
//        integerHashSet.add(10);
//
//        System.out.println(integerHashSet);
//
//        Set<Student> studentSet = new TreeSet<>();
//        studentSet.add(new Student("Non"));
//        studentSet.add(new Student("Tae"));
//        studentSet.add(new Student("Big"));
//        for (Student s : studentSet) {
//            System.out.println(s);
//        }

        Map<String, Student> studentMap = new TreeMap<>();
        studentMap.put("5901", new Student("Tae"));
        studentMap.put("5934", new Student("Pound"));
        studentMap.put("5922", new Student("Bew"));

        for (String id : studentMap.keySet()) {
            Student s = studentMap.get(id);
            s.addScore(100);
            System.out.println(id + " " + s);
        }
    }
}
