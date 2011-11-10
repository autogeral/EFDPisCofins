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
 *
 * @author Ana Cláudia
 */
public class RegistroD200Test {

    public RegistroD200Test() {
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
    public void RegistroD200Test() {
        RegistroD200 reg = new RegistroD200();
        LineModel line = reg.createModel();

        line.setFieldValue(RegistroD200.REG, "0100");
        line.setFieldValue(RegistroD200.COD_MOD, "41");
        line.setFieldValue(RegistroD200.COD_SIT, 42L);
        line.setFieldValue(RegistroD200.SER, "abcd");
        line.setFieldValue(RegistroD200.SUB, "efgh");
        line.setFieldValue(RegistroD200.NUM_DOC_INI, 123456789L);
        line.setFieldValue(RegistroD200.NUM_DOC_FIN, 123456789L);
        line.setFieldValue(RegistroD200.CFOP, 1234L);
        line.setFieldValue(RegistroD200.DT_REF, 12345678L);
        line.setFieldValue(RegistroD200.VL_DOC, 873.12);
        line.setFieldValue(RegistroD200.VL_DESC, 122.43);




        StringBuffer r = line.getRepresentation();
        System.out.print(r);
    }
}
