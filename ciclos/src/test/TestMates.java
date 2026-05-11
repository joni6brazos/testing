import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.contornos.Mates;

public class TestMates {
    @Test
    public void testDividir(){
        int resultado = Mates.dividirStatic(10, 10);
        assertEquals(1, resultado);
    }
    

}
