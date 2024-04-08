package company;

public class Department {
    
    // フィールド
    private final String name; // 部署名
    private final String department; // 部署ID
    private int budget; // 部署の予算
    
    //コンストラクタ
    public Department(String name, String department, int budget) {
        this.name = name;
        this.department = department;
        this.budget = budget;
    }
    
    
    // meetingメソッド
    public void meeting() {
        System.out.println("部内会議を開催します。部署：" + name + "予算：" + budget);
    }
    
    
    
    
    // **** getter, setter **** //
    public String getName() {
        return name;
    }
    
    public double getBudget() {
        return budget;
    }
    
    public void setBudget(int budget) {
        if (budget < 0) {
            throw new IllegalArgumentException("予算はマイナスになりません");
        }
        this.budget = budget;
    }
}