public class Day5 {
    private int year;
    private int month;
    private int date;

    public Day5(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    } 

    public Day5(int year, int month){
        this(year, month, 1);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    
    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String formatDay() {
        return year + "年" + month + "月" + date + "日";
    }
}
