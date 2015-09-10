package java.io.examples;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
	public static void main(String[] args) throws IOException {
		//randomAccessFileRead();
		randomAccessFileWrite();
	}

	public static void randomAccessFileRead() throws IOException {
		// 创建一个RandomAccessFile对象
		RandomAccessFile file = new RandomAccessFile("d:/test.txt", "rw");
		// 通过seek方法来移动读写位置的指针
		file.seek(10);
		// 获取当前指针
		long pointerBegin = file.getFilePointer();
		// 从当前指针开始读
		byte[] contents = new byte[1024];
		file.read(contents);
		long pointerEnd = file.getFilePointer();
		System.out.println("pointerBegin:" + pointerBegin + "\n" + "pointerEnd:" + pointerEnd + "\n" + new String(contents));
		file.close();
	}

	public static void randomAccessFileWrite() throws IOException {
		// 创建一个RandomAccessFile对象
		RandomAccessFile file = new RandomAccessFile("d:/test.txt", "rw");
		// 通过seek方法来移动读写位置的指针
		file.seek(10);
		// 获取当前指针
		long pointerBegin = file.getFilePointer();
		// 从当前指针位置开始写
		file.write("HELLO WORD".getBytes());
		long pointerEnd = file.getFilePointer();
		System.out.println("pointerBegin:" + pointerBegin + "\n" + "pointerEnd:" + pointerEnd + "\n");
		file.close();
	}

}
