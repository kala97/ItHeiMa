package module02JavaAdvance.day11.demo04BSTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        while (true){
            Socket socket = serverSocket.accept();
            InputStream is = socket.getInputStream();
//        int len = 0;
//        byte[] bytes = new byte[1024];
//        while ((len = is.read(bytes)) != -1) {
//            System.out.println(new String(bytes,0,len));
//        }
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line = br.readLine();
            String[] split = line.split(" ");
            String htmlpath = split[1].substring(9);
            FileInputStream fis = new FileInputStream(htmlpath);
            OutputStream os = socket.getOutputStream();
            int len = 0;
            byte[] bytes = new byte[1024];
            // 写入HTTP协议响应头,固定写法
            os.write("HTTP/1.1 200 OK\r\n".getBytes());
            os.write("Content-Type:text/html\r\n".getBytes());
            // 必须要写入空行,否则浏览器不解析
            os.write("\r\n".getBytes());
            while ((len = fis.read(bytes))!=-1){
                os.write(bytes,0,len);
            }
            fis.close();
            socket.close();
        }
//        serverSocket.close();
    }
}
