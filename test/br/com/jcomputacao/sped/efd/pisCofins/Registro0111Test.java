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
/**
 * 09/11/2011 09:29:49
 * @author WILL
 */
public class Registro0111Test {
    public Registro0111Test() {
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
    public void registro0111test(){
        Registro0111 reg = new Registro0111();
        LineModel line = reg.createModel();
        
        line.setFieldValue(Registro0111.REG, "0001");
        line.setFieldValue(Registro0111.REC_BRU_NCUM_TRIB_MI, 22222222222222222222.22);
        line.setFieldValue(Registro0111.REC_BRU_NCUM_NT_MI, 22222222222222222222.22);
        line.setFieldValue(Registro0111.REC_BRU_NCUM_EXP, 22222222222222222222.22);
        line.setFieldValue(Registro0111.REC_BRU_CUM, 22222222222222222222.22);
        line.setFieldValue(Registro0111.REC_BRU_TOTAL, 22222222222222222222.22);
        
        StringBuffer r = line.getRepresentation();
        System.out.print(r);
        
    }
}
