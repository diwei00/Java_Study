class Money implements Cloneable{
    int m = 99;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
//让类具有可克隆条件
class Persin9 implements Cloneable{
    int age;

    Money money = new Money();

    //父类有克隆方法，重写克隆方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        //深拷贝
        Persin9 tmp = (Persin9)super.clone();
        tmp.money = (Money)this.money.clone();
        return tmp;

    }

    @Override
    public String toString() {
        return "Persin9{" +
                "age=" + age +
                ", money=" + money.m +
                '}';
    }
}
public class Test19 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Persin9 stu = new Persin9();
        stu.age = 21;

        Persin9 stu2 = (Persin9)stu.clone();
        stu2.money.m = 55;

        System.out.println(stu);
        System.out.println(stu2);

    }
}
