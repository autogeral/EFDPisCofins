/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author John
 */
public class Registro0000Test {
    
    public Registro0000Test() throws ParseException {
        Registro0000 reg = new Registro0000();
        LineModel line = reg.createModel();
SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date data = sdf.parse("17121986");
        line.setFieldValue(Registro0000.REG, "1323");
        line.setFieldValue(Registro0000.COD_VER, 123L);
        line.setFieldValue(Registro0000.TIPO_ESCRIT, 1L);
        line.setFieldValue(Registro0000.IND_SIT_ESP, 4L);
        line.setFieldValue(Registro0000.NUM_REC_ANTERIOR, "12345678901234567890123456789012345678901");
        line.setFieldValue(Registro0000.DT_INI, data);
        line.setFieldValue(Registro0000.DT_FIN, data);
        line.setFieldValue(Registro0000.NOME, "ABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJ");
        line.setFieldValue(Registro0000.CNPJ, 12345678901234L);
        line.setFieldValue(Registro0000.UF, "RJ");
        line.setFieldValue(Registro0000.COD_MUN, 1234567L);
        line.setFieldValue(Registro0000.SUFRAMA, "QWERTYUIO");
        line.setFieldValue(Registro0000.IND_NAT_PJ, 10L);
        line.setFieldValue(Registro0000.IND_ATIV, 9L);

        StringBuffer sb = line.getRepresentation();
        //   String expected = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx    "+ "1323" + 22222222l + 1111111111111l;
        System.out.print(sb);
        // assertEquals(expected, sb.toString());
        
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
    public void testSomeMethod() {
    }
}
