package Tree;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class BinaryTree {
public class Node{
	int val;
	Node left;
	Node  right;
    }
 Scanner sc=new Scanner (System.in);
  private Node root;
 public BinaryTree() {
	// TODO Auto-generated method stub
	 root=CreateTree();
   }
 private Node CreateTree() {
		// TODO Auto-generated method stub
	int item=sc.nextInt();
	Node nn=new Node();
	nn.val=item;
	boolean hlc=sc.nextBoolean();
	if(hlc) {	
		nn.left=CreateTree();
	}
	boolean hrc=sc.nextBoolean();
	if(hrc) {
		nn.right=CreateTree();
	}
	return nn;
  }
 public void Display() {
	 Display(root);
 }
 private void Display(Node node) {
	 if(node==null) {
		 return;
	 }
	 String s="";
	 s="<--"+node.val+"-->";
	 if(node.left!=null) {
		 s=node.left.val+s;
	 }else {
		 s="."+s;
	 }
	 if(node.right!=null) {
		 s=s+node.right.val;
	 }else {
		 s=s+".";
	 }
	 System.out.println(s);
	 Display(node.left);
	 Display(node.right);
  }
 public boolean find(int item) {
	 return find(this.root,item);	 
   }
 private boolean find(Node nn,int item) {
	 if(nn==null) {
		 return false;
	 }
	 if(nn.val==item) {
		 return true;
	 }
	 boolean left=find(nn.left,item);
	 boolean right=find(nn.right,item);
	 return left||right;
   }
 public int max() {
	 return max(this.root);
   }
 private int max(Node node) {
	 if(node==null) {
		 return Integer.MIN_VALUE;
	 }
	 int left=max(node.left);
	 int right=max(node.right);
	 return Math.max(node.val,Math.max(left, right));
       }
 public int ht() {
	 return ht(this.root);
 }
 private int ht(Node node) {
	 if(node==null) {
		 return -1;
	 }
	 int left=ht(node.left);
	 int right=ht(node.right);
	 return Math.max(left, right)+1;
   }
 public void Preorder() {
	 Preorder(this.root);
	 System.out.println();
 }
 private void Preorder(Node node) {
	 if(node==null) {
		 return;
	 }
	 System.out.print(node.val+" ");
	 Preorder(node.left);
	 Preorder(node.right);
   }
 public void Postorder() {
	 Postorder(this.root);
	 System.out.println();
    } 
 private void Postorder(Node node) {
	 if(node==null) {
		 return;
	 }
	 Postorder(node.left);
	 Postorder(node.right);
	 System.out.println(node.val+" ");
   }
 public void Inorder() {
	 Inorder(this.root);
	 System.out.println();
    }
 private void Inorder(Node node) {
	 if(node==null) {
		 return;
	 }
	 Inorder(node.left);
	 System.out.println(node.val+" ");
	 Inorder(node.right);
   }
 public void Levelorder() {
	 Queue<Node>q=new LinkedList<>();
	 q.add(root);
	 while(!q.isEmpty()) {
		 Node rv=q.poll();  // Remove First
		 System.out.print(rv.val+" ");
		 if(rv.left!=null) {
			 q.add(rv.left);
		 }
		 if(rv.right!=null) {
			 q.add(rv.right);			 
		 }
	 }
	 System.out.println();
 }
 }