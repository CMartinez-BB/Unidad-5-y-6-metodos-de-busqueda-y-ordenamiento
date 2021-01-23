package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.Estructura.Agenda;
import sample.Estructura.Busqueda_Implementos;
import sample.Estructura.ListaNotas;

import java.lang.management.ManagementFactory;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.Scanner;

public class ControllerNotas {
    //Texfield
    @FXML TextField profesor, materia, telefono, dirección, tarea,nombreArchivo, txtOrden;

    //Tabla columnas
    TableColumn Columnanombre=new TableColumn("Profesor");
    TableColumn Columnamatera1=new TableColumn("Materia");
    TableColumn Columnaprioridad1=new TableColumn("Prioridad");
    TableColumn Columnatelefono1=new TableColumn("Telefono");
    TableColumn Columnadireccion1=new TableColumn("Dirección");
    TableColumn Columnatarea1=new TableColumn("Tarea");
    ObservableList<Agenda> listaagenda= FXCollections.observableArrayList();
    //cola para meter save data
    Queue<ListaNotas>cola=new LinkedList<>();
    //Combobox
@FXML ComboBox ComboPrioridad;

//table
    @FXML TableView table;
//Lista enlazada
    LinkedList<Integer> prioridad=new LinkedList<>();
    //Implementacion del metodo burbuja
    int[] ordenamiento=new int[6];

    //label
    @FXML Label ornerdar;
    @FXML Label txtUsuario;



    //Items del combobox-lista enlazada
@FXML protected void initialize(){
    txtUsuario.setText(Main.DatosUsuarios);
    //AÑADIR DATOS A LA TABLA
    this.Columnanombre.setCellValueFactory(new PropertyValueFactory<Agenda,String>("profesor"));
    this.Columnamatera1.setCellValueFactory(new PropertyValueFactory<Agenda,String>("materia"));
    this.Columnaprioridad1.setCellValueFactory(new PropertyValueFactory<Agenda,String>("prioridad"));
    this.Columnatelefono1.setCellValueFactory(new PropertyValueFactory<Agenda,String>("telefono"));
    this.Columnadireccion1.setCellValueFactory(new PropertyValueFactory<Agenda,String>("dirección"));
    this.Columnatarea1.setCellValueFactory(new PropertyValueFactory<Agenda,String>("tarea"));
    table.setItems(listaagenda);
    //añadir columnas
    table.getColumns().addAll(Columnanombre,Columnamatera1,Columnaprioridad1,Columnatelefono1,Columnadireccion1,Columnatarea1);
    //añadir items en combobox
    prioridad.add(1);
    prioridad.add(2);
    prioridad.add(3);
    prioridad.add(4);
    prioridad.add(5);
    //iterar la lista
    for (int x=0;x<prioridad.size();x++)ComboPrioridad.getItems().add(prioridad.get(x));
}
public void guardar(ActionEvent event){
    String cprioridad=ComboPrioridad.getSelectionModel().getSelectedItem().toString();
    String txtprofe=profesor.getText();
    String txtmateria=materia.getText();
    String txttelefono=telefono.getText();
    String txtdireccion=dirección.getText();
    String txttarea=tarea.getText();
    listaagenda.add(new Agenda(txtprofe,txtmateria,cprioridad,txttelefono,txtdireccion,txttarea));

}
public void guard(ActionEvent event){
String [][]items=new String[listaagenda.size()][6];
for (int x=0;x<items.length;x++){
    items[x][0]=listaagenda.get(x).getProfesor();
    items[x][1]=listaagenda.get(x).getMateria();
    items[x][2]=listaagenda.get(x).getPrioridad();
    items[x][3]=listaagenda.get(x).getTelefono();
    items[x][4]=listaagenda.get(x).getDirección();
    items[x][5]=listaagenda.get(x).getTarea();
}
ListaNotas nota1=new ListaNotas(items,nombreArchivo.getText());
cola.add(nota1);
listaagenda.clear();
nombreArchivo.setText("");
}
//iniciando metodo burbuja
int cont=0;
public void smile(ActionEvent event){
ordenamiento[cont]=Integer.parseInt(txtOrden.getText().toString());
    System.out.println(txtOrden.getText());
cont++;
}
public void organizar(ActionEvent event){
    Busqueda_Implementos ordenar=new Busqueda_Implementos();
    int[] ordenado=ordenar.burbuja(ordenamiento);
    String todo="";
    for (int x=0;x<ordenado.length;x++) todo=todo +", "+ordenado[x];
    ornerdar.setText(todo);
}
public void QuickShort(ActionEvent event){
Busqueda_Implementos ordenacion=new Busqueda_Implementos();
int[]preorden=ordenacion.Directa(ordenamiento);
String todos="";
    for (int x=0;x<preorden.length;x++) todos=todos +", "+preorden[x];
    ornerdar.setText(todos);

}

    public void mostrar() {
    ListaNotas nota1=cola.poll();
    nombreArchivo.setText(nota1.getNombreArchivo());
    String [][]pedido=nota1.getDatos();
    for(int x=0;x<pedido.length;x++){
        System.out.print(pedido[x][0]);
        System.out.print(pedido[x][1]);
        System.out.print(pedido[x][2]);
        System.out.print(pedido[x][3]);
        System.out.print(pedido[x][4]);
        System.out.print(pedido[x][5]);
        System.out.print(pedido[x][6]);
        System.out.println();
    }


    }
}
