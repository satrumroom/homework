package com.ua.lemon.kapustnyk.enums;

public enum DayOfWeek {
    MONDAY("Понедельник", false),
    TUESDAY("Вторник", true),
    WEDNESDAY("Среда", true),
    THURSDAY("Четверг", false),
    FRIDAY("Пятница", false),
    SATURDAY("Суббота", true),
    SUNDAY("Воскресенье", false);

    private String rusName;
    private boolean isHoliday;

    DayOfWeek(String rusName, boolean isHoliday) {
        this.rusName = rusName;
        this.isHoliday = isHoliday;
    }

    public String getRusName() {
        return rusName;
    }

    public boolean isHoliday() {
        return isHoliday;
    }

    @Override
    public String toString() {
        return "DayOfWeek{" +
                "rusName='" + rusName + '\'' +
                ", isHoliday=" + isHoliday +
                '}';
    }
}
