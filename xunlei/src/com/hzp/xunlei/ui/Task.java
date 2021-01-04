package com.hzp.xunlei.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;

public class Task implements Runnable{
	private String uriPath;//下载地址
	private String savePath;//存放地址
	private String fileName;//文件名
	private Table table ;//表格
	private TableItem ti;//
	private ProgressBar bar ;//进度条
	private int totalSize = 0;//总大小
	private int size = 0 ;//已下载大小
	 
	volatile boolean pause = false;//是否暂停
	private String urlPath;
	 
	public Task(Table table, String savePath , String urlPath) {
		this.table = table;;
		this.savePath = savePath;
		this.urlPath = urlPath;
		this.fileName = urlPath.substring(urlPath.lastIndexOf("/")+1);//截取最后一截做文件名
	}

	@Override
	public void run() {
		Display.getDefault().asyncExec(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
			
		});
		
	}

}
