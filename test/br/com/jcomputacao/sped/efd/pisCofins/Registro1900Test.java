package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author Jennifer
 */
public class Registro1900Test {
    public Registro1900Test(){
    
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

    @Test
    public void Registro1900Test(){
        Registro1900 reg = new Registro1900();
        LineModel line = reg.createModel();

        //02
        line.setFieldValue(Registro1900.CNPJ, 12345678912345L);
        //03
        line.setFieldValue(Registro1900.COD_MOD, "98");
        //04
        line.setFieldValue(Registro1900.SER, "ABCD");
        //05
        line.setFieldValue(Registro1900.SUB_SER, 1234567891234567891L);
        //06
        line.setFieldValue(Registro1900.COD_SIT, 01);        
        //07 
        line.setFieldValue(Registro1900.VL_TOT_REC, 300000000000.04);       
        //08
        line.setFieldValue(Registro1900.QUANT_DOC, 1234567891234567891L);        
        //09
        line.setFieldValue(Registro1900.CST_PIS, 12);        
        //10 
        line.setFieldValue(Registro1900.CST_COFINS, 23);        
        //11 
        line.setFieldValue(Registro1900.CFOP, 1234);       
        //12
        line.setFieldValue(Registro1900.INF_COMPL, "Informações complementares");
        //13
        line.setFieldValue(Registro1900.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        
        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|1900|12345678912345|98|ABCD|1234567891234567891|01|300000000000,04|1234567891234567891|12|23|1234|Informações complementares|Código da conta analítica contábil debitada/creditada|";
//	assertEquals (expected, sb.toString());
    }
}
