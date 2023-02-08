public class Que_3 {
    static String reverse(String s){
        String ans ="";
        s=s.toLowerCase();
        String[] arr=s.split(" ");
        for (int i=0;i< arr.length;i++){
            for (int j=arr[i].length()-1;j>=0;j--){
                ans+=arr[i].charAt(j);
            }
            ans+=" ";
        }
        return ans;
    }
    public static void main(String[] args) {
        String s="Think Twice";
        System.out.println("Input :"+ s);
        s=reverse(s);
        System.out.println("Output :"+ s);
    }
}

