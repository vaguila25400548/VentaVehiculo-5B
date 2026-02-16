public class Venta {
    private int cantidad;
    private Vehiculo vehiculo;
    private Cliente cliente;
            
    public Venta(int cantidad, Vehiculo vehiculo, Cliente cliente){
        this.cantidad = cantidad;
        this.vehiculo =  vehiculo;
        this.cliente =  cliente;
    }
    public int getCantidad(){
        return this.cantidad;
    } 
    public Vehiculo getVehiculo(){
        return this.vehiculo;
    } 
    public Cliente getCliente(){
        return this.cliente;
    }    
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    } 
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
    } 
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
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