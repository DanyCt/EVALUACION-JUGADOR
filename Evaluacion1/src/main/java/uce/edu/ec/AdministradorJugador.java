/*4.	Desarrolle la clase AdministradorJugador que implemente:
Elija una opción:
	Método constructor recibe un entero por parámetro indicando el número máximo de objetos que va a almacenar.
	Método int size() devuelve el número de objetos que hay en la lista.
	Método public boolean crear (Jugador jugador) que añade un objeto del tipo seleccionado (Jugador/Arquero), para lo cual se debe ingresar todos los atributos definidos en cada uno de los POJOS
	Método public boolean verificar(Jugador jugador) devuelve true si el Jugador  se encuentra dentro del ARREGLO, caso contrario  false. Debe controlarse con una excepción personalizada llamada ExcepcionDuplicado que devuelva “Jugado <nombre>  ya está registrado”
	Método public boolean editar (int index) permite modificar TODOS los atributos del Jugador.
	Método public boolean eliminar (int index) permite eliminar el objeto del arreglo.
	Método public Jugador buscar (string nombre) busca el objeto dentro del arreglo, de acuerdo con un parámetro que es el NOMBRE
	Método String toString() lista todos los elementos que se encuentran en el arreglo. El formato de salida definido debe presentar el nombre y valor de los atributos. (ej. Nombre: Jua, ..)
	Método public String reportePremio() devuelve la lista de los jugadores con el valor del premio calculado. (Nombre: Juan, Premio: 10.00)
	Método public String reporte() devuelve todos los Jugadores y Arqueros ingresados con los totales correspondientes a Goles Marcados, Tarjetas Amarillas, Tarjetas Rojas
*/
package uce.edu.ec;

public class AdministradorJugador {
    private Jugador[] jugadores;
    private int numeroMaximo;
    private int cantidadActual;

    // Constructor
    public AdministradorJugador(int numeroMaximo) {
        this.numeroMaximo = numeroMaximo;
        this.jugadores = new Jugador[numeroMaximo];
        this.cantidadActual = 0;
    }

    // Método size
    public int size() {
        return cantidadActual;
    }

    // Método crear
    public boolean crear(Jugador jugador) {
        if (cantidadActual < numeroMaximo) {
            if (!verificar(jugador)) {  // Verificar si el jugador ya existe
                jugadores[cantidadActual] = jugador;
                cantidadActual++;
                return true;
            }
            return false;  // Si el jugador ya existe, no se agrega
        }
        return false;
    }

    // Verificar si el jugador ya está registrado
    public boolean verificar(Jugador jugador) {
        for (int i = 0; i < cantidadActual; i++) {
            if (jugadores[i].getNombre().equals(jugador.getNombre())) {
                return true;
            }
        }
        return false;
    }

    // Método editar
    public boolean editar(int index, Jugador jugador) {
        if (index >= 0 && index < cantidadActual) {
            jugadores[index] = jugador;
            return true;
        }
        return false;
    }

    // Método eliminar
    public boolean eliminar(int index) {
        if (index >= 0 && index < cantidadActual) {
            for (int i = index; i < cantidadActual - 1; i++) {
                jugadores[i] = jugadores[i + 1];
            }
            jugadores[cantidadActual - 1] = null;
            cantidadActual--;
            return true;
        }
        return false;
    }

    // Buscar jugador por nombre
    public Jugador buscar(String nombre) {
        for (int i = 0; i < cantidadActual; i++) {
            if (jugadores[i].getNombre().equals(nombre)) {
                return jugadores[i];
            }
        }
        return null;
    }

    // Reporte de premios
    public String reportePremio() {
        StringBuilder reporte = new StringBuilder();
        for (int i = 0; i < cantidadActual; i++) {
            double premio = jugadores[i].calcularPremio();
            reporte.append("Nombre: ").append(jugadores[i].getNombre())
                    .append(", Premio: ").append(premio).append("\n");
        }
        return reporte.toString();
    }

    // Reporte total de goles, tarjetas amarillas y rojas
    public String reporte() {
        int totalGoles = 0;
        int totalAmarillas = 0;
        int totalRojas = 0;

        for (int i = 0; i < cantidadActual; i++) {
            totalGoles += jugadores[i].getGolesMarcados();
            totalAmarillas += jugadores[i].getTarjetasAmarillas();
            totalRojas += jugadores[i].getTarjetasRojas();
        }

        return "Goles Marcados: " + totalGoles + ", Tarjetas amarillas: " + totalAmarillas + ", Tarjetas Rojas: " + totalRojas;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < cantidadActual; i++) {
            resultado.append(jugadores[i]).append("\n");
        }
        return resultado.toString();
    }
}
