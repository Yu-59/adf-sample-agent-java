package notes.week6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfig {
    public static void main(String[] args) {
        String filePath = "config/module.cfg";
        Properties properties = new Properties();

        System.out.println("=== 开始读取配置文件 ===");

        // 核心：try-catch 处理异常
        try (InputStream input = new FileInputStream(filePath)) {
            properties.load(input);
            System.out.println("配置文件读取并解析成功！");

            System.out.println("--- 解析出的配置项 ---");
            for (String key : properties.stringPropertyNames()) {
                String value = properties.getProperty(key);
                System.out.println(key + " = " + value);
            }

        } catch (IOException e) {
            System.err.println("ERROR: 读取配置文件失败！请检查 config/module.cfg 是否存在。");
            e.printStackTrace();
        }

        System.out.println("=== 程序执行结束 ===");
    }
}