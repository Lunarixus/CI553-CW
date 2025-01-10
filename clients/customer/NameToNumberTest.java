package clients.customer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for the NameToNumber class.
 */
public class NameToNumberTest {

    /**
     * Test to verify that the default mappings are correctly initialized.
     */
    @Test
    public void testDefaultMappingsInitialization() {
        NameToNumber nameToNumber = new NameToNumber();

        assertEquals("0001", nameToNumber.getNumberForName("TV"), "TV should map to 0001");
        assertEquals("0002", nameToNumber.getNumberForName("Radio"), "Radio should map to 0002");
        assertEquals("0003", nameToNumber.getNumberForName("Toaster"), "Toaster should map to 0003");
        assertEquals("0004", nameToNumber.getNumberForName("Watch"), "Watch should map to 0004");
        assertEquals("0005", nameToNumber.getNumberForName("Camera"), "Camera should map to 0005");
        assertEquals("0006", nameToNumber.getNumberForName("MP3 Player"), "MP3 Player should map to 0006");
        assertEquals("0007", nameToNumber.getNumberForName("USB Drive"), "USB Drive should map to 0007");
    }

    /**
     * Test to verify that getNumberForName returns the correct number when a term is present in the input string.
     */
    @Test
    public void testGetNumberForNameWithValidInput() {
        NameToNumber nameToNumber = new NameToNumber();

        assertEquals("0001", nameToNumber.getNumberForName("Bush TV"), "Should detect 'TV' and return 0001");
        assertEquals("0004", nameToNumber.getNumberForName("Samsung Galaxy Watch"), "Should detect 'Watch' and return 0004");
        assertEquals("0007", nameToNumber.getNumberForName("SanDisk USB Drive"), "Should detect 'USB Drive' and return 0007");
    }

    /**
     * Test to verify that getNumberForName returns an empty string when no term matches the input string.
     */
    @Test
    public void testGetNumberForNameWithNoMatch() {
        NameToNumber nameToNumber = new NameToNumber();

        assertEquals("", nameToNumber.getNumberForName("Smartphone"), "Should return an empty string for unmatched terms");
        assertEquals("", nameToNumber.getNumberForName("Laptop"), "Should return an empty string for unmatched terms");
    }

    /**
     * Test to verify that getNumberForName handles null input gracefully.
     */
    @Test
    public void testGetNumberForNameWithNullInput() {
        NameToNumber nameToNumber = new NameToNumber();

        assertEquals("", nameToNumber.getNumberForName(null), "Should return an empty string for null input");
    }

    /**
     * Test to verify that getNumberForName handles empty input strings gracefully.
     */
    @Test
    public void testGetNumberForNameWithEmptyInput() {
        NameToNumber nameToNumber = new NameToNumber();

        assertEquals("", nameToNumber.getNumberForName(""), "Should return an empty string for empty input");
    }
}