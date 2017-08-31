package Composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Wuxiang on 2017/3/19.
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    //添加孩子节点
    public void add(TreeNode node) {
        children.add(node);
        System.out.println("add node:"+node.name);
    }

    //删除孩子节点
    public void remove(TreeNode node) {
        children.remove(node);
        System.out.println("remove node:"+node.name);
    }

    //取得孩子节点
    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

}
