package PR1.day1.tut01;

public class Act8 {
    public static void main(String[] args) {
        //Bài toán bảo chúng ta giải phương trình dựa theo công thức đã cho//
//        ax + by = e      x = (ed-bf)/(ad-bc)
//        cx + dy = f      y = (af-ec)/(ad-bc)
//        3.4x + 50.2y = 44.5
//        2.1x + 55y = 5.9
//      Để ý kiểu dữ liệu trong bài này. Trong bài này không dùng số tự nhiên
//      mà dùng số thực nên chúng ta sẽ dùng 'double' thay cho 'int'
        double x = ((44.5*55)-(50.2*5.9))/((3.4*55)-(50.2*2.1));
        double y = ((3.4*5.9)-(44.5*2.1))/((3.4*55)-(50.2*2.1));

        System.out.println("x: " + x);
        System.out.println("y:" + y);


    }
}
