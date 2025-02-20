import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import uke6_stabel.ParentesSjekker;

public class ParentesSjekkerTest {

    @Test
    public void testGyldigeStrenger() {
        assertTrue(ParentesSjekker.sjekkParenteser("{[()]}"));
        assertTrue(ParentesSjekker.sjekkParenteser("class HelloWorld { public static void main(String[] args) { System.out.println(\"Hello World!\"); } }"));
    }

    @Test
    public void testUgyldigeStrenger() {
        assertFalse(ParentesSjekker.sjekkParenteser("{[() }"));  // Mangler ]
        assertFalse(ParentesSjekker.sjekkParenteser("[()]}"));    // Mangler {
        assertFalse(ParentesSjekker.sjekkParenteser("{[(])}"));   // Feil rekkefølge
    }
}
