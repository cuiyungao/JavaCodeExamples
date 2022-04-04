package fileRW;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class example_files {
    public static void main(String[] args) throws IOException {
        // 定义一个目录路径的Path对象
        Path directoryPath = Paths.get("sample_files");
        // 根据Path对象创建多级目录
        Files.createDirectories(directoryPath);
        System.out.println("目录创建成功!");
        // 定义一个文件路径的Path对象
        Path filePath = Paths.get("sample_files/test.txt");
        // 根据Path对象创建一个文件
        Files.createFile(filePath);
        // 创建一个List集合，并向集合中添加内容
        List<String> list = new ArrayList<>();
        list.add("这是一个测试文件");
        // 将集合中的内容追加写入到指定的文件中
        Files.write(filePath, list, StandardOpenOption.APPEND);
        List<String> lines = Files.readAllLines(filePath);
        System.out.println("文件的大小为：" + Files.size(filePath));
        System.out.println("文件中的内容为：" + lines);
    }
}

