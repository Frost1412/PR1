package PR1.day1.tut01;

public class Act7 {
    public static void main(String[] args) {
        int population = 312032486;//Dân số hiện tại//
        int secondsofayear = 365*24*60*60;//Đoạn này để tính số giây có trong 1 năm//


        //Giờ sẽ tính những thông số có trong 1 năm//
        int birthinayear = secondsofayear / 7;
        int deattinayear = secondsofayear / 13;
        int immiinayear = secondsofayear / 45;

        //Giờ sẽ tính số dân số thay đổi trong 1 năm//
        int populationchange = birthinayear - deattinayear + immiinayear;

        //Vì các bạn chưa học vòng loop nên đoạn này mình phải viết code lặp lại khá dài//
        //Năm thứ 1//
        int popuyear1 = population + populationchange;
        System.out.println("Year 1 have: " + popuyear1 +" people");
        //Năm thứ 2//
        int popuyear2 = popuyear1 + populationchange;
        System.out.println("Year 2 have: " + popuyear2 +" people");
        //Năm thứ 3//
        int popuyear3 = popuyear2 + populationchange;
        System.out.println("Year 3 have " + popuyear3 +" people");
        //Năm thứ 4//
        int popuyear4 = popuyear3 + populationchange;
        System.out.println("Year 4 have: " + popuyear4 +" people");
        //Năm thứ 5//
        int popuyear5 = popuyear4 + populationchange;
        System.out.println("Year 5 have: " + popuyear5 +" people");


    }
}
