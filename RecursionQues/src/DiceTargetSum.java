import java.util.ArrayList;
import java.util.List;

public class DiceTargetSum {

    public static void main(String[] args) {
        List<String> ans = diceRet("",4);
        System.out.println(ans);
    }

    static void dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i<=6 && i<=target;i++){
            dice(p+i,target-i);
        }
    }

    static List<String> diceRet(String p,int target){
        List<String> l = new ArrayList<>();

        if(target==0){
            l.add(p);
            return l;
        }

        for(int i = 1; i<=6 && i<=target;i++){
            l.addAll(diceRet(p+i,target-i));
            }
        return l;
    }

}
