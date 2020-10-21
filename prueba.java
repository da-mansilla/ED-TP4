public class prueba{
    public static void main(String[] args){
        SimpleLinkedList<Integer> lista = new SimpleLinkedList<Integer>();
        int number = 0;
        do{
           System.out.println("Ingrese un Numero"); 
           number = Helper.inputNumber();
           lista.addFirst(number);
        }while(number != 0);
        System.out.println("Lista: " + lista.toString());
        do{
           System.out.println("Ingrese un Numero"); 
           number = Helper.inputNumber();
           lista.addLast(number);
        }while(number != 0);
        System.out.println("Lista: " + lista.toString());
    }
        
}
