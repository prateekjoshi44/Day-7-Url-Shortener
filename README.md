# Day-7-Url-Shortener

The URLService class handles the URL shortening functionality. It maintains a map called urlMap to store the mapping of original URLs to their corresponding shortened URLs. It also defines constants for the allowed characters in the shortened URL and the desired length of the code.

The generateURL method takes an original URL as input and generates a shortened URL. If the urlMap already contains the original URL, the corresponding shortened URL is retrieved from the map and returned. Otherwise, a new shortened URL is generated using the generateShortURL method, stored in the urlMap, and returned.

The generateShortURL method generates a random code of the specified length (SHORT_URL_LENGTH) using the characters defined in ALLOWED_CHARACTERS.

The RandomURL class is the main class that interacts with the URLService. It creates an instance of URLService, prompts the user to enter a URL, and trims any leading or trailing whitespace from the input.

The generateURL method of URLService is called to obtain the shortened URL for the given original URL, and it is then printed to the console.
