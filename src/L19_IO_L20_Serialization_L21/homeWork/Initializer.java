package L19_IO_L20_Serialization_L21.homeWork;

import java.util.Random;

public interface Initializer {
	enum Unit {
		BYTE(1), K_BYTE(1024), M_BYTE(1024 * 1024);
		private int size;
		Random rand = new Random();

		Unit(int size) {
			this.size = size;
		}
		public byte[] getPart(){
			byte[] part = new byte[size];
			rand.nextBytes(part);
			return part;
		}
	}

	int getFileSize();
	byte[] getPart();
	String getFilePath();

}
