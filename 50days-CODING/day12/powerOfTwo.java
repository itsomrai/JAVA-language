public class powerOfTwo {
  public static void main(String[] args) {
    int n=16;
    for(int i=0;i<31;i++){
        int ans=(int) Math.pow(2, i);
        if(ans==n){
            System.out.println("true");
            return;
        }
    }
            System.out.println("false");
            return;
        }
    }

