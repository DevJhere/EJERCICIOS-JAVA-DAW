package controller;

import model.Persona;

public interface IGestionHospital {
    // CRUD básico
    void eliminarPersona(int id);
    void registrarPersona(Persona persona);
    void listarTodo();
    void listarPorTipo(Class<?> tipo);
    void buscarPorNombre(String nombre);

}
