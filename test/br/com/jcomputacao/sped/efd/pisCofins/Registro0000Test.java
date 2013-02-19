package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.*;

/**
 *
 * @author John
 */
public class Registro0000Test {
    
    public Registro0000Test (){
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
    public void Registro0000Test() throws ParseException {
        Registro0000 reg = new Registro0000();
        LineModel line = reg.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date dataInicio = sdf.parse("01012013");
        Date dataFim = sdf.parse("31012013");
        //02
        line.setFieldValue(Registro0000.COD_VER, 002L);
        //03
        line.setFieldValue(Registro0000.TIPO_ESCRIT, 0L);
        //04
        line.setFieldValue(Registro0000.IND_SIT_ESP, null);
        //05
        line.setFieldValue(Registro0000.NUM_REC_ANTERIOR, null);
        //06
        line.setFieldValue(Registro0000.DT_INI, dataInicio);
        //07
        line.setFieldValue(Registro0000.DT_FIN, dataFim);
        //08
        line.setFieldValue(Registro0000.NOME, "CONVIVERE EMPREENDIMENTOS IMOBILIÁRIOS LTDA");
        //09
        line.setFieldValue(Registro0000.CNPJ, 10276553000125L);
        //10
        line.setFieldValue(Registro0000.UF, "SP");
        //11
        //3523909|Itu|01012009|
        line.setFieldValue(Registro0000.COD_MUN, 3523909L);
        //12
        line.setFieldValue(Registro0000.SUFRAMA, null);
        //13
        line.setFieldValue(Registro0000.IND_NAT_PJ, 00);
        //14
        line.setFieldValue(Registro0000.IND_ATIV, 4);
        StringBuffer sb = line.getRepresentation();
//        String expected = "|0000|002|0|||01012013|31012013|CONVIVERE EMPREENDIMENTOS IMOBILIÁRIOS LTDA|10276553000125|SP|3523909||00|4|";
        System.out.print(sb);
//        assertEquals(expected, sb.toString()); 
    }

}
