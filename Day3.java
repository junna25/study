public class Day3 {
    int year;
    int month;
    int date;

    String formatDay(){
        return year + "年" + month + "月" + date + "日";
    }

    Day3(int y, int m, int d) {
        year = y;
        month = m;
        date = d;
 }  

    Day3(int y, int m){
        year = y;
        month = m;
        date = 1;
    }

}
