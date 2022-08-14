class Animal {
    private int age;
    private String name;

    public int a;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void fun1(){
        System.out.println("pppp");
    }
}
//继承：把两个类共有的部分成员变量或者成员方法抽离出来，形成父类，子类继承
//继承之后必须要有新成员，体现出和父类的差异，否则就没必要继承了
class Dog extends Animal{
    public int a;
    public void fun1(){
        //当子类和父类有相同成员变量或者方法时，先访问子类当中
        a = 10;
        System.out.println(a);
        System.out.println("汪汪");
    }
}
class Cat extends Animal{
    public void fun2() {
        System.out.println("喵喵");
    }

}
public class Test12 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setAge(21);
        dog.setName("aaaaa");
        System.out.println("name: " + dog.getName() + " age: " + dog.getAge());
        dog.fun1();
        Cat cat = new Cat();
        cat.setName("bbbbb");
        cat.setAge(22);

    }
}
