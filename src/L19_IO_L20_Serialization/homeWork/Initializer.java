package L19_IO_L20_Serialization.homeWork;

import java.util.Random;

public interface Initializer {
	int getFileSize();

	byte[] getPart();

	String getFilePath();
	enum Unit {
		BYTE(1), K_BYTE(1024), M_BYTE(1024 * 1024);
		Random rand = new Random();
		private int size;

		Unit(int size) {
			this.size = size;
		}
		public byte[] getPart(){
			byte[] part = new byte[size];
			rand.nextBytes(part);
			return part;
		}
	}

}
