package L19_IO_L20_Serialization.homeWork;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class FileGenerator {

	public static void writeFile(int size, byte[] part, String file) {
		try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file))) {
			for (int i = 0; i < size; i++) {
				bufferedOutputStream.write(part);
			}
			bufferedOutputStream.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Initializer _50KbyteInitializer = new Initializer() {
			@Override
			public int getFileSize() {
				return 50;
			}

			@Override
			public byte[] getPart() {
				return Unit.K_BYTE.getPart();
			}

			@Override
			public String getFilePath() {
				return "FGenOutput/theFile.dat";
			}
		};

		writeFile(_50KbyteInitializer.getFileSize(),
				  _50KbyteInitializer.getPart(),
				  _50KbyteInitializer.getFilePath()   );

	}

}
