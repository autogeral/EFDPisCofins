
package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 * 26/11/2011 10:01:57
 * @author Douglas
 */
public class Registro1502Test{

    public Registro1502Test() {
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
    public void Registro1502Test() throws ParseException{
        Registro1502 reg = new Registro1502();
        LineModel line = reg.createModel();
        Randomize rm = new Randomize();


        line.setFieldValue(Registro1502.REG, "1502");
        line.setFieldValue(Registro1502.VL_CRED_COFINS_TRIB_MI, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1502.VL_CRED_COFINS_NT_MI, rm.GeraDoubleRandom(2));
        line.setFieldValue(Registro1502.VL_CRED_COFINS_EXP, rm.GeraDoubleRandom(2));

        StringBuffer a = line.getRepresentation();
        System.out.print(a);
    }

}