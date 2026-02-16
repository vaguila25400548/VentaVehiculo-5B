public class Vehiculo{
    private String marca;
    private double precio;
    private String motor;
    
    public Vehiculo(String marca, double precio, String motor){
        this.marca = marca;
        this.precio = precio;
        this.motor = motor;
    }
    public String getMarca(){
        return this.marca;
    } 
    public double getPrecio(){
        return this.precio;
    } 
    public String getMotor(){
        return this.motor;
    }    
    public void setMarca(String marca){
        this.marca = marca;
    } 
    public void setPrecio(double precio){
        this.precio = precio;
    } 
    public void setMotor(String motor){
        this.motor = motor;
    } 

    @Override 
    public String toString(){
        String cadena;
        cadena =  "Marca del vehiculo: " + this.marca + "\n" + 
        "Precio: $" + this.precio + "\n" + 
        "Motor del vehiculo: " + this.motor + "\n";
        return cadena;
    }

}