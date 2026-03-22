import java.util.HashMap;
import java.util.Map;

public class payload {

	public static Map<String, Object> AddBody()
	{
		
		String query =  "query  { continents {\r\n"
				+ "    code\r\n"
				+ "    name\r\n"
				+ "  }\r\n"
				+ "  \r\n"
				+ "  \r\n"
				+ "  countries {\r\n"
				+ "    name\r\n"
				+ "    code\r\n"
				+ "    capital\r\n"
				+ "    emoji\r\n"
				+ "  }"
				+ "}";
		Map<String, Object> body = new HashMap<>();
		body.put("query", query);
		return body;
	}
}