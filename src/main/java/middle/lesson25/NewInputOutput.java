package middle.lesson25;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NewInputOutput {

	public static void main(String[] args) throws IOException {
		String directory = "c:\\data\\";
		String file = "myfile.txt";
		createFile(directory, file);
		Path path = Paths.get(directory + file);
		readFile(path);
		fixedSizedBufferRead(path);
	}

	private static void fixedSizedBufferRead(Path path) throws IOException {
		try (RandomAccessFile accessFile = new RandomAccessFile(path.toFile().getAbsolutePath(), "r")) {
			FileChannel inChannel = accessFile.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			while (inChannel.read(buffer) > 0) {
				buffer.flip();
				for (int i = 0; i < buffer.limit(); i++) {
					System.out.print((char) buffer.get());
				}
				buffer.clear();
			}
		}
	}

	private static void readFile(Path filePath) throws IOException {
		try (BufferedReader bufferedReader = Files.newBufferedReader(filePath, UTF_8)) {
			String readLine;
			while ((readLine = bufferedReader.readLine()) != null) {
				System.out.println(readLine);
			}
		}
	}

	private static void createFile(String directory, String file) throws IOException {
		Path directoryPath = Paths.get(directory);
		if (!Files.exists(directoryPath)) {
			Files.createDirectories(directoryPath);
		}
		Path filePath = Paths.get(directory + file);
		Files.deleteIfExists(filePath);
		Files.createFile(filePath);
		writeFile(filePath);

		if (Files.isReadable(filePath)) {
			List<String> allLines = Files.readAllLines(filePath);
			for (String line : allLines) {
				System.out.println(line);
			}
		}
	}

	private static void writeFile(Path filePath) throws IOException {
		try (BufferedWriter bufferedWriter = Files.newBufferedWriter(filePath, UTF_8)) {
			bufferedWriter.write(filePath.toFile().getPath() + "\n");
			bufferedWriter.write(filePath.toFile().getName() + "\n");
		}
	}

}
