import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
        System.out.println(subSeqAL("","abc"));
    }

    static void subSeq(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+",");
            return;
        }

        char ch = up.charAt(0);
        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));
    }


    static ArrayList<String> subSeq(String p,String up,ArrayList<String> list ){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        subSeq(p+ch,up.substring(1),list);
        subSeq(p,up.substring(1),list);

        return list;
    }

    static ArrayList<String> subSeqAL(String p,String up){
        ArrayList<String> list = new ArrayList<>();

        if(up.isEmpty()){
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeqAL(p+ch,up.substring(1));
        ArrayList<String> right = subSeqAL(p,up.substring(1));

        left.addAll(right);
        return left;
    }
}

