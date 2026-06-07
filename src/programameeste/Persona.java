/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programameeste;


/**
 * Representa a una persona con atributos básicos como nombre, edad y un identificador único.
 * Proporciona métodos para gestionar sus datos y simular acciones cotidianas.
 * * @author mejon
 * @version 1.0
 */
public class Persona {

    // ==========================================
    // ATRIBUTOS (Variables de instancia)
    // ==========================================
    private String nombre;
    private int edad;
    private String dni;

    // ==========================================
    // CONSTRUCTORES
    // ==========================================

    /**
     * Constructor por defecto que crea una persona con valores iniciales vacíos o a cero.
     */
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.dni = "00000000X";
    }

    /**
     * Constructor con todos los parámetros para inicializar una persona con datos específicos.
     * * @param nombre El nombre completo de la persona.
     * @param edad La edad actual de la persona (debe ser un número positivo).
     * @param dni El Documento Nacional de Identidad de la persona.
     */
    public Persona(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }

    // ================================ ==========
    // MÉTODOS MÁGICOS / MÉTODOS PROPIOS
    // ==========================================

    /**
     * Simula la acción de que la persona se presenta a sí misma saludando.
     * Muestra un mensaje por la consola estándar.
     */
    public void saludar() {
        System.out.println("Hola, mi nombre es " + this.nombre + " y tengo " + this.edad + " años.");
    }

    /**
     * Comprueba si la persona es mayor de edad según la legislación estándar (18 años o más).
     * * @return true si la persona tiene 18 años o más; false en caso contrario.
     */
    public boolean esMayorDeEdad() {
        return this.edad >= 18;
    }

    /**
     * Simula el paso del tiempo haciendo que la persona cumpla un año más.
     * Incrementa el atributo edad en una unidad.
     */
    public void cumplirAnios() {
        this.edad++;
        System.out.println("¡Felicidades " + this.nombre + "! Ahora tienes " + this.edad + " años.");
    }

    // ==========================================
    // MÉTODOS GETTERS Y SETTERS
    // ==========================================

    /**
     * Obtiene el nombre de la persona.
     * * @return El nombre actual de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la persona.
     * * @param nombre El nuevo nombre que se le asignará a la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la edad de la persona.
     * * @return La edad actual de la persona en años.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Modifica la edad de la persona. 
     * Realiza una pequeña validación para evitar edades negativas.
     * * @param edad La nueva edad a asignar (debe ser igual o mayor que 0).
     */
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }
    }

    /**
     * Obtiene el DNI de la persona.
     * * @return El DNI de la persona.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Modifica el DNI de la persona.
     * * @param dni El nuevo DNI que se asociará a la persona.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }
}