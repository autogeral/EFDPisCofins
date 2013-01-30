package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * 09/11/2011 11:06:06
 * @author WILL
 */
public class Registro0190Test {
    public Registro0190Test() {
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
    public String linhaRegistro0190Test(){
        Registro0190 reg = new Registro0190();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro0190.UNID, "UN");
        //03
        line.setFieldValue(Registro0190.DESCR, "Descrição da unidade de medida");

        
        StringBuffer sb = line.getRepresentation();
        //System.out.println(sb);
        //String expected = "|0190|UN|Descrição da unidade de medida|";
        //assertEquals (expected, sb.toString());
        
        return sb.toString();
    }
}
