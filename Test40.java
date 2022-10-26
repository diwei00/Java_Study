import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
//Collections用于操作集合类，其中方法都是静态方法
public class Test40 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(0);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        int ret = Collections.binarySearch(list, 5);
        System.out.println(ret);
        List<Integer> list1 = new ArrayList<>(8);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        list1.add(1);
        Collections.copy(list1, list);
        System.out.println(list1);
        Integer ret2  = Collections.max(list);
        System.out.println(ret2);
        Integer ret3 = Collections.min(list1);
        System.out.println(ret3);
        System.out.println(list1);
        Collections.swap(list1, 0, 1);
        System.out.println(list1);

        //旋转
        // 当 distance 为正数时，将 list 集合的后 distance 个元素“整体”移到前面；
        // 当 distance 为负数时，将 list 集合的前 distance 个元素“整体”移到后面。该方法不会改变集合的长度。
        Collections.rotate(list1, 3);
        System.out.println(list1);
        //返回一个空集合（不可变）
        List<Integer> tmp = Collections.emptyList();
        Integer[] arr = {1,2,3,4,5,6};
        //将指定元素添加到指定集合，需要是包装类
        Collections.addAll(list1, arr);
        System.out.println(list1);

    }
}
