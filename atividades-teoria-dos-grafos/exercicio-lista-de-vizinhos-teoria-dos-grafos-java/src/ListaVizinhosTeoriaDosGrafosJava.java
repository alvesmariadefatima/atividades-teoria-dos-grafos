import java.util.ArrayList;

public class ListaVizinhosTeoriaDosGrafosJava {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer>[] arraylistelementos = new ArrayList[7];
        
        for(int i = 0; i < 7; i++){
           arraylistelementos[i] = new ArrayList<Integer>();
        } 
         
        arraylistelementos[0].add(1);
        arraylistelementos[1].add(0);
        arraylistelementos[0].add(2);
        arraylistelementos[2].add(0);
        arraylistelementos[0].add(3);
        arraylistelementos[3].add(0);
        arraylistelementos[0].add(4);
        arraylistelementos[4].add(0);
        arraylistelementos[0].add(5);
        arraylistelementos[5].add(0);
        arraylistelementos[1].add(3);
        arraylistelementos[3].add(1);
        arraylistelementos[1].add(5);
        arraylistelementos[5].add(1);
        arraylistelementos[2].add(4);
        arraylistelementos[4].add(2);
        arraylistelementos[3].add(5);
        arraylistelementos[5].add(3);

        System.out.println(arraylistelementos);
    }
}
