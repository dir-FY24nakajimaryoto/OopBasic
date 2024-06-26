package company;

// 抽象クラス
public abstract class Employee implements Workable{
    
    // フィールド
    protected String name; // 名前
    protected final Department department; //　部署(private->protected：抽象クラスのフィールドのため他クラスからのアクセスを可能に)
    private final String position; // 役職
    private final int employeeId; // 社員ID
    public int test = 0;
    
    // コンストラクタ
    public Employee(String name, Department department, String position, int employeeId) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }
    
    // 報告メソッド
    public void report(int times) {
        System.out.println(times + "回目の報告をします. 役職:" + position + ", 名前:" + name);
    }
    
    // 報告メソッド（オーバーロード）
    public void report() {
        // 他のクラスからインスタンス化したこのクラスのこのメソッドを最初に呼び出す（１回目の報告になる）
        report(1); // 上で定義した報告メソッドを自身のクラスから呼び出す
    }
    
    
    // ---- 抽象メソッドに変更 ---- //
    // 会議参加メソッド
    public abstract void joinMeeting();
    
//    public void joinMeeting() {
//        department.meeting();
//        System.out.println("->上記の会議に参加します. 部署：" + department.getName() + "名前：" + name);
//    }
    
    // 労働メソッド
    @Override
    public void work() {
        System.out.println("正社員として働きます。名前：" + name + slogan);
    }
    

}
