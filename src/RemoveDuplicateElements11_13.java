import java.util.*;

public class RemoveDuplicateElements11_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0;i < 10;++i){
            a.add(input.nextInt());
        }
        System.out.print("The distinct integers are ");
        removeDuplicate(a);
    }
    public static void removeDuplicate(ArrayList<Integer> b){
        Set<Integer> setlist = new HashSet<Integer>();
        for(int i = 0;i < 10;++i){
            int s = b.get(i);
            if(!setlist.contains(s)){
                System.out.print(s + " ");
                setlist.add(s);
            }
        }
    }
}