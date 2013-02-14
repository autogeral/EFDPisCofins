package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 17/11/2011 21:00:12
 * @author William Antunes
 */
public class Registro1210Test extends Randomize {
        public Registro1210Test() {
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
    public void Registro1210Test() throws ParseException{
        Registro1210 reg = new Registro1210();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("14022013");
       
        //02
        line.setFieldValue(Registro1210.CNPJ, 12345678912345L);
        //03
        line.setFieldValue(Registro1210.CST_PIS, 3);
        //04
        line.setFieldValue(Registro1210.COD_PART, "Código particip");
        //05
        line.setFieldValue(Registro1210.DT_OPER, data);
        //06
        line.setFieldValue(Registro1210.VL_OPER, 100000000000.01);
        //07
        line.setFieldValue(Registro1210.VL_BC_PIS, 200000000000.002);
        //08
        line.setFieldValue(Registro1210.ALIQ_PIS, 300000000000.0003);
        //09
        line.setFieldValue(Registro1210.VL_PIS, 100000000000.01);
        //10
        line.setFieldValue(Registro1210.COD_CTA, "Código da conta analítica contábil debitada/creditada");
        //11
        line.setFieldValue(Registro1210.DESC_COMPL, "Descrição complementar do Documento/Operação");

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);
//
//	String expected = "|1210|12345678912345|03|Código particip|14022013|100000000000,01|200000000000,002|300000000000,0003|100000000000,01|Código da conta analítica contábil debitada/creditada|Descrição complementar do Documento/Operação|";
//	assertEquals (expected, sb.toString());
    }
    
}
