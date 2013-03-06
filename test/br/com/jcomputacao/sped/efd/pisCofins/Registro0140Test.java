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
 * 09/11/2011 09:51:25
 * @author WILL
 */
public class Registro0140Test {
     public Registro0140Test() {
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
    public void Registro0140Test() throws ParseException{
        Registro0140 reg = new Registro0140();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro0140.COD_EST, null);
        //03
        line.setFieldValue(Registro0140.NOME, "CONVIVERE EMPREENDIMENTOS IMOBILIÁRIOS LTDA");
        //04
        line.setFieldValue(Registro0140.CNPJ, 10276553000125L);
        //05
        line.setFieldValue(Registro0140.UF, "SP");
        //06
        line.setFieldValue(Registro0140.IE, null);
        //07
        line.setFieldValue(Registro0140.COD_MUN, 3523909L);
        //08
        line.setFieldValue(Registro0140.IM, null);
        //09
        line.setFieldValue(Registro0140.SUFRAMA, null);
        
        
        StringBuffer sb = line.getRepresentation();
        //String expected = "|0140||CONVIVERE EMPREENDIMENTOS IMOBILIÁRIOS LTDA|10276553000125|SP||3523909|||";
        System.out.println(sb);
        //System.out.print(expected);
        //assertEquals (expected, sb.toString());
    }
}
