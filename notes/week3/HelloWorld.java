package notes.week3;

public class HelloWorld {
    public static void main(String[] args) {
        // 2. 声明 3 个不同类型的变量
        String name = "Limanqi";
        int age = 19;
        boolean isStudent = true;

        System.out.println("我的名字是：" + name);

        // 3. 一个 if-else 判断
        if (isStudent) {
            System.out.println("我现在是一名学生，年龄：" + age);
        } else {
            System.out.println("我已经不是学生了。");
        }

        // 4. 一个 for 循环（打印 1 到 5）
        System.out.print("用 for 循环打印：");
        for (int i = 1; i <= 5; i++) {
            System.out.print(" " + i);
        }
        System.out.println();

        // 5. 调用一个自定义方法
        printEndMessage();
    }

    // 自定义方法
    public static void printEndMessage() {
        System.out.println("作业 1 运行结束！Java 基础掌握成功！");
    }
}