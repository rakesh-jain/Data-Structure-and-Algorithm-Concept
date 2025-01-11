package com.datastructure.java.tree;

import java.util.*;

public class BinaryTree {

    private Node root;

    public BinaryTree (){
        root=null;
    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node (int value){
            this.value=value;
            left=null;
            right=null;
        }
    }

    public void populate(Scanner scanner){
        System.out.println("Enter the root Node value : ");
        int value=scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    public void populate(Scanner scanner, Node node){
        System.out.println("Do you want to enter left of " + node.value);
        boolean left=scanner.nextBoolean();
        if(left){
            System.out.println("enter the value of the left of " + node.value);
            int value= scanner.nextInt();
            node.left=new Node(value);
            populate(scanner, node.left);
        }
        
        System.out.println("Do you want to enter right of " + node.value);
        boolean right=scanner.nextBoolean();
        if(right) {
            System.out.println("enter the value of the left of " + node.value);
            int val = scanner.nextInt();
            node.right = new Node(val);
            populate(scanner, node.right);
        }
    }
    public void display(){
        display(this.root," ");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }

        // Print right subtree first, with added indentation
        display(node.right, indent + "    ");

        // Print current node value with current indentation
        System.out.println(indent + node.value);

        // Print left subtree, with added indentation
        display(node.left, indent + "    ");
    }
    private void display(Node node, String indent, boolean isRight) {
        if (node == null) {
            return;
        }

        // Print the right subtree first, with increased indentation
        display(node.right, indent + (isRight ? "        " : " |      "), true);

        // Print the current node with its indent and connection symbols
        System.out.println(indent + (isRight ? " /" : " \\") + "----- " + node.value);

        // Print the left subtree, with increased indentation
        display(node.left, indent + (isRight ? " |      " : "        "), false);
    }

    // Wrapper method for initial call
    public void displayTree() {
        display(root, "", true);
    }

    public void prettyDisplay(){
        prettyDisplay(root,0);
    }
    public void prettyDisplay(Node node, int level){
        if(node==null){
            return;
        }
        prettyDisplay(node.right,level+1);
        if(level!=0){
            for(int i=0; i < level-1; i++){
                System.out.print("|\t\t");
            }
            System.out.println("|---->"+node.value);
        }else{
            System.out.println(node.value);
        }
        prettyDisplay(node.left,level+1);
    }

    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> ans =new ArrayList<>();
        // write code here
        if(root==null){
            return ans;
        }
        helper(root,ans);
        return ans;
    }

    public  void helper(Node node,ArrayList<Integer> ans){
        if(node==null){
            return;
        }
        ans.add(node.value);
        helper(node.left, ans);
        helper(node.right, ans);
    }

    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans =new ArrayList<>();
        // write code here
        if(root==null){
            return ans;
        }
        helper1(root,ans);
        return ans;
    }

    public  void helper1(Node node,ArrayList<Integer> ans){
        if(node==null){
            return;
        }

        helper(node.left, ans);
        helper(node.right, ans);
        ans.add(node.value);
    }

    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans =new ArrayList<>();
        // write code here
        if(root==null){
            return ans;
        }
        helper2(root,ans);
        return ans;
    }

    public  void helper2(Node node,ArrayList<Integer> ans){
        if(node==null){
            return;
        }
        helper(node.left, ans);
        ans.add(node.value);
        helper(node.right, ans);
    }

  public List<Integer> preOrderIt(Node root){
        Node node=root;
        Stack<Node> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();
        if(node== null) return list;
        stack.push(node);
        while(!stack.isEmpty()){
            node=stack.pop();
            list.add(node.value);
            if(node.right!=null) stack.push(node.right);
            if(node.left!=null) stack.push(node.left);
        }
        return list;
  }

    public List<Integer> inOrderIt(Node root){
        Node node=root;
        Stack<Node> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();
        while(true){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                if(stack.isEmpty()){
                    break;
                }else{
                    node=stack.pop();
                    list.add(node.value);
                    node=node.right;
                }
            }
        }
        return list;
    }

    public List<Integer> postOrderList(Node root){
        Node node=root;
        Stack<Node> stack1=new Stack<>();
        List<Integer> list=new ArrayList<>();
        Stack<Node> stack2=new Stack<>();
        if(node== null) return list;
        stack1.add(node);
        while(!stack1.isEmpty()){
            node=stack1.pop();
            stack2.add(node);
            if(node.left != null) node=node.left;
            if(node.right != null) node=node.right;
        }
        while(! stack2.isEmpty()){
            list.add(stack2.pop().value);
        }
        return list;
    }

    public List<List<Integer>> levelOrder(Node root){
        Node node=root;
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> outer=new ArrayList<>();
        if(node== null) return outer;
        queue.add(node);
        while(!queue.isEmpty()){
            int size= queue.size();
            List<Integer> inner=new ArrayList<>();
            for(int i=0;i<size;i++){
                node=queue.peek();
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.offer(node.right);
                inner.add(queue.poll().value);
            }
            outer.add(inner);
        }
        return outer;
    }

    //count the non - leaf or internal nodes in the tree
    public int countNonLeafs(Node root){
        if(root == null) return 0;
        if(root.left ==null && root.right ==null) return 0;
        return 1 + countLeafs(root.left) + countLeafs(root.right);
    }

    //count of the tree
    public int countOfTree(Node root){
        if(root == null) return 0;
        return 1 + countOfTree(root.left) + countOfTree(root.right);
    }

    //count the leafs node in tree
    public int countLeafs(Node root){
        if(root == null) return 0;
        if(root.left==null && root.right==null) return 1;

        return countLeafs(root.left) + countLeafs(root.right);
    }

    //count the height of the tree
    public int height(Node root){
        if(root== null) return 0;
        int lefts = height(root.left);
        int rights = height(root.right);

        return 1+ Math.max(lefts,rights);
    }

}
