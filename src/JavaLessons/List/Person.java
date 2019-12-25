package List;

public class Person implements Comparable<Person> {

    private String name;
    private Integer age;

    public Person (String name, int age){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return o.age.compareTo(this.age) -
                o.name.compareTo(this.name);
    }
}
