package lambdaDemo;

import java.util.*;

//函数式接口，只有一个函数
@FunctionalInterface
interface MoreParameterReturn {
    int test(int a,int b);
}
public class LambdaDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //lambda表达式()内为形参，->后面为函数体
        //用于函数式接口
        list.sort((o1, o2) -> o2 - o1);
        list.forEach(s -> System.out.println(s));
        HashMap<String, Integer> map = new HashMap<>();
        map.put("wuhao", 8);
        map.put("www", 9);
        map.put("hhh",6);
        map.forEach((key, val) -> System.out.println(key +" " + val));

    }
    public static void main1(String[] args) {
        //匿名内部类
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        //lambda表达式用于对匿名内部类的简化
        PriorityQueue<Integer> priorityQueue1 = new PriorityQueue<>((o1, o2) -> o1 - o2);
        MoreParameterReturn moreParameterReturn1 = new MoreParameterReturn() {
            @Override
            public int test(int a, int b) {
                return a + b;
            }
        };
        //lambda表达式()内为形参，->后面为函数体
        MoreParameterReturn moreParameterReturn = (a, b) -> a + b;
        System.out.println(moreParameterReturn.test(10, 20));
    }
}
