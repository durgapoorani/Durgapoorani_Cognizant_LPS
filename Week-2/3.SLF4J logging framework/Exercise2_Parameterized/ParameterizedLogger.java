import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLogger {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLogger.class);

    public static void main(String[] args) {
        String user = "Durga";
        int items = 5;
        logger.info("User {} purchased {} items", user, items);
    }
}
