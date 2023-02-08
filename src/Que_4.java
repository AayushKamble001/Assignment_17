import java.util.Arrays;

public class Que_4 {
    static String sortAlphabetically(String s){
        String ans=" ";
        s=s.replace(" ","");
        s=s.toLowerCase();
        char []arr=s.toCharArray();
        Arrays.sort(arr);
        for (int i=0;i< arr.length;i++){
            ans+=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        String s= "Twice";
        System.out.println("Input :"+s);
        s=sortAlphabetically(s);
        System.out.println("Output :"+s);
    }
}
