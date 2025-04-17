import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Ivan", "123456"));
        assertEquals(2, phoneBook.add("Serg", "234567"));
    }

    @Test
    public void testFindByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan", "123456");
        assertEquals("Ivan", phoneBook.findByNumber("123456"));
        assertNull("Serg", phoneBook.findByNumber("234567"));
    }

    @Test
    public void testFindByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan", "123456");
        assertEquals("123456", phoneBook.findByName("Ivan"));
        assertNull("", phoneBook.findByName("Serg"));
    }
}
