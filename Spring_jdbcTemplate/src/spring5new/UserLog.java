package spring5new;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author zhazhahui
 * @create 2021-07-25 11:10
 */
public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        log.info("hello log4j2 info");
        log.warn("hello log4j2 warn");
    }
}
