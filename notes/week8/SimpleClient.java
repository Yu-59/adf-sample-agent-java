package week8;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) {
        String host = "localhost";
        int port = 27931;

        // 使用 try-with-resources 自动关闭 Socket
        try (Socket socket = new Socket(host, port)) {
            System.out.println("成功连接到服务器: " + host + ":" + port);

            // 发送一条消息
            String message = "Hello, I am a simple Agent!";
            OutputStream output = socket.getOutputStream();
            output.write(message.getBytes());
            output.flush();

            System.out.println("消息发送成功: " + message);

        } catch (IOException e) {
            System.err.println("连接失败！如果是因为服务器没启动，就会看到这个报错：");
            e.printStackTrace();
        }
        System.out.println("客户端执行完毕，关闭连接。");
    }
}