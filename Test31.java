import java.util.Comparator;
import java.util.PriorityQueue;
class IntCmp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
class Person11 implements Comparable<Person11>{
    int age;
    public Person11(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Person11 o) {
        return this.age - o.age;
    }
}
public class Test31 {
    public static void main(String[] args) {
        /**
         * 优先级队列
         * 对象需具有可比较性
         * 实现Compareable接口 或者 提供比较器
         * 插入和删除时间复杂度为log(n)
         */
        PriorityQueue<Person11> priorityQueue = new PriorityQueue<>();
        Person11 stu1 = new Person11(20);
        Person11 stu2 = new Person11(10);
        priorityQueue.offer(stu1);
        priorityQueue.offer(stu2);
        priorityQueue.poll();
        System.out.println(priorityQueue.peek().age);

    }
    public static void main1(String[] args) {
        /**
         * 比较器优先调用，没有，则调Integer中compareTo方法（小堆）
         */
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new IntCmp());
        priorityQueue.offer(30);
        priorityQueue.offer(20);
        priorityQueue.offer(10);
        Integer tmp1 = priorityQueue.poll();
        System.out.println(tmp1);
        Integer tmp2 = priorityQueue.peek();
        System.out.println(tmp2);


    }
}
