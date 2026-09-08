public class union {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr2={4,5,6,7};
        int l=arr.length;
        int m=arr2.length;
        int n=l+m;
        int x=0;
        int finalarr[]=new int[n];
        for(int i=0;i<l;i++){
            finalarr[x]=arr[i];
            x++;
            }
            for(int i=0;i<m;i++){
                finalarr[x]=arr2[i];
                x++;
            }
            System.out.println("The merged array is");
            for(int i=0;i<n;i++){
                System.out.print(finalarr[i]+" ");
            }
        }

    }
