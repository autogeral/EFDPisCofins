package br.com.jcomputacao.sped.nfe.danfe;

import br.inf.portalfiscal.nfe.TNfeProc;
import com.itextpdf.text.DocumentException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author WILL
 */
public class DanfeImpressaoTest {

    public DanfeImpressaoTest() {
    }

    public static void main(String a[]) {
        String dir = "exemplos/";
        File fdir = new File(dir);
        if (!fdir.exists()) {
            System.out.println("Diretório não encontrado : " + fdir.getAbsolutePath());
            System.out.flush();
            return;
        }
        File[] files = fdir.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return (name.toLowerCase().endsWith(".xml"));
            }
        });

        List<TNfeProc> procs = new ArrayList<TNfeProc>();
        for (File f : files) {
            System.out.println("Tratando : " + f.getAbsolutePath());
            try {
                JAXBContext context = JAXBContext.newInstance("br.inf.portalfiscal.nfe");
                Unmarshaller unmarshaller = context.createUnmarshaller();
                FileInputStream fis = new FileInputStream(f);
                TNfeProc proc = unmarshaller.unmarshal(new StreamSource(fis), TNfeProc.class).getValue();
                fis.close();

                if (proc != null) {
                    procs.add(proc);
                }
            } catch (IOException ex) {
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.SEVERE, null, ex);
            } catch (JAXBException ex) {
                Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.SEVERE, null, ex);
            }
        }
        DanfeImpressao di = new DanfeImpressao(procs);
        try {
            di.execute();
        } catch (DocumentException ex) {
            Logger.getLogger(DanfeImpressaoTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(DanfeImpressaoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
