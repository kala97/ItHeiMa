package module02JavaAdvance.day11.demo02FileUpload;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        FileOutputStream fos = new FileOutputStream("src/module02JavaAdvance/day11/demo02FileUpload/Upload/test.txt");
        InputStream is = socket.getInputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = is.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        OutputStream os = socket.getOutputStream();
        os.write("上传成功".getBytes());
        socket.close();
        serverSocket.close();
    }
}
