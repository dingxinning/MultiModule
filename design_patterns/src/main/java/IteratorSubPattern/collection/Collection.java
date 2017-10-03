package IteratorSubPattern.collection;

import IteratorSubPattern.iterator.Iterator;

/**
 * Created by Wuxiang on 2017/10/3.
 */
public interface Collection {
    public Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
