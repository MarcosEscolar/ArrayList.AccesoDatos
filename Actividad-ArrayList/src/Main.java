import java.util.ArrayList;


public class Main {
    static void main(String[] args) {
        // TODO: Crear un ArrayList de Productos llamado "inventario"
        ArrayList<Producto> inventario = new ArrayList<>();


            inventario.add(new Producto("P001", "Portatil", 899.99));
            inventario.add(new Producto("P002", "Raton", 25.50));
            inventario.add(new Producto("P003", "Teclado", 45.00));
            inventario.add(new Producto("P004", "Monitor", 199.99));
            inventario.add(new Producto("P005", "Webcam", 59.90));


//Ver todos los productos
            System.out.println("Productos en el inventario:");
            for (Producto producto : inventario) {
                System.out.println(producto);
            }

//Ejercicio 2
//Ver productos totales
        System.out.println("---Productos totales--- " );
        for (int i = 0; i < inventario.size(); i++) {
        }
        System.out.println("Total: "+ inventario.size() );

//Encontrar producto por codigo
        Producto encontrado = null;
        for (Producto p : inventario) {
            if (p.codigo.equals("P003")) {
                encontrado = p;
                break;
            }
        }

        if (encontrado != null) {
            System.out.println("Producto encontrado: " + encontrado);
        } else {
            System.out.println("Producto con código P003 no encontrado.");
        }

// TODO: Verificar si existe un producto llamado "Ratón"
        boolean existeRaton = false;
        for (Producto p : inventario) {
            if (p.nombre.equals("Ratón")) {
                existeRaton = true;
                break;
            }
            System.out.println("Producto encontrado: " + p.nombre);
        }
        //Ejercicio3
// TODO: Cambiar el precio del Monitor a 179.99€
        for (Producto p : inventario) {
            if (p.nombre.equalsIgnoreCase("Monitor")) {
                p.precio = 179.99;
                break;
            }
        }
// TODO: Eliminar la Webcam del inventario
        inventario.removeIf(p -> p.nombre.equalsIgnoreCase("Webcam"));
// TODO: Añadir un nuevo producto: P006 - Altavoces - 35.00€
        inventario.add(new Producto("P006", "Altavoces", 35.00));

        //Ejercicio4

// TODO: Calcular el precio total del inventario
        double precioTotal = 0;
        for (Producto p : inventario) {
            precioTotal += p.precio;
        }
        System.out.println("Precio total del inventario: €" + precioTotal);

// TODO: Encontrar el producto más caro
        Producto masCaro = inventario.get(0);
        for (Producto p : inventario) {
            if (p.precio > masCaro.precio) {
                masCaro = p;
            }
        }
        System.out.println("Producto más caro: " + masCaro);
// TODO: Mostrar solo productos con precio superior a 50€
        System.out.println("Productos con precio superior a €50:");
        for (Producto p : inventario) {
            if (p.precio > 50.00) {
                System.out.println(p);
            }
        }

        // TODO: Añadir 5 productos al inventario con estos datos:
        // P001 - Portátil - 899.99€
        // P002 - Ratón - 25.50€
        // P003 - Teclado - 45.00€
        // P004 - Monitor - 199.99€
        // P005 - Webcam - 59.90€
        // TODO: Mostrar todos los productos
    }

}
