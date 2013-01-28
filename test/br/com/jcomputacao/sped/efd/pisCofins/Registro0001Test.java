/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 09/11/2011 08:23:46
 * @author WILL
 */
public class Registro0001Test {
    
    public Registro0001Test (){
    }
   
        public String linhaRegistro0001Test()  throws ParseException {
        Registro0001 reg = new Registro0001();
        LineModel line = reg.createModel();
        //02
        line.setFieldValue(Registro0001.IND_MOV, 0);
        
        StringBuffer sb = line.getRepresentation();
        //System.out.print(sb);
        //String expected = "|0001|0|";
        //assertEquals (expected, sb.toString());
        return sb.toString();
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
