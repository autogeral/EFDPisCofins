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
 * 09/11/2011 19:53:17
 * @author Jonas
 */
public class RegistroA100Test {

    public RegistroA100Test() {
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
    public void registroA100test() {
        RegistroA100 reg = new RegistroA100();
        LineModel line = reg.createModel();

        String Str60 = "";

        while (Str60.length() <= 60) {
             Random r = new Random();
            Str60 +=  Integer.toString(r.nextInt());
        }

        line.setFieldValue(RegistroA100.REG, "0001");
        line.setFieldValue(RegistroA100.IND_OPER, "0");
        line.setFieldValue(RegistroA100.IND_EMIT, "1");
        line.setFieldValue(RegistroA100.COD_PART, Str60);
        line.setFieldValue(RegistroA100.COD_SIT, 00l);
        line.setFieldValue(RegistroA100.SER, Str60.substring(20, 40));
        line.setFieldValue(RegistroA100.SUB, Str60.substring(10, 30));
        line.setFieldValue(RegistroA100.NUM_DOC, Str60);

        StringBuffer r = line.getRepresentation();
        System.out.print(r);

    }
}
