package classroom.c8;

import java.util.Objects;

public class PasswordBox {
    public String charactersLenght;
    public String digits;
    public String upperCase;
    public String lowerCase;


    public PasswordBox(String charactersLenght,String digits,String upperCase,String lowerCase) {
        this.charactersLenght = charactersLenght;
        this.digits = digits;
        this.upperCase = upperCase;
        this.lowerCase = lowerCase;
    }

    public String getCharactersLenght() {
        return charactersLenght;
    }

    public void setCharactersLenght(String charactersLenght) {
        this.charactersLenght = charactersLenght;
    }

    public String getDigits() {
        return digits;
    }

    public void setDigits(String digits) {
        this.digits = digits;
    }

    public String getUpperCase() {
        return upperCase;
    }

    public void setUpperCase(String upperCase) {
        this.upperCase = upperCase;
    }

    public String getLowerCase() {
        return lowerCase;
    }

    public void setLowerCase(String lowerCase) {
        this.lowerCase = lowerCase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordBox that = (PasswordBox) o;
        return charactersLenght == that.charactersLenght &&
                digits == that.digits &&
                upperCase == that.upperCase &&
                lowerCase == that.lowerCase;
    }

    @Override
    public int hashCode() {
        return Objects.hash(charactersLenght,digits,upperCase,lowerCase);
    }

    @Override
    public String toString() {
        return String.format("CharctersLenght: %s Digits: %s, UpperCase:, LowerCase: %s\n",
                this.getCharactersLenght(),
                this.getDigits(),
                this.getUpperCase(),
                this.getLowerCase());
    }
}
