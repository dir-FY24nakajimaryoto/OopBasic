package company;

public class ObjectSample {

    public static void main(String[] args) {
        // インスタンスの作成
        var department = new Department("営業部", "xx", 1000000);
        var employee = new Employee("鈴木", department, "課長", 100);
        
        // メソッドの呼び出し
        employee.report(); // オーバーロードしたメソッドの呼び出し
        employee.report(2); // 回数報告のメソッド呼び出し
        employee.joinMeeting();
        System.out.println("public test before: " + employee.test);
        employee.test = 10;
        System.out.println("public test after: " + employee.test);
        // ↓これはprivate修飾師付きなのでエラーになる
        //        employee.position = "コンサルタント";
        
        // 空行
        System.out.println("");
        
        // インスタンスの作成
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Employee("田中", devDepartment, "一般社員", 88);
        
        // インスタンスメソッドの呼びだし
        engineer.report();
        engineer.joinMeeting();
    }

}
