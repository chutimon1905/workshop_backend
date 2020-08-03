import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void sayHi_should_return_Hello_World(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi();
        //สิ่งที่เราคาดหวัง
        assertEquals("Hello World", result);

    }

    @Test
    public void sayHi_with_chutimon_should_return_Hello_Chutimon(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("chutimon");
        //สิ่งที่เราคาดหวัง
        assertEquals("Hello Chutimon", result);

    }
    @Test
    public void sayHi_with_mind_should_return_Hello_Mind(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("mind");
        //สิ่งที่เราคาดหวัง
        assertEquals("Hello Mind", result);

    }
}