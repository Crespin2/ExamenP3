
package modeloDAO;

import interfaces.CRUD;
import java.util.List;
import modelo.categoria;
import modelo.producto;
import config.conexion;
import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class inventarioDAO implements CRUD{
    conexion cn= new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    producto p= new producto();
    categoria c = new categoria();

    @Override
    public List listarC() {
        ArrayList<categoria>list = new ArrayList<>();
        String sql="select * from tb_categoria";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                categoria cat= new categoria();
                cat.setId_categoria(rs.getInt("id_categoria"));
                cat.setNom_categoria(rs.getString("nom_categoria"));
                cat.setEstado_categoria(rs.getInt("estado_categoria"));
                list.add(cat);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public categoria list(int id_categoria) {
        ArrayList<categoria>list = new ArrayList<>();
        String sql="select * from tb_categoria where id_categoria="+id_categoria;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                c.setId_categoria(rs.getInt("id_categoria"));
                c.setNom_categoria(rs.getString("nom_categoria"));
                c.setEstado_categoria(rs.getInt("estado_categoria"));
               
            }
        } catch (Exception e) {
        }
        return c;    }

    @Override
    public boolean addC(categoria cat) {
String sql="insert into tb_categoria(nom_categoria, estado_categoria) values('"+cat.getNom_categoria()+"', '"+cat.getEstado_categoria()+"')";
    
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;    }

    @Override
    public boolean editC(categoria cat) {
         String sql="UPDATE tb_categoria set nom_categoria='"+cat.getNom_categoria()+"', estado_categoria='"+cat.getEstado_categoria()+"' where id_categoria="+cat.getId_categoria();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(int id_categoria) {
String sql="delete from tb_categoria where id_categoria="+id_categoria;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
        return false;    }

    @Override
    public List listarP() {
         ArrayList<producto>list= new ArrayList<>();
        String sql="select * from tb_producto";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                producto pro= new producto();
                pro.setId_producto(rs.getInt("id_producto"));
                pro.setNom_producto(rs.getString("nom_producto"));
                pro.setDes_producto(rs.getString("des_producto"));
                pro.setStock(rs.getDouble("stock"));
                pro.setPrecio(rs.getDouble("precio"));
                pro.setUnidad_de_medida(rs.getString("unidad_de_medida"));
                pro.setEstado_producto(rs.getInt("estado_producto"));
                pro.setCategoria(rs.getInt("categoria"));
                //error de la fecha
                pro.setFecha_entrada(rs.getString("fecha_entrada"));
                list.add(pro);
            }
        } catch (Exception e) {
        }
        return list;
       
    }

    @Override
    public producto listP(int id_producto) {
         ArrayList<producto>list = new ArrayList<>();
        String sql="select * from tb_producto where id_producto="+id_producto;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
               // p.setId(rs.getInt("id"));
                p.setId_producto(rs.getInt("id_producto"));
                p.setNom_producto(rs.getString("nom_producto"));
                p.setDes_producto(rs.getString("des_prodcuto"));
                p.setStock(rs.getDouble("stock"));
                p.setPrecio(rs.getDouble("precio"));
                p.setUnidad_de_medida(rs.getString("unidad_de_medida"));
                p.setEstado_producto(rs.getInt("estado_producto"));
                p.setCategoria(rs.getInt("categoria"));
                p.setFecha_entrada(rs.getString("fecha_entrada"));
            }
        } catch (Exception e) {
        }
        return p;
    }

    @Override
    public boolean addP(producto p) {
    String sql="insert into tb_producto(nom_producto, des_producto, stock, precio, unidad_de_medida, estado_producto, categoria, fecha_entrada) values ('"+p.getNom_producto()+"', '"+p.getDes_producto()+"', '"+p.getStock()+"', '"+p.getPrecio()+"', '"+p.getUnidad_de_medida()+"', '"+p.getEstado_producto()+"', '"+p.getCategoria()+"', '"+p.getFecha_entrada()+"')";    
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            
        }
        return false;
    }

    @Override
    public boolean editP(producto p) {
        String sql="update tb_producto set nom_producto='"+p.getNom_producto()+"', des_prodcuto='"+p.getDes_producto()+"', stock='"+p.getStock()+"', precio='"+p.getPrecio()+"', unidad_de_medida='"+p.getUnidad_de_medida()+"', estado_producto='"+p.getEstado_producto()+"', categoria='"+p.getCategoria()+"', fecha_entrada='"+p.getFecha_entrada()+"' where id_producto="+p.getId_producto();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminarP(int id_producto) {
            String sql="delete from tb_producto where id_producto="+id_producto;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            
        } catch (Exception e) {
        }
        return false;   
    }

 
  
}
