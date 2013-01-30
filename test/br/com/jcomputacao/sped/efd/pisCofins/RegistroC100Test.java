package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * 
 * @author rafael.galvao
 */
public class RegistroC100Test {

    public RegistroC100Test() {
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
    public String linhaRegistroC100Test() throws ParseException {
        RegistroC100 reg = new RegistroC100();
        LineModel line = reg.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("30012013");
        
        //02
        line.setFieldValue(RegistroC100.IND_OPER, "1");
        //03
        line.setFieldValue(RegistroC100.IND_EMIT, "0");
        //04
        line.setFieldValue(RegistroC100.COD_PART, "Código do participante (campo 02 do Registro 0150)");
        //05
        line.setFieldValue(RegistroC100.COD_MOD, "11");
        //06
        line.setFieldValue(RegistroC100.COD_SIT, 12);
        //07
        line.setFieldValue(RegistroC100.SER, "100");
        //08
        line.setFieldValue(RegistroC100.NUM_DOC, 123456789L);
        //09
        line.setFieldValue(RegistroC100.CHV_NFE, " asdfghjklçqwertyuiopzxcvbnm,.lkjhgfdsaqwe  ");
        /**
         * CHV_NFE é Integer, porém para validar foi modificado para String
         */
        //10
        line.setFieldValue(RegistroC100.DT_DOC, data);
        //11
        line.setFieldValue(RegistroC100.DT_E_S, data);
        //12
        line.setFieldValue(RegistroC100.VL_DOC, 678912.22);
        //13
        line.setFieldValue(RegistroC100.IND_PGTO, "1");
        //14
        line.setFieldValue(RegistroC100.VL_DESC, 521.13);
        //15
        line.setFieldValue(RegistroC100.VL_ABAT_NT, 521.13);
        //16
        line.setFieldValue(RegistroC100.VL_MERC, 521.13);
        //17
        line.setFieldValue(RegistroC100.IND_FRT, "1");
        //18
        line.setFieldValue(RegistroC100.VL_FRT, 521.13);
        //19
        line.setFieldValue(RegistroC100.VL_SEG, 521.13);
        //20
        line.setFieldValue(RegistroC100.VL_OUT_DA, 521.13);
        //21
        line.setFieldValue(RegistroC100.VL_BC_ICMS, 521.13);
        //22
        line.setFieldValue(RegistroC100.VL_ICMS, 521.13);
        //23
        line.setFieldValue(RegistroC100.VL_BC_ICMS_ST, 521.13);
        //24
        line.setFieldValue(RegistroC100.VL_ICMS_ST, 521.13);
        //25
        line.setFieldValue(RegistroC100.VL_IPI, 521.13);
        //26
        line.setFieldValue(RegistroC100.VL_PIS, 521.13);
        //27
        line.setFieldValue(RegistroC100.VL_COFINS, 521.13);
        //28
        line.setFieldValue(RegistroC100.VL_PIS_ST, 521.13);
        //29
        line.setFieldValue(RegistroC100.VL_COFINS_ST, 521.13);
        
        StringBuffer sb = line.getRepresentation();
        
//        String expected = 
//                "|C100|1|0|Código do participante (campo 02 do Registro 0150)|11|12|100|123456789| asdfghjklçqwertyuiopzxcvbnm,.lkjhgfdsaqwe  |30012013|30012013|678912,22|1|521,13|521,13|521,13|1|521,13|521,13|521,13|521,13|521,13|521,13|521,13|521,13|521,13|521,13|521,13|521,13|";
//        System.out.println(sb);
//        System.out.print(expected);
//        assertEquals (expected, sb.toString());
        return sb.toString();
    }
}
