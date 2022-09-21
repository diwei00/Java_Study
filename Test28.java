import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Test28 {
    public static void main(String[] args) {
        //底层是双向链表
        LinkedList<Integer> linkedList = new LinkedList<>();
        //默认尾增
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(2,88);
        linkedList.addFirst(100);
        //int tmp = linkedList.element();
        //System.out.println(tmp);
        linkedList.remove(2);
        linkedList.set(0,99);

        for (int x : linkedList) {
            System.out.print(x + " ");
        }
        System.out.println();
        //迭代器正向遍历
        ListIterator<Integer> ret = linkedList.listIterator();
        while(ret.hasNext()) {
            System.out.println(ret.next());
        }
        //迭代器反向遍历
        ListIterator<Integer> ret2 = linkedList.listIterator(linkedList.size());
        while(ret2.hasPrevious()) {
            System.out.println(ret2.previous() + "");
        }


    }
}
