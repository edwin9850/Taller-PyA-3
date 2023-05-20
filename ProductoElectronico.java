
abstract class ProductoElectronico {  //se crea la clase abstracta
    private String nombre;
    private double precio;  //sus atributos
    private int garantia;

    public ProductoElectronico(String nombre, double precio, int garantia) {  //constructor
        this.nombre = nombre;
        this.precio = precio;
        this.garantia = garantia;
    }
//se hacen los getter 
  
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getGarantia() {
        return garantia;
    }

    public abstract void cargar(int cargaInicial); //metodo abstracto

  //metodo en cual se va a mostrar lo que tiene precio, nombre y garantia
    public void mostrarInformacion() {
      
        System.out.println("Nombre: " + nombre + "Precio: $" + precio+"Garantía: " + garantia );
       
    }
}
