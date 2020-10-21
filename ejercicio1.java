public class ejercicio1{
   public static void main(String [] args){
        QueueLinkedList<Integer> Queue = new QueueLinkedList<Integer>();
        int number;
        do{
           System.out.println("Ingrese numeros en la cola"); 
           number = Helper.inputNumber();
           Queue.add(number);
        }while(number != 0);
        System.out.print("Cola ingresada: [");
        while(!Queue.isEmpty()){
           System.out.print(Queue.remove() + ", "); 
        }
        System.out.print("]");
   }
}
