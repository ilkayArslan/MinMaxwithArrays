public class Main {
    public static void main(String[] args) {
        int[] arr = {15,12,788,1,-1,-778,2,0};

        int min ,max;
        int newSayi = 5;
        min = 999999999;
        max = -999999999;
        for (int i : arr){
            if (i<newSayi && i>max){
                max=i;
            }
            if (i>newSayi && i<min){
                min =i;
            }
        }
        System.out.println(max + " : En yakın Maximum Küçük Sayı");
        System.out.println(min + " : En yakın Minumum Büyük Sayı");

    }
}