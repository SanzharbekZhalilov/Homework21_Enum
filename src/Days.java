public enum Days {

    MONDAY("Дуйшомбу куну Java теория сабагын окуйм"),
    TUESDAY("Шейшемби куну Java практика сабагын окуйм"),
    WEDNESDAY("Шаршемби куну Java теория сабагын окуйм"),
    THURSDAY("Бейшемби куну Java практика сабагын окуйм"),
    FRIDAY("Жума куну Java теория сабагын окуйм"),
    SATURDAY("Ишмеби куну Java практика сабагын окуйм"),
    SUNDAY("Жекшемби куну эс алам");

    String str;

    Days(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return str;
    }
}
