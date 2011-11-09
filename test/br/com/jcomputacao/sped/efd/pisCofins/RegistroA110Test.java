/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;
import br.com.jcomputacao.aristoteles.line.LineModel;
import java.util.Random;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
/**
 * 09/11/2011 21:22:42
 * @author Jonas
 */
public class RegistroA110Test {
     public RegistroA110Test(){
        
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
    public void registroA110test(){
        
        String Str255 = "";
        while (Str255.length() <= 255) {
            Random r = new Random();
            Str255 += (char) r.nextInt();
        }
        
        RegistroA110 reg = new RegistroA110();
        LineModel line = reg.createModel();
        line.setFieldValue(RegistroA110.REG, "0001");
        line.setFieldValue(RegistroA110.COD_INF, "sdf234");
        line.setFieldValue(RegistroA110.TXT_COMPL, Str255);
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
