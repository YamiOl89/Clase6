package pkglist;

import java.io.PipedOutputStream;
import java.nio.file.StandardWatchEventKinds;
import java.util.ArrayList;


import java.util.ArrayList;
import java. util.List;
import java.util.Scanner;


public class ArrayListSample<ClsTasklist> {

 public void ejemplon() {
     List<String>taskList = new ArrayList<>();

   taskList.add("Sacar al perro") ;
   taskList.add("ir de compras ");
   taskList.add(" hacer la cama ");
   taskList.add("ir a votar");
   System.out.println(taskList);
   
   
   //String primerElemento = taskList.get(0);
   //System.out.println("primer elemento ="  + primerElemto);

    // System.out.println("elimine "  + primerElemto);
     
     for (String item : taskList){
         System.out.println("tarea: "+ item);
         
     }
 }


    public void Ejemplo1() {
    }
    public void ejercicio1 () {
        Scanner sc = new Scanner(System.in);
        List<Integer> ListaEnteros = new ArrayList<>();
        System.out.println("Ingrese un n umero");
        int num= ((Scanner) sc).nextInt();
        ListaEnteros.add(1000);
        ListaEnteros.add(2000);
        ListaEnteros.add(3000);
        ListaEnteros.add(4000);
        int suma =0;
        for(int n : ListaEnteros){

            suma= suma +n;
            System.out.println ("el total es "+ suma);
        }
        public void ListaTareas(){
            List<ClsTasklist> tl = new ArrayList<>();


            ClsTaskList  tarea = new ClsTaskList();

            tarea.setTaskName("ir a votar");
            tarea.setTaskDescripcion("Escuela, mesa 5");
            tarea.setDone(false);
            tl.add((ClsTasklist) tarea);




            tarea.setTaskName("sacar al chucho");
            tarea.setTaskDescripcion("llevar a firulais al parque ");
            tarea.setDone(false);
            tl.add((ClsTasklist) tarea);



            tarea.setTaskName("hacer la cama");
            tarea.setTaskDescripcion("mi mama o mujer me regaña");
            tarea.setDone(false);
            tl.add((ClsTasklist) tarea);
            tarea =new ClsTaskList();


            for (ClsTasklist item : tl ){
                System.out.println("Tarea"+ item.getClass());

            }
        }
 }
    public void ListaTareas() {
    }
}
