class Person{
    private int age;
    private String name;
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
public class Test1 {
    public static void main(String[] args) {
        Person stu = new Person();
        stu.setAge(21);
        stu.setName("aaaa");
        System.out.println(stu.getName() + stu.getAge());
    }
}
