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
import static org.junit.Assert.*;

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
    public String linhaRegistro0000Test() throws ParseException {
        Registro0000 reg = new Registro0000();
        LineModel line = reg.createModel();
        
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
        Date dataInicio = sdf.parse("26012013");
        Date dataFim = sdf.parse("30012013");
        //02
        line.setFieldValue(Registro0000.COD_VER, 123L);
        //03
        line.setFieldValue(Registro0000.TIPO_ESCRIT, 1L);
        //04
        line.setFieldValue(Registro0000.IND_SIT_ESP, 4L);
        //05
        line.setFieldValue(Registro0000.NUM_REC_ANTERIOR, "12345678901234567890123456789012345678901");
        //06
        line.setFieldValue(Registro0000.DT_INI, dataInicio);
        //07
        line.setFieldValue(Registro0000.DT_FIN, dataFim);
        //08
        line.setFieldValue(Registro0000.NOME, "ABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJ");
        //09
        line.setFieldValue(Registro0000.CNPJ, 12345678901234L);
        //10
        line.setFieldValue(Registro0000.UF, "RJ");
        //11
        line.setFieldValue(Registro0000.COD_MUN, 1234567L);
        //12
        line.setFieldValue(Registro0000.SUFRAMA, "QWERTYUIO");
        //13
        line.setFieldValue(Registro0000.IND_NAT_PJ, 10L);
        //14
        line.setFieldValue(Registro0000.IND_ATIV, 9L);
        StringBuffer sb = line.getRepresentation();
        //String expected = "|0000|123|1|4|12345678901234567890123456789012345678901|26012013|30012013|ABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJABCDEFGHIJ|12345678901234|RJ|1234567|QWERTYUIO|10|9|";
        //System.out.print(sb+"CRLF");
        //assertEquals(expected, sb.toString()+"CRLF"); 
        return sb.toString();
    }

}
