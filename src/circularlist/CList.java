/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularlist;

/**
 *
 * @author Angelica
 * @param <T>
 */
public class CList <T> {
    
    
    Node pointer;
    int length;
    Node pivot;
    
    
    //constructor
    CList() {  
    length = 0;
    pivot = null;
    }
    
    CList (T d) {
    Node node = new Node(d);
    pointer = node.next = node;
    }
    
    //EstáVacía
    public boolean isEmpty () {   //para preguntar si está vacío // ¿Está vacío?
    return length == 0; //No hace falta poner el last porque con que first sea null con eso basta.
    }
    
    //insertar
    public void insert (T d){ //insertar
    Node node = new Node(d);
    if (isEmpty()){ 
    pivot = node.next =node; }
    else {
    node.next=pivot.next;
    pivot.next = node;}
    length++; 
    }    
    
    //Eliminar Nodo
    public void delete (T d){ //eliminar
    Node node = new Node(d);
    if (isEmpty()){ 
    pointer = pivot;
    for(int i=1; i<length; i++) {
    if(pointer.next.data==d){
    pointer.next=pointer.next.next;
    if(pivot.data==d)
    pivot=pointer; }
    length--;
    pointer =null;
    i = length + 1; }
    pointer = pointer.next; }
    }  
    
    // muestra la lista
    public void showList() {
    Node pointer;
    pointer = pivot;
    if (isEmpty()) {
    System.out.println("La lista está vacía");
    } else {
    do {
    pointer = pointer.next;
    } while (pointer.next != pivot); }
    }

}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     



     
    


