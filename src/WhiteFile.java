import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WhiteFile {
    public static void main(String[] args) throws IOException {
        var message = """
                test
                message
                """;
        var p = Path.of("test.txt");
        Files.writeString(p, message);
    }
}
