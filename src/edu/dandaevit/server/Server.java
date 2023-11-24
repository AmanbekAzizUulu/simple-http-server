package edu.dandaevit.server;

import java.io.IOException;
import java.net.ServerSocket;


public class Server {
	private int port;
	private String directory;

	public Server (int port, String directory) {
		this.port = port;
		this.directory = directory;
	}

	public void start () {
		try (var server = new ServerSocket(this.port)) {
			while (true) {
				var socket = server.accept();
				var currentThread = new Handler(socket, this.directory);

				currentThread.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}



	public String getDirectory () {
		return directory;
	}

	public void setDirectory (String directory) {
		this.directory = directory;
	}

	public int getPort () {
		return port;
	}

	public void setPort (int port) {
		this.port = port;
	}
}
