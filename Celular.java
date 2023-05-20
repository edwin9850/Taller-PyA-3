
class Celular extends ProductoElectronico { //la clase celular hereda la clase ProductosElectronicos
    private String modelo; //atributo de la clase

    public Celular(String nombre, double precio, int garantia, String modelo) { //constructor de la clase
        super(nombre, precio, garantia); //constructor de la calse padre
        this.modelo = modelo;
    }

  //getter
    public String getModelo() {
        return modelo;
    }

  //se sobre escribe el metodo abstracto que se tenia en la clase padres
    @Override
    public void cargar(int cargaInicial) {
        System.out.println("Cargando el celular " + getModelo() + " con una carga inicial de " + cargaInicial );
    }

  //metodo para decir el precio del celular
    public void Precio(double precio) {
        System.out.println("el precio del celular es " + precio);
    }
}



