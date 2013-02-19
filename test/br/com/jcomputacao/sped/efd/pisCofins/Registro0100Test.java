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
    public void Registro0100Test()  throws ParseException {
        Registro0100 reg = new Registro0100();
        LineModel line = reg.createModel();
//|0100|VANESSA REGINA GAVIOLI|27859578816|ASP199019/O||13300190|RUA PADRE BARTOLOMEU TADEI|268||CENTRO|1140231678|1140231678|officecont@uol.com.br|3523909|        
        //02
        line.setFieldValue(Registro0100.NOME, "VANESSA REGINA GAVIOLI");
        //03
        line.setFieldValue(Registro0100.CPF, 27859578816L);
        //04
        line.setFieldValue(Registro0100.CRC, "ASP199019/O");
        //05
        line.setFieldValue(Registro0100.CNPJ, null);
        //06
        line.setFieldValue(Registro0100.CEP, 13300190L);
        //07
        line.setFieldValue(Registro0100.END, "RUA PADRE BARTOLOMEU TADEI");
        //08
        line.setFieldValue(Registro0100.NUM, "268");
        //09
        line.setFieldValue(Registro0100.COMPL, null);
        //10
        line.setFieldValue(Registro0100.BAIRRO, "CENTRO");
        //11
        line.setFieldValue(Registro0100.FONE, "1140231678");
        //12
        line.setFieldValue(Registro0100.FAX, "1140231678");
        //13
        line.setFieldValue(Registro0100.EMAIL, "officecont@uol.com.br");
        //14
        line.setFieldValue(Registro0100.COD_MUN, 3523909L);

        StringBuffer sb = line.getRepresentation();
        String expected = "|0100|VANESSA REGINA GAVIOLI|27859578816|ASP199019/O||13300190|RUA PADRE BARTOLOMEU TADEI|268||CENTRO|1140231678|1140231678|officecont@uol.com.br|3523909|";
        System.out.print(sb);
//        assertEquals(expected, sb.toString());
    }
    
}
