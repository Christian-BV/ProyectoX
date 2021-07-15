
package Clases;

import java.util.ArrayList;

public class Seccion_Productos extends Grupo_Articulos{
    
    private String nombre_Seccion;
    private double total;

    public Seccion_Productos(String nombre_Seccion) {
        this.nombre_Seccion = nombre_Seccion;
    }

    public String getNombre_Seccion() {
        return nombre_Seccion;
    }

    public void setNombre_Seccion(String nombre_Seccion) {
        this.nombre_Seccion = nombre_Seccion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<Articulo> getCarro() {
        return Carro;
    }

    public void setCarro(ArrayList<Articulo> Carro) {
        this.Carro = Carro;
    }

    
    
    public String showList(){
        
       String lista = "";
        double sumatoria=0;
        for (int i=0;i<Carro.size();i++){
            Articulo n = Carro.get(i);
            lista+=n.shownameNCost()+"\n";
            sumatoria+=n.getPrecio();
        }
        double impuesto =(sumatoria/100)*18;
        double total = (sumatoria+impuesto);
        return lista+impuesto+" S/.           Importe tributario\n---------------------------------------------\n"
                +total+" S/.        TOTAL.";
    }
}
