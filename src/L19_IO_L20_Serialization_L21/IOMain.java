package L19_IO_L20_Serialization_L21;

import L08_Inheritance.Person;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class IOMain {
	public static void main(String[] args) {
//		Person person = new Person("Ivan");
//		Car car = new Car("BMW", 1985, person);
//		person.setCar(car);
//
//		saveCar(car);


		Car loadedCar = loadCar();

		System.out.println(loadedCar);


	}

	private static Car loadCar() {
		try (ObjectInputStream inputStream =
				     new ObjectInputStream(new FileInputStream("myFolder/car.dat"))) {
			return  (Car) inputStream.readObject();       ////implements serializeable
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	private static void saveCar(Car car) {
		try (ObjectOutputStream outputStream =
				     new ObjectOutputStream(new FileOutputStream("myFolder/car.dat"))) {
			outputStream.writeObject(car);      //implements serializeable
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void properties() {
		Properties properties = new Properties();
		try (FileInputStream fileInputStream = new FileInputStream("myFolder/settings")) {
			properties.load(fileInputStream);
			System.out.println(properties.getProperty("pass"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void objectWriting() {
		try (ObjectOutputStream outputStream =
				     new ObjectOutputStream(new FileOutputStream("myFolder/objects.dat"))) {
			int[] date = new int[]{15, 4, 2016};
			outputStream.writeObject(date);
		} catch (IOException e) {
			e.printStackTrace();
		}


		try (ObjectInputStream inputStream =
				     new ObjectInputStream(new FileInputStream("myFolder/objects.dat"))) {

			int[] date = (int[]) inputStream.readObject();


		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	private static void dataPrimitivesOutputStream() {
		try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("myFolder/myfile.dat"))) {

			dataOutputStream.writeInt(15);
			dataOutputStream.writeInt(4);
			dataOutputStream.writeInt(2016);
			dataOutputStream.writeLong(Long.MAX_VALUE);

		} catch (Exception e) {
			e.printStackTrace();
		}

		try (DataInputStream dataOutputStream = new DataInputStream(new FileInputStream("myFolder/myfile.dat"))) {

			System.out.println(dataOutputStream.readInt());
			System.out.println(dataOutputStream.readInt());
			System.out.println(dataOutputStream.readInt());
			System.out.println(dataOutputStream.readLong());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void bufferedReader() {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("myFolder/myfile.txt"), "windows-1251"))) {

			String value;
			while ((value = reader.readLine()) != null) {
				System.out.println(value);
			}


		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readWithCharset() {
		try (InputStreamReader reader = new InputStreamReader(new FileInputStream("myFolder/myfile.txt"), "windows-1251")) {

			int value;
			while ((value = reader.read()) != -1) {
				System.out.print((char) value);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void copyFile() {
		try (InputStream inputStream = new FileInputStream("myFolder/myfile.txt");
		     OutputStream outputStream = new FileOutputStream("myFolder/myfile_copy.txt")
		) {
			int byte1;
			while ((byte1 = inputStream.read()) != -1) {
				outputStream.write(byte1);
			}

			outputStream.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void tryWithResources() {
		try (InputStream inputStream = new FileInputStream("myFolder/myfile.txt")) {     //interface Closeable must be implenet
			int byte1;
			while ((byte1 = inputStream.read()) != -1) {
				System.out.print((char) byte1);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void inputStream() {
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream("myFolder/myfile.txt");

			int byte1;
			while ((byte1 = inputStream.read()) != -1) {
				System.out.print((char) byte1);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	private static void FileAndPathStuff() {
		System.out.println("c:\\temp\\myFile.txt");

		File file = new File("c:\\temp\\myFile.txt");


		File file1 = new File("/temp/myFile.txt");      //unix-style work`s to

		System.out.println(file.exists());      //под виндой нет регистрозависимости пути к файлу
		file.isDirectory();
		file.mkdir();
		file.mkdirs();

		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File file2 = new File("myFolder/myfile.txt");       //относительный путь
		System.out.println(file2.getAbsolutePath());


		Path relativePath = Paths.get("myFolder/myfile.txt");   //Path is immutable
		Path parent = relativePath.getParent();
		Path resolve = parent.resolve(relativePath);    //Join 2 relativePath`s parent + relativePath

		Path absolutePath = relativePath.toAbsolutePath();
		absolutePath.isAbsolute();

		try {
			Files.createDirectories(relativePath.getParent());
			Files.createFile(relativePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void someMethod(int... ints) {
		int i = ints[0];
		int i2 = ints[1];
	}
}
