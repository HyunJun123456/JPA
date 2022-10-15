package Java2;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class ServerExample2 {
	ExecutorService executorService;
	
	ServerSocket serverSocket;
	
	List<Client> Connections = new Vector<Client>();
	
	
	
	
	void startServer() {
		//서버 시작 코드
		executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors());
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
		} catch (Exception e) {
			if(!serverSocket.isClosed()) {
				stopServer();
				return;
			}
			
			Runnable runnable = new Runnable() {
				
				@Override
				public void run() {
					
				}
			};
			
			{
				
			}
			
			
			
		}
		
		
		
	}
	void stopServer() {
		//서버 종료 코드
		
	}
	
	
	class Client{// 데이터 통신 코드
		
		}
	}

