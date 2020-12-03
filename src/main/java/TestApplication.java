import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestApplication {
    public static void main(String[] args) throws IOException {

        // Create Parser
        final RoutesParser parser = new RoutesParser();

        // Define path to target file
        final Path routesPath = Paths.get("routes.txt");

        // Parse routes from file
        final List<Route> routes = parser.parse(routesPath);

        // Put routes to map to effectively search routes by their id
        final Map<Integer, Route> routeById = new HashMap<Integer, Route>();
        for (Route route : routes) {
            routeById.put(route.getId(), route);
        }

        // An alternative way to get the same mapping
//        final Map<Integer, Route> routeById = routes.stream()
//                .collect(Collectors.toMap(Route::getId, Function.identity()));

        // Print routes examples
        System.out.println("Show 5 first routes");
        for (Route route : routes.subList(0, 5)) {
            System.out.println(route);
        }
        System.out.println();

        // Find route by id
        final Route route = routeById.get(3850);
        System.out.println("Search result for id=3850");
        System.out.println(route);
    }
}
