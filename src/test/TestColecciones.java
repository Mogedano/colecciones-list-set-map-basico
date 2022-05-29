
package test;

import java.util.*;

public class TestColecciones {
    public static void main(String[] args) {
        
        //******SECCIÓN DE LISTA******
        
        //A la izq del = creamos un tipo de la Interface List. 
        //A la dcha del = creamos un objeto que implemente la Interface List, para ello usamos la clase ArraList
        //La clase ArrayList es la que implementa la interface de List
        List miLista = new ArrayList(); 
        
        //Usamos el tipo miLista y agregamos un nuevo objeto. Podemos agregar cualquier tipo de objeto, cualquier tipo object de Java
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        
        //Imprimimos la Lista. Iteramos la Lista con un bucle for-each
        //Entre () indicamos una variable que va a almacenar cada uno de los elementos que hemos agregado a nuestra lista, 
        //como en este caso la lista tiene elementos de tipo Object entonces el elemento que vamos a recuperar también es de 
        //tipo Object, le ponemos nombre (en este caso elemento) añadimos dos puntos e indicamos el nombre de la lista.
        for(Object elemento: miLista ){
            System.out.println("elemento List for-each= " + elemento);
        } 
        
        //A partir de la versión 8 en Java podemos utilizar el concepto de lambdas o funciones flecha. 
        //Elemento es la variable que hemos definido para que reciba cada uno de los valores de la lista. Da igual cómo 
        //la nombremos y no hay que especificarle el tipo, va a detectar automáticamente el tipo de la Lista  
        miLista.forEach(elementoFlecha -> {
            System.out.println("elemento List Flecha = " + elementoFlecha);
        }); 
        
        //Llamanos al método del polimorfismo
        imprimir(miLista);
        
        
        
        
        //******SECCIÓN DE SET******
        //A la izq del = tenemos una variable llamada miSet de tipo SET, a la dcha la clase HashSet
        //que implementa esta Interface, hay varias clases pero esta es la más común.
        Set miSet = new HashSet(); 
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes"); //Este elemento repetido SET no lo mostrará, List sí.
        
        //for-each
        for(Object elementoSet1: miSet){
            System.out.println("elemento Set for-each = " + elementoSet1);
        }
        
        //for-each lambda 
        miSet.forEach(elementoSet2 -> {
            System.out.println("elemento Set Flecha = " + elementoSet2);
        });        
        
        imprimir(miSet);
        
        
        
        //******SECCIÓN DE MAP******
        //Tipo Map, variable miMapa, una de las clases que implementa esta interface es la clase HashMap, así que
        //creamos un nuevo objeto de esta clase 
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        
        //Accedemos a los elementos de un mapa
        String elemento = (String) miMapa.get("valor1");  //El método get regresa un tipo Object y hay que convertirlo a String
        System.out.println("elemento Mapa recuperando un elemento = " + elemento);
        
        //Si queremos recuperar todas las llaves del mapa usamos el método keySet, no garantiza el orden en que fueron agregados los elementos
        //Regresa un Set, no un Mapa, y solo va a devolvernos las llaves, podemos utilizar el método de imprimir que teníamso para el Set anterior
        imprimir(miMapa.keySet());
        
        //Si queremos imprimir solo valores
        imprimir(miMapa.values());             
        
        //Los métodos keySet() y values(), de la clase hashMap, ambos retornan un tipo de dato de la clase Set
        
        //Imprimimos la key y el valor
        miMapa.forEach((key, value) -> System.out.println(key + " : " + value));
        
        //Podemos imprimir llaves o imprimir valores sin necesidad de ciclo for-each
        System.out.println("Obtener todos las llaves"+miMapa.keySet());
        System.out.println("Obtener todos los valores"+miMapa.values());
    }
    
    //Vamos a crear un métoro de imprimir más genérico en el que vamos a aplicar polimorfismo y vamos a mandar 
    //a imprimir los elementos de una colección, ya sea de tipo List o de tipo Set.
    //Lo que va a recibir es el tipo más genérico que es la Interface de Collection y la variable se llama coleccion
    public static void imprimir(Collection coleccion){
        //Iteramos cada uno de sus elementos, podemos hacerlo con for-each o for-each lambda  
//        for(Object elementoColec: coleccion){
//            System.out.println("elementoColec = " + elementoColec);
//        }
        
        coleccion.forEach(elementoColec -> {
            System.out.println("elemento Colección = " + elementoColec);
        });
        
    }
    
    
}
