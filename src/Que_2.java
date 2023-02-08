public class Que_2 {
    static StringBuilder reverse(String s){
        StringBuilder ans=new StringBuilder();
        for (int i=s.length()-1;i>=0;i--) {
            ans.append(s.charAt(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        String s= new String("PWSKILLS");
        System.out.println("Input :" + s);

        StringBuilder ans=reverse(s);
        System.out.println("Output :" + ans);
    }
}
