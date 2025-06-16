public class Customer2 {
    private int id;
    private String name;

    // デフォルトコンストラクタ
    public Customer2() {
        this.id = 0;
        this.name = "";
    }

    // 名前だけを指定するコンストラクタ
    public Customer2(String name) {
        this.id = 0;
        this.name = name;
    }

    // IDと名前を指定するコンストラクタ
    public Customer2(int id, String name) {
        if (id == -1) {
            this.id = 0;
        } else {
            this.id = id;
        }
        this.name = name;
    }

    // idのゲッター
    public int getId() {
        return id;
    }

    // nameのゲッター
    public String getName() {
        return name;
    }

    // idのセッター
    public void setId(int id) {
        if (id == -1) {
            this.id = 0;
        } else {
            this.id = id;
        }
    }

    // nameのセッター
    public void setName(String name) {
        this.name = name;
    }

    // 情報表示メソッド
    public void showData() {
        System.out.println(id +":" + name);
        }
}