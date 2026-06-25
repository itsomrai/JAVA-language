public class breakContinue {
    public static void main(String[] args) {
        int i=0;
        while(true){

            if(i==3){
                i=i+1;//SKIPPING 3 IN THE LOOP
                continue;
            }
            System.out.println(i);
            i++;
            if(i>5){
                break;
            }
        }
    }
}
 