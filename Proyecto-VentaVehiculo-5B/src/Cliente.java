public class Cliente {
    private String rs;
    private String rfc;
    private String email;
    
    public Cliente(String rs, String rfc, String email){
        this.rs = rs;
        this.rfc =  rfc;
        this.email =  email;
    }
    @Override 
    public String toString(){
        String cadena;
        cadena =  "Razón Social del cliente: " + this.rs + "\n" + 
        "RFC del cliente: " + this.rfc + "\n" + 
        "Email: " + this.email + "\n";
        return cadena;
    }

}