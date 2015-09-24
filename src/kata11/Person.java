package kata11;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

    public final String name;
    public final String surname;
    public final Calendar birth;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000 * 60 * 60 * 24 * 365.25);

    public Person(String name, String surname, Calendar birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Calendar getBirth() {
        return birth;
    }

    public String getFullName() {
        return (name + " " + surname);
    }

    public int getAge() {
        Calendar today;
        today = GregorianCalendar.getInstance();
        return (int) milliseconds(today.getTimeInMillis() - birth.getTimeInMillis());
    }

    private long milliseconds(long millis) {
        return millis / MILLISECONDS_PER_YEAR;
    }
}
