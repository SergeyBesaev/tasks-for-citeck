package Task1;

public class NumOccurrenceDTO {
    Integer number;
    Integer occurrences;

    public NumOccurrenceDTO(Integer number, Integer occurrences) {
        this.number = number;
        this.occurrences = occurrences;
    }

    @Override
    public String toString() {
        return "{number: " + number +
                ", occurrences: " + occurrences +
                '}';
    }
}
