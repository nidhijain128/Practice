public class MergeSorted {
    public static int[] Merge(int a[], int b[]) {
        int i=a.length-1;
        while(a[i]==0)
            i--;
        int j = b.length-1;
        int k = a.length-1;
        while(i!=-1 && j!=-1) {
        if(a[i]>=b[j]) {
            a[k] = a[i];
            k--;i--;}
        else {
            a[k] = b[j];
            j--;k--;
        }
        }
        if(i==-1)
            while(j!=-1)
                {a[k] = b[j];j--;}
        else if(j==-1)
        while(i!=-1)
                {a[k] =a[i];i--;}
        return a;
                }
        
        public static void main(String s[]){
            int a[] = new int[10];
            a[0] = 1; a[1] = 3;a[2] = 6;a[3] = 8;a[4] = 11;
            int b[] = {2,5,7,10,15};
            a = Merge(a,b);
            for(int i=0;i<10;i++)
                System.out.println(a[i]);
                }
                }