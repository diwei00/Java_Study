import java.util.*;
class Student implements Comparable<Student> {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.age = o.age;
    }
}
public class Test36 {
    //set天然去重
    //统计不重复的数据
    public static HashSet<Integer> func1(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        return hashSet;
    }
    //2、统计10W个数据当中，第一个重复的数据？
    public static int func2(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            if(!hashSet.contains(arr[i])) {
                hashSet.add(arr[i]);
            }else {
                return arr[i];
            }
        }
        return -1;
    }
    //统计数字出现的次数，对应关系
    public static HashMap<Integer, Integer> func3(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(!hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], 1);
            }else {
                Integer val = hashMap.get(arr[i]);
                hashMap.put(arr[i], val + 1);
            }
        }
        return hashMap;
    }

    public static void main(String[] args) {
        int[] arr = {9,9,8,8,5,5,6,6,0,9};
        HashSet<Integer> hashSet = func1(arr);
        System.out.println(hashSet);
        int tmp = func2(arr);
        System.out.println(tmp);
        HashMap<Integer, Integer> hashMap = func3(arr);
        System.out.println(hashMap);



    }
    public static void main5(String[] args) {
        //HashSet的底层是HashMap(哈希桶)，val值都是Object对象
        //数据不能重复，可以不具有比较性
        //key值不可以修改
        //查找时间复杂度为：O(1)
        HashSet<Integer> set = new HashSet<>();
        set.add(8);
        set.add(9);
        set.add(5);

        set.add(null);
        set.remove(null);
        System.out.println(set);
        for (Integer tmp : set) {
            System.out.print(tmp + " ");
        }
    }
    public static void main2(String[] args) {
        //HashMap底层是一个哈希桶，在数据存储时，会有哈希函数计算出哈希值，存储到对应的哈希表中
        //哈希表只能减少哈希冲突，不能避免
        //产生哈希冲突，java8中会在其计算的哈希值对应的哈希表中，后面弄一个链表去存储，链表如果超过8就会变为红黑树
        //查找元素的时间复杂度为：O(1)
        //HashMap可以具有没有比较性，因此可以入null
        //数据不可以重复，如果增加重复数据，会更新原来的val值
        //key值不可以修改
        HashMap<String,Integer> map = new HashMap<>();
        map.put("www", 8);
        map.put("aaa", 6);
        map.put("bbb", 2);
        map.put("bbb", 9);
        map.put(null, null);
        map.replace("aaa", 50);
        Set<String> set = map.keySet();
        System.out.println(set);
        Collection<Integer> collection =  map.values();
        System.out.println(collection);
        //Integer ret = map.remove("aaa");
        //System.out.println(ret);
        Integer tmp2 = map.getOrDefault("aaa", 100);
        System.out.println(tmp2);

        Integer tmp = map.get("www");
        System.out.println(tmp);
        System.out.println(map.containsKey("ww"));
        System.out.println(map.containsValue(8));

        Set<Map.Entry<String,Integer>> entrySet =  map.entrySet();
        for (Map.Entry<String,Integer> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    public static void main1(String[] args) {
        //TreeSet最常用的作用就是天然去重
        TreeSet<Integer> set = new TreeSet<>();
        set.add(8);
        set.add(2);
        set.add(3);
        //TreeSet的底层是TreeMap，它只有key，所有V都是Object对象
        //和TreeMap一样，数据不能重复，且数据需具有可比较性
        for (Integer tmp : set) {
            System.out.print(tmp + " ");
        }
        set.remove(2);

        System.out.println(set);
    }
    public static void main4(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("hello", 5);
        map.put("abc", 3);
        map.put("df", 8);
        Integer tmp = map.remove("df");
        //返回key对应的val值
        System.out.println(map.get("abc"));
        //将map中映射关系取出来，为Entry类型，用set集合去存储，实现对map中映射关系的遍历
        Set<Map.Entry<String, Integer>> entrySet =  map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("key: " + entry.getKey() + " val: " + entry.getValue());
        }
        System.out.println(tmp);
    }

    public static void main3(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("abc", 8);
        map.put("bcd", 6);
        //获取key的val值，没有则为默认值
        Integer ret = map.getOrDefault("ab", 100);
        System.out.println(ret);

        //取出key值进行组织
        Set<String> set = map.keySet();
        System.out.println(set);
        //取出val值进行组织
        Collection<Integer> collection =  map.values();
        System.out.println(collection);

        //TreeMap底层是一颗红黑树（二叉搜索树），添加的数据类型需具有比较性
        //优先调用比较器，没有则需实现Comparable接口
        TreeMap<Student, Integer> map2 = new TreeMap<>();
        Student s1 = new Student("aaa", 8);
        map2.put(s1, 9);
        System.out.println(map2);
    }
}
