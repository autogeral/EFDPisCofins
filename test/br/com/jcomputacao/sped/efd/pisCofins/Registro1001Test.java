package br.com.jcomputacao.sped.efd.pisCofins;

import br.com.jcomputacao.aristoteles.line.LineModel;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * 12/11/2011 10:37:55
 * @author WILL
 */
public class Registro1001Test {


    @Test
    public void Registro1001Test(){
        Registro1001 reg = new Registro1001();
        LineModel line = reg.createModel();    
        
        //02
        line.setFieldValue(Registro1001.IND_MOV, 1);
        
        StringBuffer sb = line.getRepresentation();
        String result = sb.toString();
//        String expected = "|1001|1|";
//        
//        System.out.println("Excecting ....  : " + expected);
//        System.out.println("Result    ....  : " + result);
//        assertEquals(expected, result);
    }
    
}
