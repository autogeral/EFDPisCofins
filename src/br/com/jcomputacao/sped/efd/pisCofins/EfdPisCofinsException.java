package br.com.jcomputacao.sped.efd.pisCofins;

/**
 * 17/11/2011 20:33:32
 * @author Murilo
 */
public class EfdPisCofinsException extends Exception {

    /**
     * Creates a new instance of <code>EfdPisCofinsException</code> without detail message.
     */
    public EfdPisCofinsException() {
    }

    /**
     * Constructs an instance of <code>EfdPisCofinsException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public EfdPisCofinsException(String msg) {
        super(msg);
    }
    
    public EfdPisCofinsException(String msg, Throwable ex) {
        super(msg, ex);
    }
}
