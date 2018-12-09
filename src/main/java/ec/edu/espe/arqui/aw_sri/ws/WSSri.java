
package ec.edu.espe.arqui.aw_sri.ws;

import ec.edu.espe.arqui.aw_sri.generic.GenericEntidad;
import ec.edu.espe.arqui.aw_sri.respuesta.Respuesta;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author guffenix
 */
@WebService(serviceName = "WSSri")
public class WSSri {

    @EJB
    private Respuesta ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "obtenerEntidad")
    public GenericEntidad obtenerEntidad(@WebParam(name = "identificacionRuc") String identificacionRuc) {
        return ejbRef.obtenerEntidad(identificacionRuc);
    }
    
}
