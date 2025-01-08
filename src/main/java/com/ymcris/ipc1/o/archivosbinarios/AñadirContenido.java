package com.ymcris.ipc1.o.archivosbinarios;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Clase que añade contenido al archivo de texto binario, constantemente
 *
 * @Date Oct 16, 2024
 * @author YmCris
 */
public class AñadirContenido extends ObjectOutputStream {

    public AñadirContenido(OutputStream out) throws IOException {
        super(out);
    }

    public AñadirContenido() throws IOException, SecurityException {
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }

}
