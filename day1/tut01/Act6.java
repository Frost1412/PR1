package PR1.day1.tut01;

public class Act6 {
    public static void main(String[] args) {
//       Cho 34932s, tính số giây, số giờ và số phút
    int h = 34932/60/60 ;
    int m = 34932/60%60 ;
    int s = 343932%60 ;
        System.out.println(h+ "h " + m + "m " + s+ "s " );

    }
}
//5 giờ 10 phút 2 giây
//Gợi ý: 1 giờ 60 phút, 1 phút 60s
// 3,15 phút => 3. Còn phần .15 sẽ chia cho 60 để lấy phần dư là số phút còn lại
