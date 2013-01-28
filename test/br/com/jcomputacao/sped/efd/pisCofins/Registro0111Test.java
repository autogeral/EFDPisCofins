/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * 09/11/2011 09:29:49
 * @author WILL
 */
public class Registro0111Test {
    
    public Registro0111Test() {
    }

    public String linhaRegistro0111Test(){
        Registro0111 reg = new Registro0111();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro0111.REC_BRU_NCUM_TRIB_MI, 15464.21);
        //03
        line.setFieldValue(Registro0111.REC_BRU_NCUM_NT_MI, 1684161.61);
        //04
        line.setFieldValue(Registro0111.REC_BRU_NCUM_EXP, 65481.54);
        //05
        line.setFieldValue(Registro0111.REC_BRU_CUM, 546521.16);
        //06
        line.setFieldValue(Registro0111.REC_BRU_TOTAL, 165.14);
        
        StringBuffer sb = line.getRepresentation();
        //String expected = "|0111|15464,21|1684161,61|65481,54|546521,16|165,14|";
        //System.out.println(sb);
        //System.out.print(expected);
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
