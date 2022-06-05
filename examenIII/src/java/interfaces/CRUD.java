
package interfaces;

import java.util.List;
import modelo.categoria;
import modelo.producto;


public interface CRUD {
    public List listarC();
    public List listarP();
    public categoria list(int id_categoria);
    public boolean addC(categoria cat);
    public boolean editC(categoria cat);
    public boolean eliminar(int id_categoria);
    //producto
    public producto listP(int id_producto);
    public boolean addP(producto p);
    public boolean editP(producto p);
    public boolean eliminarP(int id_producto);
    
}
