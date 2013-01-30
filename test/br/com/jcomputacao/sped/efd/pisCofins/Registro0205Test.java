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
 * 09/11/2011 11:36:04
 * @author WILL
 */
public class Registro0205Test {
     public Registro0205Test() {
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
    public String linhaRegistro0205Test() throws ParseException{
        Registro0205 reg = new Registro0205();
        LineModel line = reg.createModel();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
                
        line.setFieldValue(Registro0205.DESCR_ANT_ITEM, "Descrição anterior do item");
        Date data = sdf.parse("29012013");
        line.setFieldValue(Registro0205.DT_INI, data);
        data = sdf.parse("31012013");
        line.setFieldValue(Registro0205.DT_FIM, data);
        line.setFieldValue(Registro0205.COD_ANT_ITEM, "Código anterior do item.");
        
        StringBuffer sb = line.getRepresentation();
        //System.out.print(sb);
        //String expected = "|0205|Descrição anterior do item|29012013|31012013|Código anterior do item.|";
        //assertEquals (expected, sb.toString());
        return sb.toString();
    }    
}
