import java.util.LinkedList;
import java.util.Queue;

/**
 * Interleaving_Of_2Queue
 */
public class Interleaving_Of_2Queue {

    public static Queue interLeave(Queue<Integer> q){
        int size = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();
        for(int i=0;i<size/2;i++){
            firstHalf.add(q.remove());
        }

        while (!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }
        return q;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove()+" ");
        }
    }
}