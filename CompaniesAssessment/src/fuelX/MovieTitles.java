package fuelX;

import java.io.*;
import java.util.*;
import java.net.*;
//import com.google.gson.*;

public class MovieTitles {
    public static void main(String... args) throws Exception{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        String[] res;
        String _substr;
        try{
            _substr = in.nextLine();
        } catch (Exception e) {
            _substr = null;
        }

        res = getMovieTitles(_substr);
        for (int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
        in.close();
    }

    static String[] getMovieTitles(String substr) {
        String movieTitleUrl = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";
        List<String> movies = new ArrayList<>();
        /*try {
            movieTitleUrl = movieTitleUrl + substr;
            String response = getResponse(movieTitleUrl);
            JsonParser parser = new JsonParser();
            JsonElement root = parser.parse(response);

            JsonObject details = root.getAsJsonObject();

            JsonElement totalMovies = details.get("total");
            System.out.println(totalMovies.toString());

            JsonElement totalPages = details.get("total_pages");
            System.out.println(totalPages.toString());

            int currentPage = 0;
            while(currentPage++ < Integer.parseInt(totalPages.toString())) {
                getNextPage(movies, currentPage, substr);
            }

            Collections.sort(movies);
        } catch(Exception e) {
            e.printStackTrace();
        }*/

        String[] results = new String[movies.size()];

        return movies.toArray(results);
    }

    static void getNextPage(List<String> movies, int currentPge, String substr) throws Exception {
        String movieTitleUrl = "https://jsonmock.hackerrank.com/api/movies/search/?Title=";
        String response = getResponse(movieTitleUrl + substr + "&page=" + currentPge);

        /*JsonParser parser = new JsonParser();
        JsonElement root = parser.parse(response);

        JsonObject details = root.getAsJsonObject();
        JsonElement data = details.get("data");
        JsonArray jsonArray = data.getAsJsonArray();

        for(JsonElement eachElement : jsonArray) {
            JsonObject titleObject = eachElement.getAsJsonObject();
            String title = titleObject.get("Title").getAsString();
            movies.add(title);
        }*/
    }

    static String getResponse(String movieUrl) throws Exception {
        StringBuilder result = new StringBuilder();

        URL url = new URL(movieUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while((line = br.readLine()) != null) {
            result.append(line);
        }

        br.close();

        return result.toString();
    }
}
