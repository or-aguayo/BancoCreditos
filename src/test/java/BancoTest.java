import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class BancoTest {

    @Test
    public void testCalcularInteres(){
        Banco banco= new Banco();
        int monto=1000000;
        int cuotas=10;
        double interes=banco.derivarMontoCreditos(monto,cuotas);
        assertEquals(1.25,interes,0.01);
    }

}
