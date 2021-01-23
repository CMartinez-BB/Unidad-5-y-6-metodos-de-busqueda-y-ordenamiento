package sample.Estructura;

import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.ComboBox;

import java.util.Objects;

public class Agenda {
    SimpleStringProperty profesor;
    SimpleStringProperty materia;
    SimpleStringProperty prioridad;
    SimpleStringProperty telefono;
    SimpleStringProperty dirección;
    SimpleStringProperty tarea;

 public Agenda(String profesor, String materia1, String prio, String telefono1, String dirección1, String tarea1){
     this.profesor=new SimpleStringProperty(profesor);
     this.materia=new SimpleStringProperty(materia1);
     this.prioridad=new SimpleStringProperty(prio);
     this.telefono=new SimpleStringProperty(telefono1);
     this.dirección=new SimpleStringProperty(dirección1);
     this.tarea=new SimpleStringProperty(tarea1);
 }

    public String getProfesor() {
        return profesor.get();
    }

    public SimpleStringProperty profesorProperty() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor.set(profesor);
    }

    public String getMateria() {
        return materia.get();
    }

    public SimpleStringProperty materiaProperty() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia.set(materia);
    }

    public String getPrioridad() {
        return prioridad.get();
    }

    public SimpleStringProperty prioridadProperty() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad.set(prioridad);
    }

    public String getTelefono() {
        return telefono.get();
    }

    public SimpleStringProperty telefonoProperty() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono.set(telefono);
    }

    public String getDirección() {
        return dirección.get();
    }

    public SimpleStringProperty direcciónProperty() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección.set(dirección);
    }

    public String getTarea() {
        return tarea.get();
    }

    public SimpleStringProperty tareaProperty() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea.set(tarea);
    }
    //Equals para no meter la misma tarea

}
