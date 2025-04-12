import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Ivan", "123456"));
        assertEquals(2, phoneBook.add("Serg", "234567"));
    }
}
