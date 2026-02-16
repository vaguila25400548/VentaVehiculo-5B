public class Venta {
    private int cantidad;
    private Vehiculo vehiculo;
    private Cliente cliente;
            
    public Venta(int cantidad, Vehiculo vehiculo, Cliente cliente){
        this.cantidad = cantidad;
        this.vehiculo =  vehiculo;
        this.cliente =  cliente;
    }
    @Override 
    public String toString(){
        String cadena;
        cadena =  "Cantidad de venta: " + this.cantidad + "\n" + 
        "Vehiculo vendido: " + this.vehiculo + "\n" + 
        "Cliente: " + this.cliente + "\n";
        return cadena;
    }

}