package company;

public class ObjectSample {

    public static void main(String[] args) {
        // インスタンスの作成
        var salesDepartment = new Department("営業部", "xx", 1000000);
        
        Employee sales = new Sales("鈴木", salesDepartment, "課長", 100);
//        var employee = new Employee("鈴木", department, "課長", 100);
        
        
        // メソッドの呼び出し
//        String aaaa = sales.report(); // オーバーロードしたメソッドの呼び出し
        sales.report(2); // 回数報告のメソッド呼び出し
        sales.joinMeeting();
//        System.out.println("public test before: " + employee.test);
//        employee.test = 10;
//        System.out.println("public test after: " + employee.test);
        // ↓これはprivate修飾師付きなのでエラーになる
        //        employee.position = "コンサルタント";
        
        
        // 空行
        System.out.println("");
        
        
        // インスタンスの作成
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Engineer("田中", devDepartment, "一般社員", 88, "Java");
        
        // インスタンスメソッドの呼びだし
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();
        
        System.out.println("");
        
        // ----追記（Lesson4, 2.5）---- //
        // ポリモーフィズムの確認
        // Engineerをインスタンス化したEmployee型のprojectMaangerを定義
        Employee projectManager = new Engineer("佐藤", devDepartment, 
                "PM", 99, "Java");
        int pm = 1;
        
        // メソッドの呼び出し
        projectManager.report();
        projectManager.joinMeeting();
//        projectManager.developSoftware(); // Employee型なのでメソッドが未定義扱い
        // projectManagerがEngineerクラスと一致するかの確認
        if (projectManager instanceof Engineer) {
            // developSoftwareを呼び出し
            // Employee型のprojectManagerをEngineer型にキャスト
            // - Employee型ではdevelopSoftwareメソッドが定義されていないため呼び出せない
            ((Engineer) projectManager).developSoftware();
        }
        
        
        // 改行
        System.out.println("");
        
        // アルバイトインスタンスの作成
        var parttimeWorker = new ParttimeWorker("太田", salesDepartment);
        
        // メソッドの呼び出し
        ((Workable) sales).work(); // 鈴木
        ((Workable) engineer).work(); // 田中
        ((Workable) projectManager).work(); // 佐藤
        ((Workable) parttimeWorker).work(); // 太田
    }

}
