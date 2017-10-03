package IteratorSubPattern;

import IteratorSubPattern.collection.Collection;
import IteratorSubPattern.collection.MyCollection;
import IteratorSubPattern.iterator.Iterator;

/**
 * Created by Wuxiang on 2017/10/3.
 * 迭代子模式
 * 迭代器模式就是顺序访问聚集中的对象
 *
 * demo：模拟了集合类 迭代器 整个过程
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
