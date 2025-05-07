
public class problem1 {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        int max=100;
        while(true) {
            if(i>max){
                break;
            }
            sum+=i++;

        }
        System.out.println(sum);
    }
}
