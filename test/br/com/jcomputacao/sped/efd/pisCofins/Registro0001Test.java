/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 08/11/2011 21:06:57
 * @author WILL
 */
public class Registro0001Test {

    public Registro0001Test() {
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
    public void LineCnabRegistroHeaderRemessaTest() throws ParseException {

        Registro0001 registro0001 = new Registro0001();
        LineModel lm = registro0001.createModel();
        lm.setFieldValue(Registro0001.REG, "0001");
        lm.setFieldValue(Registro0001.IND_MOV, 0l);
            StringBuffer  r = lm.getRepresentation();
            System.out.println(r);
    }
}
