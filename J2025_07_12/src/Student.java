public class Student {

    /* ---------- 成员变量 ---------- */
    private String name;   // 实例变量（每个对象各有一份）
    private int id;        // 实例变量（每个对象各有一份）

    /* ---------- 静态变量 ---------- */
    public static String schoolName = "哈佛大学";
    // 静态变量（属于类本身，所有对象共享）

    /* ---------- 构造方法 ---------- */
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }


    /* ---------- 实例方法 ---------- */
    public void showInfo() {
        // 结论2：非静态(实例)方法内部可以直接调用静态成员
        // 这里既访问了实例变量(name、id)，也访问了静态变量(schoolName)
        System.out.println("姓名：" + name + ", 学号：" + id + ", 学校：" + schoolName);

        // 也可以直接调用静态方法
        printSchool();   // 合法：实例方法里调静态方法
    }


    /* ---------- 静态方法 ---------- */
    public static void printSchool() {
        // 结论1：静态方法内部不能直接调用非静态方法
        // showInfo();
        // ❌ 编译错误：无法从 static 上下文引用非静态方法

        // 结论3：静态方法内部不能直接访问非静态成员变量
        // System.out.println(name);
        // ❌ 编译错误：无法从 static 上下文引用非静态变量

        // 结论4：静态方法内部不能使用 this
        // System.out.println(this.name);
        // ❌ 编译错误：无法从 static 上下文引用 this

        // 如果一定要在静态方法里用实例变量，必须显式给出对象
        Student stu = new Student("胖猫", 04);
        System.out.println("在静态方法里通过对象访问 name：" + stu.name);

        // 静态方法里可以随意访问静态成员
        System.out.println("学校：" + schoolName);
    }

}


