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
 *
 * @author rafael.galvao
 */
public class Registro0100Test {

    public Registro0100Test (){
    }
    
    public String linhaRegistro0100Test()  throws ParseException {
        Registro0100 reg = new Registro0100();
        LineModel line = reg.createModel();
        
        //02
        line.setFieldValue(Registro0100.NOME, "NOME DO CONTABILISTA");
        //03
        line.setFieldValue(Registro0100.CPF, 12312312319L);
        //04
        line.setFieldValue(Registro0100.CRC, "registro no crc");
        //05
        line.setFieldValue(Registro0100.CNPJ, 11111111111111L);
        //06
        line.setFieldValue(Registro0100.CEP, 22222222L);
        //07
        line.setFieldValue(Registro0100.END, "Rua Doutor Octaviano Pereira Mendes");
        //08
        line.setFieldValue(Registro0100.NUM, "33");
        //09
        line.setFieldValue(Registro0100.COMPL, "1º andar");
        //10
        line.setFieldValue(Registro0100.BAIRRO, "Centro");
        //11
        line.setFieldValue(Registro0100.FONE, "1140237777");
        //12
        line.setFieldValue(Registro0100.FAX, "1140232777");
        //13
        line.setFieldValue(Registro0100.EMAIL, "jennifer.santos@autogeral.com.br");
        //14
        line.setFieldValue(Registro0100.COD_MUN, 1234576L);

        StringBuffer sb = line.getRepresentation();
        //String expected = "|0100|NOME DO CONTABILISTA|12312312319|aaaaaaaaaaaaaaa|11111111111111|22222222|Rua Doutor Octaviano Pereira Mendes|33|1º andar|Centro|1140237777|1140232777|jennifer.santos@autogeral.com.br|1234576|";
        //System.out.print(sb);
        //assertEquals(expected, sb.toString());
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
