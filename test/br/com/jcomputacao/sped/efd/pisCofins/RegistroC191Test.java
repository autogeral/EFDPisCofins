package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * $[date] $[time]
 * @author rafael.galvao
 */
public class RegistroC191Test extends Randomize{
    
    public RegistroC191Test() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNome method, of class RegistroC191.
     */
    @Test
    public void RegistroC191Test(){
        RegistroC191 reg = new RegistroC191();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC191.CNPJ_CPF_PART, "12345678912345");
        //03
        line.setFieldValue(RegistroC191.CST_PIS, 12L);
        //04
        line.setFieldValue(RegistroC191.CFOP, 1234L );
        //05
        line.setFieldValue(RegistroC191.VL_ITEM, 78912.33 );
        //06
        line.setFieldValue(RegistroC191.VL_DESC, 78912.33 );
        //07
        line.setFieldValue(RegistroC191.VL_BC_PIS, 678912.33 );
        //08
        line.setFieldValue(RegistroC191.ALIQ_PIS, 1678.4567 );
        //09
        line.setFieldValue(RegistroC191.QUANT_BC_PIS, 56912.333 );
        //10
        line.setFieldValue(RegistroC191.ALIQ_PIS_QUANT, 1262.3344 );
        //11
        line.setFieldValue(RegistroC191.VL_PIS, 1456.33 );
        //12
        line.setFieldValue(RegistroC191.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|C191|12345678912345|12|1234|78912,33|78912,33|678912,33|1678,4567|56912,333|1262,3344|1456,33|Código da conta analítica contábil debitada/creditada|";
//        assertEquals(expected, sb.toString());
    }
}
