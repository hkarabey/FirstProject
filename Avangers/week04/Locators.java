package week04;

import org.xml.sax.Locator;

public class Locators {

    String locator;

    public Locators(String locator) {
        this.locator = locator;
    }

    class ID extends Locators {
        public ID(String locator) {
            super(locator);
        }
    }

    class Name extends Locators {
        public Name(String locator) {
            super(locator);

        }
    }

}
