package module02JavaAdvance.day11.demo03FileUpload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        while (true){
            Socket socket = serverSocket.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {

                        File file = new File("src/module02JavaAdvance/day11/demo03FileUpload/Upload/");

                        if (!file.exists()){
                            file.mkdir();
                        }

                        String fileName = "kala"+System.currentTimeMillis()+new Random().nextInt(999)+".txt";

                        FileOutputStream fos = new FileOutputStream("src/module02JavaAdvance/day11/demo03FileUpload/Upload/"+fileName);
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
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();
        }
//        serverSocket.close();
    }
}
