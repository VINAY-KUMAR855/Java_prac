import java.util.LinkedList;
class Linkedlist_collections{
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.addLast(20);
        list.addFirst(0);
        System.out.println(list.size());
        System.out.println("List: " + list);
        System.out.println(list.get(0));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        list.remove();
        list.removeLast();
        System.out.println(list);
    }
}