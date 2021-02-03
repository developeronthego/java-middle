package middle.lesson22;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerUsage {

	public static void main(String[] args) throws IOException {
		Logger logger = Logger.getLogger(LoggerUsage.class.getName());
		logger.setLevel(Level.INFO);
		logger.log(Level.INFO, LoggerUsage.class.getName());
		
		if (logger.isLoggable(Level.INFO)) {
			logger.info(LoggerUsage.class.getSimpleName());
		}
		
		
		logger.severe("Hello world!");
		logger.warning("Hello world!");
		logger.info("Hello world!");
		logger.config("Hello world!");
		logger.fine("Hello world!");
		logger.finer("Hello world!");
		logger.finest("Hello world!");
		
		
		FileHandler handler = new FileHandler("myapp-log.txt");
		handler.setFormatter(new MyFormatter());
		logger.addHandler(handler);
		logger.info("Teraz logi trafia tez do pliku");
		
		Object object = null;
		
		try {
			object.toString();
		} catch(Exception e) {
			logger.log(Level.WARNING, e.getMessage(), e);
		}
		
	}

}
