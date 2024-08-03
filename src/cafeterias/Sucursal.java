package cafeterias;

import java.util.ArrayList;
import java.util.List;

public class Sucursal<Equipo, Empleado> {
    private String nombre;
    private String direccion;
    private List<Object> empleados;
    private List<Ingrediente> ingredientes;
    private List<Equipo> equipos;
    private List<Cafe> especialidades;

    public Sucursal(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.empleados = new ArrayList<>().reversed();
        this.ingredientes = new ArrayList<>();
        this.equipos = new ArrayList<>();
        this.especialidades = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    public void agregarEspecialidad(Cafe cafe) {
        especialidades.add(cafe);
    }
}

