class Money implements Cloneable{
    int m = 100;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Person5 implements Cloneable{
    Money money = new Money();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person5 tmp = (Person5)super.clone();
        tmp.money = (Money)this.money.clone();
        return tmp;
    }
}
public class Test14 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Person5 stu = new Person5();
        Person5 stu2 = (Person5)stu.clone();
        stu2.money.m = 200;
        System.out.println(stu.money.m);
        System.out.println(stu2.money.m);
    }
}
