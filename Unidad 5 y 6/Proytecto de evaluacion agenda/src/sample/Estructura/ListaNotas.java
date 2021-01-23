package sample.Estructura;

public class ListaNotas {
    String[][]datos;
    String nombreArchivo;

    public ListaNotas(String[][] datos, String nombreArchivo) {
        this.datos = datos;
        this.nombreArchivo = nombreArchivo;
    }

    public String[][] getDatos() {
        return datos;
    }

    public void setDatos(String[][] datos) {
        this.datos = datos;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
}

