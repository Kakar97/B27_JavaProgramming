package practice1.teacher;

public class Teacher {


public String name;
public int age;
public double time;
public String teachingTime;

public Teacher(String name, int age, double time, String teachingTime ){

    this.name = name;
    this.age = age;
    this.time = time;
    this.teachingTime = teachingTime;


}

    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", time=" + time +
                ", teachingTime='" + teachingTime + '\'' +
                '}';
    }
}
