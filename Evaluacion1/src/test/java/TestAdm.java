import uce.edu.ec.AdministradorJugador;
import uce.edu.ec.Jugador;
import java.util.Scanner;
import java.lang.Exception;

public class TestAdm {

    private static AdministradorJugador aj = new AdministradorJugador(3);
    // NO REALIZAR CAMBIOS
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opt=in.nextInt();
        if (opt == 1){
            testJugador();
        }
        else if (opt == 2){
            testJugador1();
        }
        else if (opt == 3){
            testJugador2();
        }
        else if (opt == 4){
            testJugador3();
        }
        else if (opt == 5){
            testJugador4();
        }
        else if (opt == 6){
            testJugador5();
        }

        else if (opt == 11){
            testNuevoJugador();
        }

        else if (opt == 13){
            testEditarJugador();
        }
        else if (opt == 14){
            testEliminarJugador();
        }
        else if (opt == 15){
            testBuscarJugador();
        }
        else if (opt == 16){
            testPremio();
        }
        else if (opt == 17){
            testTotal();
        }

    }

    public static void testJugador(){
        Jugador c1 = new Jugador("Juan","Delantero",4,3,2,1);
        System.out.println(c1);

        // Codigo: 1, Nombre: Juan, Demarcación: Delantero, Partidos Jugados: 4, Goles Marcados: 3, Tarjetas amarillas: 2, Tarjetas Rojas: 1
    }
    public static void testJugador1(){
        Jugador c1 = new Jugador();
        System.out.println(c1);
        // Codigo: 1, Nombre: sin nombre, Demarcación: sin demarcacion, Partidos Jugados: 0, Goles Marcados: 0, Tarjetas amarillas: 0, Tarjetas Rojas: 0


    }

    public static void testJugador2(){
        Jugador j1 = new Jugador("Pablo","Delantero",4,3,2,1);

        Jugador j2= new Jugador(j1);
        System.out.println(j2);

        // Codigo: 1, Nombre: Pablo, Demarcación: Delantero, Partidos Jugados: 4, Goles Marcados: 3, Tarjetas amarillas: 2, Tarjetas Rojas: 1
    }


    public static void testJugador3(){
        Jugador c1 = new Jugador("Juan","Delantero",4,13,2,1);
        c1.agregarGoles(10);
        System.out.println(c1);
        // Codigo: 1, Nombre: Juan, Demarcación: Delantero, Partidos Jugados: 4, Goles Marcados: 13, Tarjetas amarillas: 2, Tarjetas Rojas: 1

    }

    public static void testJugador4(){
        Jugador c1 = new Jugador("Juan","Delantero",4,3,2,1);

        System.out.println(c1.calcularPremio());
        // 1050

    }

    public static void testJugador5(){
        Jugador c1 = new Jugador("Juan","Delantero",4,3,2,1);
        c1.reiniciarGol ();
        System.out.println(c1);
        // Codigo: 1, Nombre: Juan, Demarcación: Delantero, Partidos Jugados: 4, Goles Marcados: 0, Tarjetas amarillas: 2, Tarjetas Rojas: 1

    }


    //CREAR
    public static void testNuevoJugador(){
        Jugador c1 = new Jugador("Jose","Delantero",4,3,2,1);
        aj.crear(c1);
        c1 = new Jugador("Pedro","Arquero",9,8,7,6);
        aj.crear(c1);
        System.out.println(aj);

        // Codigo: 1, Nombre: Jose, Demarcación: Delantero, Partidos Jugados: 4, Goles Marcados: 3, Tarjetas amarillas: 2, Tarjetas Rojas: 1
        // Codigo: 2, Nombre: Pedro, Demarcación: Arquero, Partidos Jugados: 9, Goles Marcados: 8, Tarjetas amarillas: 7, Tarjetas Rojas: 6
    }

    //Editar
    public static void testEditarJugador(){
        Jugador c1 = new Jugador("Jose","Delantero",4,3,2,1);
        aj.crear(c1);
        c1 = new Jugador("Pedro","Arquero",9,8,7,6);
        aj.crear(c1);

        c1 = new Jugador("Luis","Delantero",19,18,2,1);

        aj.editar(1,c1);
        System.out.println(aj);

        // Codigo: 1, Nombre: Jose, Demarcación: Delantero, Partidos Jugados: 4, Goles Marcados: 3, Tarjetas amarillas: 2, Tarjetas Rojas: 1
        // Codigo: 2, Nombre: Luis, Demarcación: Delantero, Partidos Jugados: 19, Goles Marcados: 18, Tarjetas amarillas: 2, Tarjetas Rojas: 1   

    }

    //Eliminar
    public static void testEliminarJugador(){
        Jugador c1 = new Jugador("Jose","Delantero",4,3,2,1);
        aj.crear(c1);
        c1 = new Jugador("Pedro","Arquero",9,8,7,6);
        aj.crear(c1);

        c1 = new Jugador("Manuel","Arquero",9,0,2,1);
        aj.crear(c1);

        aj.eliminar(1);
        System.out.println(aj);

        // Codigo: 1, Nombre: Jose, Demarcación: Delantero, Partidos Jugados: 4, Goles Marcados: 3, Tarjetas amarillas: 2, Tarjetas Rojas: 1
        // Codigo: 2, Nombre: Manuel, Demarcación: Arquero, Partidos Jugados: 9, Goles Marcados: 0, Tarjetas amarillas: 2, Tarjetas Rojas: 1
    }

    //Buscar
    public static void testBuscarJugador(){
        Jugador c1 = new Jugador("Jose","Delantero",4,3,2,1);
        aj.crear(c1);
        c1 = new Jugador("Pedro","Arquero",9,8,7,6);
        aj.crear(c1);

        c1 = new Jugador("Manuel","Arquero",9,0,2,1);
        aj.crear(c1);
        //testEliminarJugador();
        System.out.println(aj.buscar("Manuel"));

        // Codigo: 2, Nombre: Manuel, Demarcación: Arquero, Partidos Jugados: 9, Goles Marcados: 0, Tarjetas amarillas: 2, Tarjetas Rojas: 1

    }

    //Reporte premio
    public static void testPremio(){
        Jugador c1 = new Jugador("Manuel","Arquero",9,10,2,1);
        aj.crear(c1);
        System.out.println(aj.reportePremio());

        //Nombre: Manuel, Premio: 5000.0

    }

    //Total
    public static void testTotal(){
        Jugador c1 = new Jugador("Manuel","Arquero",9,0,2,1);
        aj.crear(c1);
        c1 = new Jugador("Pedro","Arquero",9,8,6,6);
        aj.crear(c1);


        System.out.println(aj.reporte());

        //Goles Marcados: 18, Tarjetas amarillas: 8, Tarjetas Rojas: 7

    }

}