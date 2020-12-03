import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class RoutesParser {

    private final Charset charset;

    public RoutesParser(Charset charset) {
        this.charset = charset;
    }

    public RoutesParser() {
        this(StandardCharsets.UTF_8);
    }

    public List<Route> parse(Path path) throws IOException {
        final List<Route> result = new ArrayList<>();

        // Use try-with-resources construction to guarantee that all files and readers
        // will be closed even in case if any error occur
        try (CSVReader reader = new CSVReader(new FileReader(path.toFile(), charset))) {
            // Skip the header line
            reader.readNext();

            // Iterate through the lines
            for (String[] data : reader) {

                // Explicitly extract data from line
                final int routeId = Integer.parseInt(data[0]);
                final String agencyId = data[1];
                final String shortName = data[2];
                final String longName = data[3];
                final int routeType = Integer.parseInt(data[4]);
                final String transportType = data[5];
                final boolean isCircular = Integer.parseInt(data[6]) == 1;
                final boolean isUrban = Integer.parseInt(data[7]) == 1;
                final boolean isNight = Integer.parseInt(data[8]) == 1;

                // Create Route with specified parameters and add it to result list
                result.add(new Route(routeId, agencyId, shortName, longName, routeType, transportType,
                        isCircular, isUrban, isNight));
            }
        }
        return result;
    }
}
