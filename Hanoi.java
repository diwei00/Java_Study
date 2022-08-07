public class Hanoi {
    // pos1 : 起始位置
    // pos2 ：中转位置
    // pos3 : 最终位置
    // 当成二叉树去理解
    public static void hanoi(int n, char pos1, char pos2, char pos3) {
        if (n == 1) {
            //直接由1到3
            move(pos1, pos3);
            return;
        }
        //n - 1个盘子在pos1经过pos3放到pos2
        hanoi(n - 1, pos1, pos3, pos2);
        //pos1剩一个最大的盘子，放到pos3
        move(pos1, pos3);
        //n - 1个盘子在pos2经过pos1放到pos3   最终结果
        hanoi(n - 1, pos2, pos1, pos3);
    }

    public static void move(char pos1, char pos2) {
        System.out.println(pos1 + "-->" + pos2);
    }

    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }
}
