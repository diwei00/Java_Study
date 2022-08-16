
class Animal1 {
    int age;
    String name;
    public void eat() {
        System.out.println(name + "正在吃");
    }
    public Animal1(String name) {
        System.out.println(name + "吃");
    }
}

class Dog1 extends Animal1 {
    boolean sally;
    int age;
    //构造成员方法必须先调用父类的构造方法，然后调用子类的构造方法
    public Dog1() {
        //调用父类的构造方法，且只能在子类构造方法第一句，不能和this()调用构造方法同时存在
        super("呜嗷");
        System.out.println("aaa");
    }
    //在子类中对eat的重写
    //返回值一样或者具有父子关系，参数的顺序，个数，类型需相同
    //访问权限只能大于或者等于
    public void eat() {
        System.out.println("汪汪叫");
    }
    public void fun() {
        super.age = 10;
        System.out.println(this.age);
        //super在子类中用于访问父类中的成员属性
        System.out.println(super.age);
    }

}
class Cat1 extends Animal1 {
    public Cat1() {
        super("www");
        System.out.println("bbbbb");
    }
    public void fun2() {
        System.out.println("喵喵");
    }
    //对父类eat的重写
    public void eat() {
        System.out.println("喵喵叫");
    }
}
//final修饰类，意味着不能被继承
final class P extends Cat1{

}
public class Test13 {


    //基于动态绑定实现多态的思想，编译看左，运行看右对象。（对于方法而言，属性还是静态绑定，即看左对象属性）
    //必须在子类中重写父类方法，目的就是产生不同的行为
    //必须通过父类调用重写的方法
    //就是用一个引用，对象不同，调用同一个方法，但是所产生的行为不同
    public static void fun(Animal1 animal) {

        animal.eat();
        System.out.println(animal.age);

    }
    public static void fun2() {
        //先向上转型
        Animal1 p2 = new Dog1();

        //检测p2中是否引用了dog1对象，有则为true
        if(p2 instanceof Dog1){

            //向下转型
            Dog1 dog = (Dog1)p2;
            dog.eat();
        }
    }
    public static void main(String[] args) {
        /*Dog1 dog = new Dog1();
        Cat1 cat = new Cat1();
        //向上转型，父类接收子类对象
        Animal1 p = new Dog1();
        fun(dog);
        fun(cat);*/
        fun2();
    }
}
