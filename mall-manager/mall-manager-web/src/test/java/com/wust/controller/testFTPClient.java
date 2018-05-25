package com.wust.controller;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class testFTPClient {

	//@Test
	public void testFTPClient() throws Exception {

		//创建一个FtpClient对象
		FTPClient ftpClient = new FTPClient();
		//创建ftp连接
		ftpClient.connect("192.168.25.200",21);
		//登陆ftp服务器
		ftpClient.login("ftpuser", "ftpuser");

		//上传文件
		//读取本地文件
		FileInputStream inputStream = new FileInputStream(new File("D:\\Documents\\Pictures\\pics\\21.jpg"));
		//修改文件上传格式
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		//存储图片 第一个参数是文件服务器文件名 第二个参数是上传文件的inputStream
		ftpClient.storeFile("123.jpg", inputStream);
		//关闭文件流
		inputStream.close();
		//关闭连接
		ftpClient.logout();
	}

}
