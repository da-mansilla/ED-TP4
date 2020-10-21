public interface ILinkedList<ELEMENT> extends Iterable<ELEMENT> {
   
    // Devuelve el numero de elementos en la lista
    public int size();

    // Inserta un elemento al principio de la lista
    public void addFirst(ELEMENT item);
 
    // Inserta un elemento al final de la lista
    public void addLast(ELEMENT item);


    // Remueve y devuelve el primer elemento de la lista
    public ELEMENT removeFirst();

    // Remueve y devuelve el ultimo elemento de la lista
    public ELEMENT removeLast();
}
