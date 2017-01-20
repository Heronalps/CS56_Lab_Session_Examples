public interface Node {
  String str = "God says: Let be a Node!";  
  public void printValue();
}

public class ListNode implements Node {
    ListNode next;
    int listNodeData;
    public ListNode(int data) {
        listNodeData = data;
    }
    public void printValue(){
        System.out.println(listNodeData);
    }
}

public class TreeNode implements Node {
    TreeNode left;
    TreeNode right;
    int treeNodeData;
    public TreeNode(int data) {
        treeNodeData = data;
    }
    public void printValue(){
        System.out.println(treeNodeData);
    }
}

public class Test {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(root.left.treeNodeData);

        ListNode head = new ListNode(1);
        head.next = ListNode(2);
        System.out.println(head.next.listNodeData);
    }
}
