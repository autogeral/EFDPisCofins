package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;
/**
 * 17/11/2011 19:37:48
 * @author William Antunes
 */
public class Registro1101Test extends Randomize {
    
    public Registro1101Test() {
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
    public void Registro1101Test() throws ParseException{
        Registro1101 reg = new Registro1101();
        LineModel line = reg.createModel();
                SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("14022013");
       
        //02
        line.setFieldValue(Registro1101.COD_PART, "Código do particip");
        //03
        line.setFieldValue(Registro1101.COD_ITEM, "Código do item");
        //04
        line.setFieldValue(Registro1101.COD_MOD, "12");
        //05
        line.setFieldValue(Registro1101.SER, "0001");
        //06
        line.setFieldValue(Registro1101.SUB_SER, "102");
        //07
        line.setFieldValue(Registro1101.NUM_DOC, 123456789L);
        //08
        line.setFieldValue(Registro1101.DT_OPER, data);
        //09
        line.setFieldValue(Registro1101.CHV_NFE, "11111111112222222222333333333344444444445555");
        //10
        line.setFieldValue(Registro1101.VL_OPER, 100000000000.01);
        //11
        line.setFieldValue(Registro1101.CFOP, 5);
        //12
        line.setFieldValue(Registro1101.NAT_BC_CRED, "34");
        //13
        line.setFieldValue(Registro1101.IND_ORIG_CRED, "0");
        //14
        line.setFieldValue(Registro1101.CST_PIS, 45);
        //15
        line.setFieldValue(Registro1101.VL_BC_PIS, 20000000000.002);
        //16
        line.setFieldValue(Registro1101.ALIQ_PIS, 300000000000.0003);
        //17
        line.setFieldValue(Registro1101.VL_PIS, 100000000000.01 );
        //18
        line.setFieldValue(Registro1101.COD_CTA, "Código Conta");        
        //19
        line.setFieldValue(Registro1101.COD_CCUS, "Código Centro Custos");
        //20
        line.setFieldValue(Registro1101.DESC_COMPL, "Descrição complementar do Documento/Operação.");
        //21
        line.setFieldValue(Registro1101.PER_ESCRIT, 123456L);
        //22
        line.setFieldValue(Registro1101.CNPJ, 12345678912345L);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|1101|Código do particip|Código do item|12|0001|102|123456789|14022013|11111111112222222222333333333344444444445555|100000000000,01|0005|34|0|45|20000000000,002|300000000000,0003|100000000000,01|Código Conta|Código Centro Custos|Descrição complementar do Documento/Operação.|123456|12345678912345|";
//	assertEquals (expected, sb.toString());
    }
    
}
