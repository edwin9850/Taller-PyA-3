import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      System.out.println();
        ArrayList<ProductoElectronico> productos = new ArrayList<>(); //creo un arreglo de tamaño ProductoElectronico con el nombre productos

        Celular celular1 = new Celular("iPhone", 1000.0, 1, "X");
        Celular celular2 = new Celular("Samsung Galaxy", 800.0, 2, "S21");   //creo dos celulares y los lleno con sus datos 
      
        Computadora computadora1 = new Computadora("Dell", 1500.0, 3, "XPS");
        Computadora computadora2 = new Computadora("HP", 1200.0, 2, "Pavilion"); //creo dos computadoras y los lleno con sus datos

      //agrego los productos a la lista productos
        productos.add(celular1); 
        productos.add(celular2);
        productos.add(computadora1);
        productos.add(computadora2);

      //un for pata mostrar la lista
        for (ProductoElectronico producto : productos) {
            producto.mostrarInformacion();
            producto.cargar(50);


          //el conficiona es para verificar si el objeto llamado producto es una instancia de la clase Celular o de una clase que hereda de Celular
            if (producto instanceof Celular) { 
                Celular celular = (Celular) producto; //este seria para el caso del celular
                celular.Precio(3000000); //le damos precio del celular
            } else if (producto instanceof Computadora) { //este seria para el caso de la computadora
                Computadora computadora = (Computadora) producto;
                computadora.ejecutarPrograma("Word");
            }

            System.out.println();
        }
    }
}
