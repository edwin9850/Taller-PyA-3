
//clase computadora que hereda la clase ProductoElectronico
class Computadora extends ProductoElectronico {
    private String marca; //atributos de la clase

    public Computadora(String nombre, double precio, int garantia, String marca) {  //constructor
        super(nombre, precio, garantia);
        this.marca = marca;
    }

  //getter
    public String getMarca() {
        return marca;
    }

  //sobre escribo el metodo cargar
    @Override
    public void cargar(int cargaInicial) {
        System.out.println("Cargando la computadora " + getMarca() + " con una carga inicial de " + cargaInicial + "%");
    }
  
//un metodo el cual me dice la aplicación que estoy usando
    public void ejecutarPrograma(String programa) {
        System.out.println("aplicación en uso: " + programa);
    }
}