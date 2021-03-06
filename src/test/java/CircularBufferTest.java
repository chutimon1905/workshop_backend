import org.junit.Test;

import static org.junit.Assert.*;

public class CircularBufferTest {

    CircularBuffer cb = new CircularBuffer();

    @Test
    public void create_new_buffer_should_empty() {

        boolean result = cb.isEmpty();
        assertTrue("Buffer ไม่ว่าง", result);
    }

    @Test
    public void create_new_buffer_with_default_size_should_10() {
        for (int i = 0; i < 10; i++) {
            cb.writeData("A" + i);
        }
        boolean result = cb.isFull();
        assertTrue("Buffer ไม่เต็มนะ", result);
    }

    @Test
    public void write_A_B_to_buffer_should_read_A_B_from_buffer() {
        cb.writeData("A");
        cb.writeData("B");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());

    }

    @Test
    public void write_A_B_C_to_buffer_should_read_A_B_C_from_buffer() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        cb.writeData("C");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
        assertEquals("C", cb.readData());

    }

    @Test
    public void write_A_B_C_D_to_buffer_should_read_A_B_C_D_from_buffer() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        cb.writeData("C");
        cb.writeData("D");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
        assertEquals("C", cb.readData());
        assertEquals("D", cb.readData());

    }

    @Test
    public void write_A_B_C_D_E_to_buffer_should_read_A_B_C_D_E_from_buffer() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        cb.writeData("C");
        cb.writeData("D");
        cb.writeData("E");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
        assertEquals("C", cb.readData());
        assertEquals("D", cb.readData());
        assertEquals("E", cb.readData());

    }

    @Test
    public void write_A_B_C_D_E_F_to_buffer_should_read_A_B_C_D_E_F_from_buffer() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        cb.writeData("C");
        cb.writeData("D");
        cb.writeData("E");
        cb.writeData("F");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
        assertEquals("C", cb.readData());
        assertEquals("D", cb.readData());
        assertEquals("E", cb.readData());
        assertEquals("F", cb.readData());

    }

    @Test
    public void write_A_B_C_D_E_F_G_to_buffer_should_read_A_B_C_D_E_F_G_from_buffer() {
        CircularBuffer cb = new CircularBuffer();
        cb.writeData("A");
        cb.writeData("B");
        cb.writeData("C");
        cb.writeData("D");
        cb.writeData("E");
        cb.writeData("F");
        cb.writeData("G");
        assertEquals("A", cb.readData());
        assertEquals("B", cb.readData());
        assertEquals("C", cb.readData());
        assertEquals("D", cb.readData());
        assertEquals("E", cb.readData());
        assertEquals("F", cb.readData());
        assertEquals("G", cb.readData());

    }
}