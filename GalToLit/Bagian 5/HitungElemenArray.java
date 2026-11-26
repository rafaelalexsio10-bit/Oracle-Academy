public class HitungElemenArray {
    public static void main(String[] args) {
        int[][] num = { {7, 8, 9}, {4, 5, 6}, {1, 2, 3} };
        
        int hasil = num[0][2] + num[1][1] - num[2][0];
        
        System.out.println(hasil);
    }
}