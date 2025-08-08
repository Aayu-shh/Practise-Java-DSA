package InterviewQuestionDump.Wissen.Round2;

import java.util.HashSet;
import java.util.Objects;

public class HashSetTricky {

    public static void main(String[] args) {
        HashSet<Student> studentHashSet = new HashSet<>();
        Student s1 = new Student(101,"aayush");
        Student s2 = new Student(102,"lakshmi");
        Student s3 = new Student(101,"aayush");
        studentHashSet.add(s1);
        studentHashSet.add(s2);
        System.out.println("Size of Student hashet with distinct logical objs: "+studentHashSet.size());
        System.out.println(" Student hashet with distinct logical objs: "+studentHashSet);
        studentHashSet.add(s3);
        System.out.println(" Student hashet with new duplicate logical obj s3: "+studentHashSet);

        s2.setId(104);
        System.out.println("Does hashset contain s2(post change) which was added: "+studentHashSet.contains(s2));

    }
}
class Student{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void setId(int id) { this.id = id; } // Setter
    public void setName(String name) { this.name = name; } // Setter

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}