import java.time.*;
import java.util.*;

public class JoinedAt {
    public Date getJoinedat() {
        return joinedat;
    }

    public void setJoinedat(Date joinedat) {
        this.joinedat = joinedat;
    }

    public MonthDay getWhen() {
        return when;
    }

    public void setWhen(MonthDay when) {
        this.when = when;
    }

    public Date joinedat;
    public MonthDay when;
}
