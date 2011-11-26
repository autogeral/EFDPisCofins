
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 26/11/2011 11:46:16
 * @author Douglas
 */
public class Registro1809Test{

    public Registro1809Test() {
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
    public void Registro1809Test() throws ParseException{
        Registro1809 reg = new Registro1809();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(Registro1809.REG, "1809");
        line.setFieldValue(Registro1809.NUM_PROC, rm.GeraStringRandom(20));
        line.setFieldValue(Registro1809.IND_PROC, rm.GeraStringRandom(1));


        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }
}
