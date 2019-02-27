package PROG_Ej_18_FicheroSerializable;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * @author fsancheztemprano
 */
public class HeadlessObjectOutputStream extends ObjectOutputStream {

    public HeadlessObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        
    }
    
    

}
