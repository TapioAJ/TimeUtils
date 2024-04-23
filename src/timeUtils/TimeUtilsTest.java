package timeUtils;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class TimeUtilsTest {

    @ParameterizedTest
    @CsvSource({"-400, '-1'","0, '0:00:00'","3665, '1:01:05'","5, '0:00:05'","4000, '1:06:40'","3600, '1:00:00'", "86400, '-1'", "86399, '-1'" })
    void timeToSec(int timeInSec, String Expected) {
        String result = TimeUtils.secToTime(timeInSec);
        assert(result.equals(Expected));
    }
}