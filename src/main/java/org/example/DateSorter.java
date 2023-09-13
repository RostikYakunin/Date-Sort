package org.example;

import java.time.LocalDate;
import java.util.*;

/**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 * <p>
 * <p>
 * Implement in single class.
 */
public class DateSorter {
    /**
     * The implementation of this method should sort dates.
     * The output should be in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2005-07-01, 2005-01-02, 2005-01-01, 2005-05-03)
     * would sort to
     * (2005-01-01, 2005-01-02, 2005-07-01, 2005-05-03)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        List<LocalDate> listWithR = new ArrayList<>();
        List<LocalDate> listWithoutR = new ArrayList<>();

        for (var unsortedDate : unsortedDates) {
            if (unsortedDate.getMonth().toString().toLowerCase().contains("r")){
                listWithR.add(unsortedDate);
            } else {
                listWithoutR.add(unsortedDate);
            }
        }

        Collections.sort(listWithR);
        Collections.sort(listWithoutR, getMonthDescComparator());

        listWithR.addAll(listWithoutR);
        return listWithR;
    }

    private Comparator<LocalDate> getMonthDescComparator() {
        return (date1, date2) -> {
            int monthComparison = Integer.compare(date2.getMonthValue(), date1.getMonthValue());

            if (monthComparison != 0) {
                return monthComparison;
            } else {
                return Integer.compare(date2.getDayOfMonth(), date1.getDayOfMonth());
            }
        };
    }
}
