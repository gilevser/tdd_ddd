import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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

    @Test
    public void testPrintAllNames() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan", "123456");
        phoneBook.add("Serg", "234567");
        phoneBook.add("Alex", "345678");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;
        System.setOut(printStream);

        phoneBook.printAllNames();

        String expectedOutput = "Ivan Serg Alex";
        assertEquals(expectedOutput.trim(), outputStream.toString().trim());
    }
}
