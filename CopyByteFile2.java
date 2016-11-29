import java.io.*;

public class CopyByteFile2 {
	public static void main(String[] args) {
		// 1. 変数・データを準備する
		FileInputStream in = null;
		FileOutputStream out = null;

		// 2. ストリーム処理
		//   1byteずつ、読んで、書く
		try {
			// ストリームをつくる
			in = new FileInputStream("Jellyfish.jpg");
			out = new FileOutputStream("kekka.jpg");

			// データを読み書きする
			int i = 0;					// カウント変数
			int d;
			while((d = in.read()) != -1){
				out.write(d);
				System.out.println(d);
				i++;
			}

			System.out.println("done.");
			System.out.println("i: " + i);

		} catch(IOException e) {
			System.out.println("IOエラーです。");

		} finally {
			// ストリームを閉じる
			try {
				in.close();
				out.close();

			} catch (IOException e) {
				System.out.println("IOエラーです。");
			}
		}
	}
}	

