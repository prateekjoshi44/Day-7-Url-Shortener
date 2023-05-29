import java.util.*;

class URLService {
    private static final String ALLOWED_CHARACTERS = "abcdefg012345";
    private static final int SHORT_URL_LENGTH = 6;
    private Map<String, String> urlMap = new HashMap<>();
    private Random random = new Random();

    public String generateURL(String originalUrl) {
        if (urlMap.containsKey(originalUrl)) {
            return urlMap.get(originalUrl);
        } else {
            String shortUrl = generateShortURL();
            urlMap.put(originalUrl, shortUrl);
            return shortUrl;
        }
    }

    private String generateShortURL() {
        StringBuilder sb = new StringBuilder(SHORT_URL_LENGTH);
        for (int i = 0; i < SHORT_URL_LENGTH; i++) {
            int randomIndex = random.nextInt(ALLOWED_CHARACTERS.length());
            sb.append(ALLOWED_CHARACTERS.charAt(randomIndex));
        }
        return sb.toString();
    }
}

public class RandomURL {
    public static void main(String[] args) {
        URLService service = new URLService();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String originalUrl = scanner.nextLine().trim();

        String shortUrl = service.generateURL(originalUrl);
        System.out.println("Shortened URL: " +"https://" + shortUrl);
    }
}
