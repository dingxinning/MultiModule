package learn

/**
 * Created by Wuxiang on 2017/2/6.
 * 使用junit进行单元测试
 */
import org.junit.Assert
import org.junit.Test;

class GroovyTestPerson {
    @Test
    void testToString(){
        Person p=new Person("name":"ddd","age":18)
        //Assert.assertEquals("ddd-18", p.toString())    //失败测试
        Assert.assertEquals("ddd,18", p.toString())   //成功
    }
}