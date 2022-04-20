package unit10;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Paths;
import java.util.Map;

public class BookmarksRecursion {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        String homePath = System.getProperty("user.home");
        System.out.println("homePath: " + homePath);

        // For OSX
        String bookmarksPath = homePath + "/Library/Application Support/Google/Chrome/Default/Bookmarks";
        System.out.println("bookmarksPath: " + bookmarksPath);

        ObjectMapper mapper = new ObjectMapper();

        Map<String, ?> bookmarksMap = mapper.readValue(Paths.get(bookmarksPath).toFile(), Map.class);
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(bookmarksMap));

        Map<String, ?> rootsMap = (Map<String, ?>) bookmarksMap.get("roots");
        
    }
}
