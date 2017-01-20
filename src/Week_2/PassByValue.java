public class PassByValue {
    public static void plus1(ListNode node){
        node.val++;
        node = new ListNode(3);
        node.val++;
    }

    public static void plus1(int a){
        a++;
        a = 3;
        a++;
        //System.out.println(a);
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        plus1(node);
        System.out.println(node.val);
        int a = 1;
        plus1(a);
        System.out.println(a);
    }
}