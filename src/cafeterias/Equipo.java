package cafeterias;

public class Equipo {
    private String tipo;
    private String estado;

    public Equipo(String tipo, String estado) {
        this.tipo = tipo;
        this.estado = estado;
    }

    public void encender() {
        System.out.println("Encendiendo equipo: " + tipo);
    }

    public void apagar() {
        System.out.println("Apagando equipo: " + tipo);
    }

    public void reparar() {
        System.out.println("Reparando equipo: " + tipo);
    }
}

