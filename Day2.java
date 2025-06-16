public class Day2 {
    int year;
    int month;
    int date;

    String formatDay(){
        return year + "年" + month + "月" + date + "日";
    }

    Day2(int y, int m, int d){
        year = y;
        month = m;
        date = d;
    }
}
