package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 12/11/2011 10:54:15
 * @author rafael.galvao
 */
public class RegistroC195Test extends Randomize{
    
    public RegistroC195Test() {
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
     * Test of getNome method, of class RegistroC195.
     */
    @Test
    public void RegistroC195Test(){
        RegistroC195 reg = new RegistroC195();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(RegistroC195.CNPJ_CPF_PART, "12345678912345");
        //03
        line.setFieldValue(RegistroC195.CST_COFINS, 12L);
        //04
        line.setFieldValue(RegistroC195.CFOP, 1234L );
        //05
        line.setFieldValue(RegistroC195.VL_ITEM, 8912.33 );
        //06
        line.setFieldValue(RegistroC195.VL_DESC, 912.33 );
        //07
        line.setFieldValue(RegistroC195.VL_BC_COFINS, 78912.33 );
        //08
        line.setFieldValue(RegistroC195.ALIQ_COFINS, 678.4567 );
        //09
        line.setFieldValue(RegistroC195.QUANT_BC_COFINS, 8912.333 );
        //10
        line.setFieldValue(RegistroC195.ALIQ_COFINS_QUANT, 5678912.3344 );
        //11
        line.setFieldValue(RegistroC195.VL_COFINS, 1278912.33 );
        //12
        line.setFieldValue(RegistroC195.COD_CTA, "Código da conta analítica contábil debitada/creditada");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//        String expected = "|C195|12345678912345|12|1234|8912,33|912,33|78912,33|678,4567|8912,333|5678912,3344|1278912,33|Código da conta analítica contábil debitada/creditada|";        
//        assertEquals (expected, sb.toString());
    }
}
