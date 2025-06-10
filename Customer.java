public class Customer {
    private int id;
    private String name;

    public void setData(String name) {
        this.id = 0; // 指定しない場合は0
        this.name = name;
    }

    public void setData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void showData() {
        System.out.println(id + " : " + name);
    }
}