public class Student extends Person implements Comparable<Person> {
    public @Override int compareTo(Person p) {
        return age - p.age;
    }
}