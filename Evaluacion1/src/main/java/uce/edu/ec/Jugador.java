// Desarrolle el POJO
// - Metodo constructor por defectoo, con parameetros , con parametro referencia a objeto
//-	Método public double calcularPremio()  que será igual a la suma de goles*500
//-	Método public void agregarGoles (int goles) añade la cantidad de goles a los goles marcados
//- Metodo toString con el siguiente formato:
//Codigo: xx,
//Nombre: xx,
//Demarcación: xx,
//Partidos Jugados: xx,
//Goles Marcados: xx,
//Tarjetas amarillas: xx,
//Tarjetas Rojas: xx

package uce.edu.ec;

public class Jugador {
    private static int contador = 1;  // Contador para los códigos de jugador
    private String nombre;
    private String demarcacion;
    private int partidosJugados;
    private int golesMarcados;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    private int codigo;

    // Constructor por defecto
    public Jugador() {
        this.nombre = "sin nombre";
        this.demarcacion = "sin demarcacion";
        this.partidosJugados = 0;
        this.golesMarcados = 0;
        this.tarjetasAmarillas = 0;
        this.tarjetasRojas = 0;
        this.codigo = contador++;
    }

    // Constructor con parámetros
    public Jugador(String nombre, String demarcacion, int partidosJugados, int golesMarcados, int tarjetasAmarillas, int tarjetasRojas) {
        this.nombre = nombre;
        this.demarcacion = demarcacion;
        this.partidosJugados = partidosJugados;
        this.golesMarcados = golesMarcados;
        this.tarjetasAmarillas = tarjetasAmarillas;
        this.tarjetasRojas = tarjetasRojas;
        this.codigo = contador++;
    }

    // Constructor por referencia (copia)
    public Jugador(Jugador jugador) {
        this.nombre = jugador.nombre;
        this.demarcacion = jugador.demarcacion;
        this.partidosJugados = jugador.partidosJugados;
        this.golesMarcados = jugador.golesMarcados;
        this.tarjetasAmarillas = jugador.tarjetasAmarillas;
        this.tarjetasRojas = jugador.tarjetasRojas;
        this.codigo = contador++;
    }

    // Métodos getter y setter
    public String getNombre() { return nombre; }
    public String getDemarcacion() { return demarcacion; }
    public int getPartidosJugados() { return partidosJugados; }
    public int getGolesMarcados() { return golesMarcados; }
    public int getTarjetasAmarillas() { return tarjetasAmarillas; }
    public int getTarjetasRojas() { return tarjetasRojas; }
    public int getCodigo() { return codigo; }

    // Método para agregar goles
    public void agregarGoles(int goles) {
        this.golesMarcados += goles;
    }

    // Método para calcular el premio
    public double calcularPremio() {
        return this.golesMarcados * 500;
    }

    // Método para reiniciar los goles
    public void reiniciarGol() {
        this.golesMarcados = 0;
    }

    // Método toString
    @Override
    public String toString() {
        return "Codigo: " + codigo + ", Nombre: " + nombre + ", Demarcación: " + demarcacion +
                ", Partidos Jugados: " + partidosJugados + ", Goles Marcados: " + golesMarcados +
                ", Tarjetas Amarillas: " + tarjetasAmarillas + ", Tarjetas Rojas: " + tarjetasRojas;
    }
}
