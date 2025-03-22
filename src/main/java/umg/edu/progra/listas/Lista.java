package umg.edu.progra.listas;

/**
 *
 * @author Walter Cordova
 */
public class Lista {

    private Nodo primero;

    @Override
    public String toString() {
        return "=>" + primero;
    }

    /**
     * Constructor para inicializar una lista
     */
    public Lista() {
        primero = null;
    }

    /**
     * Devuelve el nodo inicial
     *
     * @return
     */
    public Nodo leerPrimero() {
        return primero;
    }

    /**
     * Inserta valores a la lista
     *
     * @param entrada
     */
    public void insertarCabezaLista(int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = primero;
        primero = nuevo;

    }

    /**
     * inserta un elemento a partir de anterior
     *
     * @param anterior
     * @param entrada
     */
    public void insertarLista(Nodo anterior, int entrada) {
        Nodo nuevo;
        nuevo = new Nodo(entrada);
        nuevo.enlace = anterior.enlace;
        anterior.enlace = nuevo;

    }

    /**
     * elimina el elemento entrada
     *
     * @param entrada
     */
    public void eliminar(int entrada) {
        Nodo actual, anterior;
        boolean encontrado;
        actual = primero;
        anterior = null;
        encontrado = false;
        // Bucle de búsqueda
        while ((actual != null) && !(actual.dato == entrada)) {
            if (!(actual.dato == entrada)) {
                anterior = actual;
                actual = actual.enlace;
            }
        }
        if (actual != null) {
            // Se distingue entre que el nodo sea el cabecera
            // o del resto de la lista
            if (actual == primero) {
                primero = actual.enlace;
            } else {
                anterior.enlace = actual.enlace;
            }
            actual = null;
        }
    }

    /**
     * busca el elemento destino
     *
     * @param destino
     * @return
     */
    public Nodo buscarLista(int destino) {
        Nodo indice;
        for (indice = primero; indice != null; indice = indice.enlace) {
            if (indice.dato == destino) {
                return indice;
            }
        }
        return null;
    }

    /**
     * recorre la lista y muestra cada dato
     */
    public void visualizar() {
        Nodo n;
        n = primero;
        while (n != null) {
            System.out.print(n.dato + " ");
            n = n.enlace;
        }
        
    }

    
     /**
     * 1 - Método para invertir la lista enlazada
     */
    

  public void ordenarAscend() {
        if (primero == null) return;  

        Nodo ordenada = null;  // Nueva lista que almacenará los nodos ordenados
        Nodo actual = primero;

        while (actual != null) {
            Nodo enlace = actual.enlace;
            if (ordenada == null || ordenada.dato >= actual.dato) {
                actual.enlace = ordenada;
                ordenada = actual;
            } else {
                Nodo N = ordenada;
                while (N.siguiente() != null && N.siguiente().dato < actual.dato) {
                    N = N.siguiente();
                }
                actual.enlace = N.enlace;
                N.enlace = actual;
            }
            actual = enlace;
        }

        primero = ordenada;
    }
  
  /**
     * 4 - Método para obtener el tamaño de la lista enlazada
     * @return 
     */
  
  
  public int contarElementos() {
        int contador = 0;
        Nodo X = primero;
        while (X != null) {
            contador++;
            X = X.siguiente();
        }
        return contador;
    } 

  public void unirListas(Lista otraLista) {
    // Si la lista actual está vacía, simplemente asignamos la lista pasada como la nueva lista.
    if (this.primero == null) {
        this.primero = otraLista.primero;
        return;
    }
    
    if (otraLista.primero == null) {
        return;
    }
    
    // Si ambas listas tienen datos, encontramos el último nodo de la lista actual.
    Nodo actual = this.primero;
    while (actual.enlace != null) {
        actual = actual.enlace;
    }

    // Enlazamos el último nodo de la lista actual con el primer nodo de la otra lista.
    actual.enlace = otraLista.primero;
  }
  
  public void separarParesEImpares(Lista listaPares, Lista listaImpares) {
    Nodo actual = this.primero;
    
    // Recorremos la lista original
    while (actual != null) {
        // Si el número es par, lo agregamos a la lista de pares
        if (actual.dato % 2 == 0) {
            listaPares.insertarCabezaLista(actual.dato);
        } 
        // Si el número es impar, lo agregamos a la lista de impares
        else {
            listaImpares.insertarCabezaLista(actual.dato);
        }
        
        actual = actual.enlace;
    }
}
	
    /**
     * 2 - Método para obtener el elemento en la posición n desde el final
     */

    /**
     * 3 - Método para eliminar duplicados en una lista enlazada
     */


    
   
    
}
