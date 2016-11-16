/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciondeprueba;

import servicio.Usuarios;

/**
 *
 * @author nacho
 */
public class AplicacionDePrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    private static boolean checkUsuario(java.lang.String nick, java.lang.String password) {
        servicio.NewWebService_Service service = new servicio.NewWebService_Service();
        servicio.NewWebService port = service.getNewWebServicePort();
        return port.checkUsuario(nick, password);
    }

    private static Usuarios getUsuario(java.lang.String nick) {
        servicio.NewWebService_Service service = new servicio.NewWebService_Service();
        servicio.NewWebService port = service.getNewWebServicePort();
        return port.getUsuario(nick);
    }
    
}
