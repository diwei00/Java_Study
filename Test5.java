class person2{
    public int age;
    public String name;

    public void setAge(int age){
        //编译器默认传递了对象的引用，是被this接受
        //就是为了确保可以准确的访问到这个对象的属性
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    //构造方法之间可以相互调用，但不能形成环
    //必须是这个构造方法中的第一句
    public person2(){
        this("wuhao", 21);
        System.out.println("aaaa");
    }
    public person2(String name, int age){
        System.out.println(name + age);
    }
}
public class Test5 {
    public static void main(String[] args) {
        //默认是调用了构造方法，如果自己没有写构造方法，编译器默认提供一个无参的构造方法
        //如果自己写了构造方法，编译器则不提供构造方法
        //构造方法支持重载
        //person2 stu1 = new person2();
        //person2 stu1 = new person2("吴浩", 21);
        person2 stu1 = new person2();
        stu1.setAge(21);
        int age = stu1.getAge();
        System.out.println(age);
    }
}
