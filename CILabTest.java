import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("KhaledH");
	assertEquals(myString.getString(), true);

    }
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("I LOVE CODING");
	assertEquals(myString.getString(), false);
    }


}
