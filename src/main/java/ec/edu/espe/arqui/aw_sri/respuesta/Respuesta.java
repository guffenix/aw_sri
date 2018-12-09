
package ec.edu.espe.arqui.aw_sri.respuesta;

import ec.edu.espe.arqui.aw_sri.generic.GenericEntidad;
import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author guffenix
 */
@Stateless
public class Respuesta {

   public GenericEntidad obtenerEntidad(String identificacionRuc){
       GenericEntidad temp = new GenericEntidad();
       GenericEntidad entidad = new GenericEntidad();
       
       entidad.setCodigo("1760002600001");
       entidad.setDireccion("Av. 10 de Agosto N11-409 y Briceño");
       entidad.setEstado(Boolean.TRUE);
       entidad.setFechaRegistro(new Date());
       entidad.setIdentificacion(1);
       entidad.setNombre("BANCO CENTRAL DEL ECUADOR");
       entidad.setRazonSocial("BANCO CENTRAL DEL ECUADOR BCE.");
       entidad.setTelefono("023938600");
       entidad.setTipo("BANCO");
       
       
       if (entidad.getCodigo().equals(identificacionRuc)) {
            temp = entidad;
        }
        
        return temp;
   }
}
