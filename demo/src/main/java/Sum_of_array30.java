public class Sum_of_array30 {

    public static void main(String[] args) {
        int arry[] = {10,20,30,40,10,10};
        int sum = 0;
        boolean result = false;
        for( int i=0;i<arry.length;i++){
            if (arry[i] == 10){
                sum = sum + arry[i];
            }
        }
        if(sum == 30){
             result = true;
        }
        System.out.println(result);
    }
    
}
