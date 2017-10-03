package IteratorSubPattern.collection;

import IteratorSubPattern.iterator.Iterator;
import IteratorSubPattern.iterator.MyIterator;

/**
 * Created by Wuxiang on 2017/10/3.
 */
public class MyCollection implements Collection {
    public String string[] = {"A","B","C","D","E"};
    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
