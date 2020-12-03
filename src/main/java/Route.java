public class Route {

    private final int id;
    private final String agencyId;
    private final String shortName;
    private final String longName;
    private final int type;
    private final String transportType;
    private final boolean isCircular;
    private final boolean isUrban;
    private final boolean isNight;

    public Route(int id, String agencyId, String shortName, String longName, int type, String transportType,
                 boolean isCircular, boolean isUrban, boolean isNight) {
        this.id = id;
        this.agencyId = agencyId;
        this.shortName = shortName;
        this.longName = longName;
        this.type = type;
        this.transportType = transportType;
        this.isCircular = isCircular;
        this.isUrban = isUrban;
        this.isNight = isNight;
    }

    public int getId() {
        return id;
    }

    public String getAgencyId() {
        return agencyId;
    }

    public String getShortName() {
        return shortName;
    }

    public String getLongName() {
        return longName;
    }

    public int getType() {
        return type;
    }

    public String getTransportType() {
        return transportType;
    }

    public boolean isCircular() {
        return isCircular;
    }

    public boolean isUrban() {
        return isUrban;
    }

    public boolean isNight() {
        return isNight;
    }

    @Override
    public String toString() {
        return "Route{" + System.lineSeparator() +
                "\tid=" + id + System.lineSeparator() +
                "\tagencyId='" + agencyId + '\'' + System.lineSeparator() +
                "\tshortName='" + shortName + '\'' + System.lineSeparator() +
                "\tlongName='" + longName + '\'' + System.lineSeparator() +
                "\ttype=" + type + System.lineSeparator() +
                "\ttransportType='" + transportType + '\'' + System.lineSeparator() +
                "\tisCircular=" + isCircular + System.lineSeparator() +
                "\tisUrban=" + isUrban + System.lineSeparator() +
                "\tisNight=" + isNight + System.lineSeparator() +
                '}';
    }
}
