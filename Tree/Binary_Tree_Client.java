package Tree;
public class Binary_Tree_Client {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BinaryTree bt=new BinaryTree();
        bt.Display();
        System.out.println(bt.find(80));
        System.out.println(bt.max());
        System.out.println(bt.ht());
        bt.Preorder();
        bt.Postorder();
        bt.Inorder();
        bt.Levelorder();
	}	
}