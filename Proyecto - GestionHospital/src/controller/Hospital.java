package controller;

import model.Persona;

import java.util.HashMap;

public class Hospital implements IGestionHospital {
    HashMap<Integer, Persona> listaPersonas;

    //Inicializamos HasMap
    public Hospital() {
        listaPersonas = new HashMap<>();
    }

    @Override
    public void eliminarPersona(int id) {
        listaPersonas.remove(id);
    }

    //Funcionalidades
    @Override
    public void registrarPersona(Persona persona) {
        if (listaPersonas.containsKey(persona.getId())){
            System.out.println("Error. No se pudo agregar esta persona");
            return; //Paramos ejecución del metodo.
        }
        listaPersonas.put(persona.getId(), persona);
        System.out.println("Persona registrada correctamente");
    }

    @Override
    public void listarTodo() {
        listaPersonas.values().forEach(Persona::mostrarFicha);
    }

    @Override
    public void listarPorTipo(Class<?> tipo) {
        listaPersonas.values().stream()
                .filter(persona -> persona.getClass().equals(tipo))
                .forEach(Persona::mostrarFicha);
    }

    @Override
    public void buscarPorNombre(String nombre) {
        System.out.println("--- Buscando a: " + nombre + " ---");

        // 1. Recolectamos en una lista temporal
        var encontrados = listaPersonas.values().stream()
                .filter(p -> p.getNombre().equalsIgnoreCase(nombre))
                .toList(); // En Java 16+ se usa .toList(), si usas Java antiguo usa .collect(Collectors.toList())

        // 2. Comprobamos
        if (encontrados.isEmpty()) {
            System.out.println("❌ No se ha encontrado a nadie con ese nombre.");
        } else {
            encontrados.forEach(Persona::mostrarFicha);
        }
    }



}
