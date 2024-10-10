import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AddTest {

    @Test
    public void testFullName(){
        Add add = new Add();
        String actualResult = add.fullName("John", "Doe");//actual result from your method
        //expecting JohnDoe
        assertNotEquals("John Doe", actualResult);
    }

    @Test
    public void testFullNameWithEmptyStrings(){
        Add add = new Add();
        String actualResult = add.fullName("", "");//actual result from your method
        //expecting JohnDoe
        assertEquals("", actualResult);
    }

    @Test
    public void testFullNameWithFirstNameEmpty() {
        Add Add = new Add();
        String result = Add.fullName("", "Doe");
        assertEquals("Doe", result);
    }

    @Test
    public void testFullNameWithLastNameEmpty() {
        Add Add = new Add();
        String result = Add.fullName("John", "");
        assertEquals("John", result);
    }

    @Test
    public void testFullNameWithNullFirstName() {
        Add Add = new Add();
        String result = Add.fullName(null, "Doe");
        assertEquals("Doe", result);
    }

    @Test
    public void testFullNameWithNullLastName() {
        Add Add = new Add();
        String result = Add.fullName("John", null);
        assertEquals("John", result);
    }

    @Test
    public void testFullNameWithBothNull() {
        Add Add = new Add();
        String result = Add.fullName(null, null);
        assertEquals("", result);
    }
}
