public class Day10 {
    private int year;
    private int month;
    private int date;

    public String toString(){
        return year + "年" + month + "月" + date + "日";
    }

    public Day10(int year, int month, int date) throws InvalidDayException{
        if (year < 1 || year > 3000){
            throw new InvalidDayException("年の範囲を超えました");
        }
        if (month < 1 || month > 12){
            throw new InvalidDayException("月の範囲を超えました");
        }
        if (date < 1 || date > 31){
            throw new InvalidDayException("日の範囲を超えました");
        }
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public Day10(int year, int month) throws InvalidDayException{
        this(year, month, 1);
    }
}
