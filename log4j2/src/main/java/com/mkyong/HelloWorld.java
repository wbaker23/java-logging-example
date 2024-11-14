package com.mkyong;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Random;

public class HelloWorld {
    private static final Logger logger = LogManager.getLogger(HelloWorld.class);
    private static final Random random = new Random();

    public static void main(String[] args) {
        while (true) {
            logger.debug("Testing {}", () -> getRandomNumber());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static int getRandomNumber() {
        int randomInt = random.nextInt(1000);
        return randomInt;
    }
}
