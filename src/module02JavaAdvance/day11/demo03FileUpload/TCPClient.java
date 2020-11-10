package module02JavaAdvance.day11.demo03FileUpload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        FileInputStream fis = new FileInputStream("src/module02JavaAdvance/day11/demo02FileUpload/a.txt");
        OutputStream os = socket.getOutputStream();

        byte[] bytes = new byte[1024];
        int len = 0;

        while ((len = fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();

        fis.close();

        System.out.println("文件发送完毕");

        InputStream is = socket.getInputStream();
        len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        socket.close();
    }
}
