package controller;

import model.*;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class GestionJuego {
    //Equipo A
    private ArrayList<Personaje> equipoA;
    private ArrayList<Personaje> equipoB;
    private Scanner scanner;

    public GestionJuego() {
        equipoA = new ArrayList<>();
        equipoB = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    //Funcionalidades
    public void iniciar(){
        int opcion = 0;
        do {
            System.out.println("====== GESTIÓN JUEGO ROL =====");
            System.out.println("1. Agregar Personaje");
            System.out.println("2. Listar Equipos");
            System.out.println("3. Buscar Personaje");
            System.out.println("4. Comenzar Batalla");
            System.out.println("5. Salir");
            System.out.println("Elige una opción: ");

            //Control de excepciones
            try {
                opcion = Integer.parseInt(scanner.nextLine());

            }catch (NumberFormatException e){
                System.out.println("Error. Introducir un número válido");
                continue;
            }

            switch (opcion){
                case 1 -> agregarPersonaje();
                case 2 -> listarEquipos();
                case 3 -> buscarPersonaje();
                case 4 -> comenzarJuego(); //Pendiente de realizar
                case 5 -> System.out.println("Hasta pronto Jugador.");
                default -> System.out.println("Opción no válida");
            }

        }while ( opcion != 5);
    }

    private void agregarPersonaje(){
        System.out.println("¿Tú personaje irá al equipo A o B?: ");
        String equipo = scanner.nextLine().toUpperCase();

        ArrayList<Personaje> listaEquipoFinal;

        //Asignamos a equipo A o equipo B
        if (equipo.equalsIgnoreCase("A")){
            listaEquipoFinal = equipoA;
        }else {
            listaEquipoFinal = equipoB;
        }

        System.out.println("Selecciona el tipo de personaje: ");
        System.out.println("1. Mago | 2. Guerrero | 3. Arquero | 4. Soldado | 5. Clérigo");
        String tipoPersonaje = scanner.nextLine().toLowerCase();

        //Datos Comunes del Personaje
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Rango: ");
        String rango = scanner.nextLine();
        System.out.println("Vida Inicial: ");
        int vida = Integer.parseInt(scanner.nextLine());


        //Instanciamos Personaje
        Personaje nuevoPersonaje = null; //Inicialiazamos

        //Creamos el Personaje según el tipo especificado
        switch (tipoPersonaje){
            case "mago" -> {
                System.out.println("¿Especialidad Magia -> Negra o Blanca?");
                String especialidad = scanner.nextLine().toLowerCase();
                scanner.nextLine();
                nuevoPersonaje = new Mago(nombre, rango, vida, especialidad);
            }

            case "guerrero" -> {
                System.out.println("Debes indicar tu potenciador (1-2): ");
                int potenciador = scanner.nextInt();
                scanner.nextLine();
                nuevoPersonaje = new Guerrero(nombre,rango, vida, potenciador);
            }

            case "arquero" -> {
                System.out.println("¿Cuantas flechas tienes arquero?: ");
                int flechas = scanner.nextInt();

                System.out.println("¿Tú nivel de fuerza?: ");
                int nivelFuerza = scanner.nextInt();

                //limpiamos buffer
                scanner.nextLine();

                nuevoPersonaje = new Arquero(nombre, rango, vida, flechas, nivelFuerza);
            }

            case "soldado" -> {
                scanner.nextLine();
                nuevoPersonaje = new Soldado(nombre, rango, vida);
            }

            case "clerigo" -> {
                scanner.nextLine();
                nuevoPersonaje = new Clerigo(nombre, rango, vida);
            }


            default -> System.out.println("Error. Tipo no válido");
        }
        //Se crea el personaje si es distinto de null
        if ( nuevoPersonaje != null){
            listaEquipoFinal.add(nuevoPersonaje);
            System.out.println(nombre + " se agregó al equipo " + equipo);
        }

    }

    //Listamos los equipos
    private void listarEquipos(){
        System.out.println("====== Equipo A =======");
        if (equipoA.isEmpty()){
            System.out.println("Equipo A vacío");
        }
        //Listamos y accedemos a ellos con .forEach
        equipoA.forEach(Personaje::mostrarInformacion);

        System.out.println("====== Equipo B =======");
        if (equipoB.isEmpty()){
            System.out.println("Equipo B vacío");
        }
        //Listamos y accedemos a ellos con .forEach
        equipoB.forEach(Personaje::mostrarInformacion);

    }

    //Buscamos personaje
    private void buscarPersonaje(){
        System.out.println("Introduce el nombre del personaje a buscar: ");
        String nombre = scanner.nextLine().toLowerCase();
        boolean encontrado = false;

        //Buscamos e iteramos con un for
        for (Personaje personaje:equipoA){
            if (personaje.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Personaje encontrado en equipo A");
                personaje.mostrarInformacion();
                encontrado = true;
            }
        }

        for (Personaje personaje:equipoB){
            if (personaje.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("Personaje encontrado en equipo B");
                personaje.mostrarInformacion();
                encontrado = true;
            }
        }

        //Si no se encontró mostramos el siguiente mensaje
        if (!encontrado){
            System.out.println("No se encontró el personaje con ese nombre");
        }
    }

    //Comienza el Juego
    private void comenzarJuego(){
        // Validación del enunciado: "tiene que haber 1 tipo de personaje en cada equipo"

        // De momento, comprobaremos simplemente que no estén vacíos.
        if (equipoA.isEmpty() || equipoB.isEmpty()){
            System.out.println("Error. Ambos equipos de tener al menos un personaje");
            return;
        }

        System.out.println("Comienza la batalla");
        batalla();
    }

    //Batalla
    private void batalla(){
        int turno = 1;
        boolean turnoEquipoA = true; //false EquipoB
        //Bucle hasta que un equipo pierda
        while (!equipoDerrotado(equipoA) && !equipoDerrotado(equipoB)){
            System.out.println("\n╔════════════════════════════════╗");
            System.out.println("║ TURNO " + turno + " | JUEGA: " + (turnoEquipoA ? "EQUIPO A" : "EQUIPO B") + " ║");
            System.out.println("╚════════════════════════════════╝");

            //Definimo quien ataca y quien recibe
            ArrayList<Personaje> aliados = turnoEquipoA ? equipoA : equipoB;
            ArrayList<Personaje> enemigos = turnoEquipoA ? equipoB : equipoA;

            //Elegimos personaje
            Personaje campeon =  elegirPersonaje(aliados);

            if (campeon != null){
                jugarTurnoPersonaje(campeon, aliados, enemigos); //Se juega el turno con el personaje elegido
            }

            //Mostramos estado de la batalla
            listarEquipos();

            //Cambiamos turno
            turnoEquipoA = !turnoEquipoA; //Ahora equipoA es equipoB
            turno++;
        }

        //Finalizamos el juego
        equipoGanador();
    }

    private void jugarTurnoPersonaje(Personaje personaje, ArrayList<Personaje> aliados, ArrayList<Personaje> enemigos){
        System.out.println("Has elegido a: " + personaje.getNombre());

        try {
            //SOLDADO
            switch (personaje) {
                case Soldado soldado -> {
                    System.out.println("1. Atacar enemigo ");
                    System.out.println("2. Curar aliado ");
                    System.out.println("3. Recargar Mago (Hechizos)");

                    int op = Integer.parseInt(scanner.nextLine()); //Controlamos que si se introduce un String no de error

                    if (op == 1) {
                        realizarAtaque((IAtacante) personaje, enemigos);
                    } else if (op == 2) {
                        realizarCura((ICurador) personaje, aliados);
                    } else if (op == 3) {
                        realizarRecargaMago(soldado, aliados);
                    }

                }
                case Mago mago -> { //MAGO
                    System.out.println("1. Curar un aliado");
                    System.out.println("2. Curar a todo el equipo");
                    System.out.println("3. Ataque a todo el equipo enemigo");

                    int op = Integer.parseInt(scanner.nextLine());
                    if (op == 1) realizarCura((ICurador) personaje, aliados);
                    else if (op == 2) mago.lanzarConjuroCuracion(aliados);
                    else if (op == 3) mago.lanzarHechizoAtaque(enemigos);

                }
                case Clerigo clerigo -> { //CLÉRIGO
                    System.out.println("1. Curar a un aliado");
                    System.out.println("2. Información de mi equipo");

                    int op = Integer.parseInt(scanner.nextLine());
                    if (op == 1) realizarCura((ICurador) personaje, aliados);
                    else clerigo.mostrarInfoEquipo(aliados);

                }
                case Arquero arquero -> { //ARQUERO
                    System.out.println("1. Disparo certero");
                    System.out.println("2. Lluvia de flechas (Ataca a min 3 enemigos aleatorios)");

                    int op = Integer.parseInt(scanner.nextLine());
                    if (op == 1) realizarAtaque((IAtacante) personaje, enemigos);
                    else arquero.ataqueGrupal(enemigos);

                }
                case Guerrero guerrero -> {
                    System.out.println("1. Ataque normal");
                    System.out.println("2. Ataque mortal ");

                    int op = Integer.parseInt(scanner.nextLine());
                    if (op == 1) realizarAtaque((IAtacante) personaje, enemigos);
                    else guerrero.ataqueMortal(enemigos);
                }
                default -> {
                }
            }
        }catch (JuegoExcepcion e){
            System.out.println("ERROR DE JUEGO" + e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("Error. Introduce un número valido");
        }catch (Exception e){
            System.out.println("Error inesperado" + e.getMessage());
        }
    }


    // Métodos auxiliares de Acción Personaje
    private void realizarAtaque(IAtacante atacante, ArrayList<Personaje> enemigos) throws JuegoExcepcion{
        System.out.println("¿A quien quieres atacar?: ");
        Personaje objetivo = elegirObjetivo(enemigos);

        //Si es distinto de null realiza el ataque
        if (objetivo!=null){
            atacante.atacarPersonaje(objetivo);
        }
    }

    private void realizarCura(ICurador curador, ArrayList<Personaje> aliados) throws JuegoExcepcion{
        System.out.println("¿A quién quiere curar?: ");
        Personaje objetivo = elegirObjetivo(aliados);

        //Si es distinto de null realiza curación
        if (objetivo!=null){
            curador.curarPersonaje(objetivo);
        }
    }

    private void realizarRecargaMago(Soldado soldado, ArrayList<Personaje> aliados){
        System.out.println("¿A que Mago quieres recargar?");
        //Filtramos solo los magos
        ArrayList<Personaje> magos = new ArrayList<>();
        for (Personaje mago : aliados){
            //Si es un mago y está vivo se añade a la lista
            if (mago instanceof Mago && mago.isVivo()){
                magos.add(mago);
            }
        }

        if (magos.isEmpty()){
            System.out.println("No hay magos vivos en tu equipo");
            return;
        }

        //Elegimos mago de la lista creada
        Personaje  elegido =  elegirPersonaje(magos);
        if (elegido != null){
            soldado.recargarMago((Mago) elegido); //Recarga al mago seleccionado
        }
    }

    //Métodos auxiliares de selección de personaje.
    private Personaje elegirPersonaje(ArrayList<Personaje> listaPersonajes){

        System.out.println("Elige un personaje vivo: ");

        ArrayList<Personaje> personajesVivos = new ArrayList<>(); //Lista para personajes vivos
        int contador = 1;

        for (Personaje personaje : listaPersonajes){

            //Personajes vivos se agregan a la lista
            if (personaje.isVivo()){
                System.out.println(contador + ". " + personaje.getNombre() + " - Puntos Vida: " + personaje.getVida());
                personajesVivos.add(personaje);
                contador++;
            }

        }

        //Comprobamos que la lista no esté vacía
        if (personajesVivos.isEmpty()){
            return null;
        }

        System.out.println("Opción: ");
        int indice = Integer.parseInt(scanner.nextLine()) - 1; //¿Qué hace esto?

        if (indice >= 0 && indice < personajesVivos.size()){
            return personajesVivos.get(indice);
        }else {
            System.out.println("Opción no válida. Turno perdido");
            return null;
        }
    }

    private Personaje elegirObjetivo(ArrayList<Personaje> lista){
        //Elegimos de la lista de personajes
        return elegirPersonaje(lista);
    }

    //Reglas para la VICTORIA
    private boolean equipoDerrotado(ArrayList<Personaje> equipo){
        //Cuando todos los personajes tienen vida <= 0
        return equipo.stream().
                noneMatch(Personaje::isVivo); //Comprobamos que nadie está vivo.
    }

    private void equipoGanador(){
        System.out.println(" ¡FIN DE LA PARTIDA!");
        if (equipoDerrotado(equipoA)){
            System.out.println("EL EQUIPO B HA GANADO");
        }else {
            System.out.println("EL EQUIPO A HA GANADO");
        }
    }
}
