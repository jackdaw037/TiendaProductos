public class Cliente {

    private String nombre;
    private String apellido;
    private String telefono;
    private String cod_postal;
    private String direccion;


    public Cliente(String nombre, String apellido, String telefono, String cod_postal, String direccion){

        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cod_postal = cod_postal;
        this.direccion = direccion;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getTelefono(){
        return telefono;
    }

    public String getCod_postal(){
        return cod_postal;
    }

    public String getDireccion(){
        return direccion;
    }

    public void mostrarCliente(){
        System.out.println("\nNombre : "+nombre + apellido +
                            "Direccion : " +direccion+
                            "Codigo postal : "+ cod_postal+
                            "Telefono : "+telefono);
    }
}
