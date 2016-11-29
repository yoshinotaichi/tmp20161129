import java.io.*;

public class CopyByteFile {
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
			int d;
			while((d = in.read()) != -1){
				out.write(d);
			}

			System.out.println("コピー終わり");

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

