/**
 * split
 */
public class split {

    public static void main(String[] args) {
        
    }
    public static String[] solution(String s) {


        int length = s.length();
        String[] f = new String[length / 2 + length % 2];

        if (length%2==0){
            for(int i=0; i<length/2;i++){
                f[i] =  s.substring(i * 2, i * 2 + 2);
            }

        }else{
            for (int i = 0; i < length / 2 + 1; i++) {
                if (i == length / 2) {
                    f[i] = s.substring(i * 2) + "_";
                } else {
                    f[i] = s.substring(i * 2, i * 2 + 2);
                }
            }

        }
       
       
       
        return f;
    }
}