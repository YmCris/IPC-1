package com.ymcris.ipc1.m.excepcionespersonalizadas;

/**
 *
 * @author YmCris
 */
public class Verificacion {

    /**
     * Método encargada de validar si ambas constraseñas son correctas.
     *
     * @param contraseña1 contraseña inicial
     * @param contraseña2 contraseña verificada.
     * @throws ContraseñaInvalidaException Una excepcion la cual solo dirá si no
     * se pueden verificar las babosadas
     */
    public void varlidarContraseña(String contraseña1, String contraseña2) throws ContraseñaInvalidaException {
        if (!contraseña1.equals(contraseña2)) {
            throw new ContraseñaInvalidaException("Las constraseñas no son iguales");
        }
        if (contraseña1.length() < 8 || contraseña2.length() < 8) {
            throw new ContraseñaInvalidaException("El las constraseñas no son muy largas");
        }
    }
}
