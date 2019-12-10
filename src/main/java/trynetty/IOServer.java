package trynetty;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * IOServer
 *
 * @author Lee
 * @date 2019/10/27
 */
public class IOServer {

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9889);
        // accept new msg
        new Thread(()->{
            while (true) {
                try {
                    Socket socket = serverSocket.accept();

                    // each new connect needs new thread;
                    new Thread(()->{
                        try {
                            int len;
                            byte[] data = new byte[1024];
                            InputStream inputStream = socket.getInputStream();
                            while ((len = inputStream.read(data)) != -1) {
                                System.out.println(new String(data,0,len));
                            }
                        } catch (IOException ioe) {

                        }

                    }).start();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }).start();
    }
}
