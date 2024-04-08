package company;

public class Engineer extends Employee {
    // フィールド
    String programingLanguage;
    
    
    // コンストラクタ
    // 親クラスであるEmployeeクラスを継承している
    public Engineer(String name, Department department, String position,
            int employeeId, String programmingLanguage) {
        super(name, department, position, employeeId); // 継承元のクラスのコンストラクタ呼び出し
        
        this.programingLanguage = programmingLanguage;
    }
    
    // 開発メソッド
    public void developSoftware() {
        System.out.println("ソフトウェアを開発します。名前：" + name + 
                ", プログラミング言語：" + programingLanguage);
    }
    
    
    // 会議に参加するメソッドをオーバーライド
    @Override
    public void joinMeeting() {
        department.meeting(); // 抽象メソッドのmeetingを呼び出す
//        super.joinMeeting();
        System.out.println("->技術的な準備を行い、上記の会議に参加します。名前：" + name);
    }

}
