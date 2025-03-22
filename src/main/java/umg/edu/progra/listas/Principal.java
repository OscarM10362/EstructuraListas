package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Principal {

    public static void main(String[] args) {

        Lista listaPares = new Lista();
        Lista listaImpares = new Lista();
        
        Lista lista = new Lista();
        lista.insertarCabezaLista(1);
        lista.insertarCabezaLista(2);
        lista.insertarCabezaLista(3);
        lista.insertarCabezaLista(4);
        lista.insertarCabezaLista(5);
        lista.insertarCabezaLista(6);
        lista.insertarCabezaLista(7);
        
        lista.visualizar();        
        
        System.out.println("\n");
        
        Lista lista2 = new Lista();
        lista2.insertarCabezaLista(32);
        lista2.insertarCabezaLista(33);
        lista2.insertarCabezaLista(35);
        lista2.insertarCabezaLista(36);
        lista2.insertarCabezaLista(37);
        lista2.insertarCabezaLista(31);
        lista2.insertarCabezaLista(40);
        
        lista2.visualizar();
        
        System.out.println("\n");
        System.out.println("primero: " + lista.leerPrimero());
      
        
        lista.eliminar(3);
        System.out.println("lista: " + lista);
        
        System.out.println("\n");
        
        Nodo dato = lista.buscarLista(5);  
        System.out.println("dato: " + dato);
        
        lista.insertarLista(dato, 10);
        System.out.println("lista " + lista);
        
        dato = lista.buscarLista(5);        
        System.out.println("dato " + dato);
        lista.insertarLista(dato, 600);
        lista.insertarLista(dato, 55);
        
        System.out.println("lista " + lista);
        
        lista.visualizar();
        
        System.out.println("\n");
        
        lista.unirListas(lista2);

        // Visualizamos la lista 1 después de unir
        System.out.println("\nLista 1 y 2 Unidas:");
        lista.visualizar();
        
        System.out.println("\n");
        
        lista.ordenarAscend();

        // Visualizamos la lista después de ordenar
        System.out.println("\nLista ordenada:");
        lista.visualizar();
        
        System.out.println("\n");
        lista.separarParesEImpares(listaPares, listaImpares);

        // Visualizar las listas separadas
        System.out.println("\nLista de Pares:");
        listaPares.visualizar();

        System.out.println("\nLista de Impares:");
        listaImpares.visualizar();
        
        
        /**
		 * Resolver lo que se solicita a continuacion
         * Ejercicio 1: Ordernar la lista de forma ascendente
         * Ejercicio 2: Unir dos listas enlazadas
         * Ejercicio 3: Separa numeros pares e impares en dos listas enlazadas diferentes
         */
        

    }

}
