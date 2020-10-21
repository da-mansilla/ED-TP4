import java.util.Iterator;
public class SimpleLinkedList<ELEMENT> implements ILinkedList<ELEMENT>{

    // Class Node
    private class Node<ELEMENT> {
        public ELEMENT item;
        public Node<ELEMENT> next;

        public Node(){
            this(null,null);
        }
        public Node(ELEMENT item){
            this(item,null);
        }
        public Node(ELEMENT item, Node<ELEMENT> next){
            this.item = item;
            this.next = next;
        }

        @Override
        public String toString(){
            return this.item.toString();
        }
    }

    protected Node<ELEMENT> head;
    protected int count;
    protected Node<ELEMENT> tail;

    public SimpleLinkedList(){
        this.head = null;
        this.count = 0;
        this.tail = null;
    }

    // Devuelve la cantidad de items en la lista
    public int size(){
        return this.count;
    }
    // Agrega un elemento al inicio de la lista
    // VERSION NOVATOS
    public void addFirstRookieVersion(ELEMENT item){
       if(this.count == 0){
            this.head = this.tail = new Node<ELEMENT> (item, null);
            ++this.count;
       } else{
           Node<ELEMENT> temp = new Node<ELEMENT>(item, this.head);
           temp.next = this.head;
           this.head = temp;
           ++this.count;

       }
    }


    // Agrega un elemento al inicio de la lista
    public void addFirst(ELEMENT item){
        Node<ELEMENT> temp = new Node<ELEMENT>(item, this.head);
        if(this.count == 0){
            this.tail = temp;
        }
        this.head = temp;
        ++this.count;
        
    }

    // Agrega un elemento al final de la lista
    // VERSION NOVATOS
    public void addLastRookieVersion(ELEMENT item){
        if(this.count == 0){
            this.head = this.tail = new Node(item,null);
        }else{
            Node<ELEMENT> temp = new Node<ELEMENT>(item,null);
            this.tail.next = temp;
            this.tail = temp;
            ++this.count;
        }
    }


    // Agrega un elemento al final de la lista
    public void addLast(ELEMENT item){
        Node<ELEMENT> temp = new Node<ELEMENT> (item, null);
        if(this.count == 0){
            this.head = temp;
        }else{
            this.tail.next = temp;
        }
        this.tail = temp;
        ++this.count;
    }

    // Remueve y devuelve el primer elemento de la Lista
    public ELEMENT removeFirst(){
        if(this.count == 0){
            throw new RuntimeException("La Lista esta Vacia");
        }
        ELEMENT item = this.head.item;
        this.head = this.head.next;
        if(this.head == null){
            this.tail =  null;
        }
        --this.count;
        return item; 
    }

    // Remueve y devuelve el ultimo elemento de la lista
    public ELEMENT removeLast(){
        if(this.count == 0){
            throw new RuntimeException("La lista esta Vacia");
        }
        ELEMENT item = this.tail.item;
        if(this.head.next == null){
            this.head = this.tail = null;
        } else {
            Node<ELEMENT> skip = this.head;
            while(skip.next.next != null){
                skip = skip.next;
            }
            this.tail = skip;
            this.tail.next = null;
        }
        --this.count;
        return item;
    }
    public ELEMENT getFirst(){
        return this.head.item;
    }
    public ELEMENT getLast(){
        return this.tail.item;
    }


    @Override
    public String toString() { 
        if (this.size() <=0) {
            return "";
        } 
        StringBuilder sb = new StringBuilder();
 
        sb.append("[" + this.head.item.toString());
        for (Node<ELEMENT> skip = this.head.next; skip != null; skip = skip.next) {
            sb.append(", " + skip.item.toString());
        }
        sb.append("]");
 
        return sb.toString();
    }

    @Override
    public Iterator<ELEMENT> iterator() {
        return new SimpleLinkedListIterator(this.head);
    }
 
    private class SimpleLinkedListIterator implements Iterator<ELEMENT> {
        private Node<ELEMENT> current;
 
        public SimpleLinkedListIterator(Node<ELEMENT> current) {
            this.current = current;
        }
 
        @Override
        public boolean hasNext() {
            return this.current != null;
        }
 
        @Override
        public ELEMENT next() {
            if (!this.hasNext()) {
                throw new RuntimeException("La lista está vacía...");
            }
            ELEMENT item = this.current.item;
            this.current = this.current.next;
            return item;
        }
 
    }

}























