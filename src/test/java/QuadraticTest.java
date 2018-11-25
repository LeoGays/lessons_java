import org.junit.Assert;
import org.junit.Test;

//import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

public class QuadraticTest {

    @Test
    public void equationTest() throws QuadraticException {
        QuadraticTrinomial P = new QuadraticTrinomial(1,-3,2);
        QuadraticTrinomial G = new QuadraticTrinomial(1,-5,6);
        QuadraticTrinomial K = new QuadraticTrinomial(1,-2,1);

        assertEquals(1.0, P.roots()[0],0.0);
        assertEquals(2.0, P.roots()[1],0.0);

        assertEquals(2.0, G.roots()[0],0.0);
        assertEquals(3.0, G.roots()[1],0.0);

        assertEquals(1.0, K.roots()[0],0.0);
        assertEquals(1.0, K.roots()[1],0.0);

    }

    @Test
    public void maxTest() throws QuadraticException {
        QuadraticTrinomial P = new QuadraticTrinomial(1,-3,2);
        QuadraticTrinomial G = new QuadraticTrinomial(1,-5,6);
        QuadraticTrinomial K = new QuadraticTrinomial(1,-2,1);

        assertEquals(2,P.maxRoots(), 0.0);
        assertEquals(3,G.maxRoots(), 0.0);
        assertEquals(1,K.maxRoots(), 0.0);
    }

    @Test
    public void testWrongHignerCoefficient()  throws QuadraticException{
        try {
            QuadraticTrinomial P = new QuadraticTrinomial(0,1,1);
            fail();
        } catch (QuadraticException ex) {
            assertEquals(QuadraticEnum.WRONG_HIGNER_COEFFICIENT_STRING,ex.getErrorCode());
        }

    }

    @Test
    public void testWrongNullCoefficient() throws QuadraticException{
        try {
            QuadraticTrinomial P = new QuadraticTrinomial(0,0,1);
            fail();
        } catch (QuadraticException ex) {
            assertEquals(QuadraticEnum.NULL_COEFFICIENT,ex.getErrorCode());
        }

    }

    @Test
    public void testWrongNotRoots() throws QuadraticException{
        try {
            QuadraticTrinomial P = new QuadraticTrinomial(1,1,10);
            P.maxRoots();
            //fail();
        } catch (QuadraticException ex) {
            assertEquals(QuadraticEnum.NO_ROOTS,ex.getErrorCode());
        }

    }


}
