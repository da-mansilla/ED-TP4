
public class QueueLinkedList<ELEMENT> {

    private SimpleLinkedList<ELEMENT> list = new SimpleLinkedList<ELEMENT>();

    public QueueLinkedList(){
    }

        

    public boolean isEmpty(){
        return this.list.size()<= 0;
    }
    public int size(){
        return this.list.size();
    }

    /*private int next(int pos){
        if(++pos >= this.data.length){
            pos = 0;
        }
        return pos;
    }
    */


    // Inserta un elemento en la Cola si es posible
    // Devuelve False en el caso de que la cantidad de elementos sobrepase
    // el tamaño del array interno
    public boolean offer(ELEMENT element){
        this.list.addFirst(element);
        return true;
    }
    // Inserta un elemento en la Cola si es posible
    // Devuelve False en el caso de que la cantidad de elementos sobrepase
    // el tamaño del array interno
    public boolean add(ELEMENT element){
        this.list.addFirst(element);
        return true;
    }



    // Devuelve pero no elimina la el elemento en la salida de la Cola.
    // Devuelve una Exception en el caso de que esté vacia
    public ELEMENT element(){
        if(this.list.head == null){
            throw new IllegalStateException("Cola vacia...");
        }
        return list.getFirst();
    }
    // Devuelve pero no elimina el elemento en la salida de la Cola.
    // Devuelve False en el caso de que esté vacia
    public ELEMENT peek(){
        if(this.list.head == null){
            return null;
        }
        return list.getFirst();
    }


    // Devuelve y Elimina el elemento en la salida de la Cola
    // Devuelve null en el caso de que esté vacia
    public ELEMENT pool(){
        if(this.list.size() == 0){
            return null;
        }
        return list.removeLast();
    }

    // Devuelve y Elimina el elemento en la salida de la Cola
    // Devuelve una Excepcion en el caso de que esté vacia
    public ELEMENT remove(){
        if(this.list.size() == 0){
            throw new IllegalStateException("Cola vacia");
        }
        return list.removeLast();
    }

    @Override
    public String toString() { 
        return this.list.toString(); 
    }
   /* 
    public Object[] toArray() {
        Object[] result = new Object[this.count];
        for(int i = 0, pos = this.head, cta = this.size(); cta > 0; ++i, pos = this.next(pos), --cta) {
            result[i] = this.data[pos];
        }
        return result;
    }
    */
}
