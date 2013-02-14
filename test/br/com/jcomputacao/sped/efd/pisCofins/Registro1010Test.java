package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 * 12/11/2011 10:44:35
 * @author WILL
 */
public class Registro1010Test extends Randomize {
            public Registro1010Test() {
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
    public void Registro1010Test() throws ParseException{
        Registro1010 reg = new Registro1010();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("14022013");
       
        //02
        line.setFieldValue(Registro1010.NUM_PROC, "Identif Process");
        //03
        line.setFieldValue(Registro1010.ID_SEC_JUD, "Identificação da Seção Judiciária");
        //04
        line.setFieldValue(Registro1010.ID_VARA, "12");
        //05
        line.setFieldValue(Registro1010.IND_NAT_ACAO, "01");
        //06
        line.setFieldValue(Registro1010.DESC_DEC_JUD, "Descrição Resumida dos Efeitos Tributários");
        //07
        line.setFieldValue(Registro1010.DT_SENT_JUD, data);

        StringBuffer sb = line.getRepresentation();
        System.out.print(sb);

//	String expected = "|1010|Identif Process|Identificação da Seção Judiciária|12|01|Descrição Resumida dos Efeitos Tributários|14022013|";
//	assertEquals (expected, sb.toString());
    }
    
}
