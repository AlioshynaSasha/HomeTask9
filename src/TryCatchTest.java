import java.util.Objects;

public class TryCatchTest {
    public void cook(String dishName) {
        try {
            if (Objects.equals(dishName, "fish")) {
                throw new HaveNoTimeException();
            }

            System.out.println("Okay!");
        } catch (HaveNoTimeException exception) {
            System.out.println("I have no time to cooking fish");
        }
    }

    public void clean(String thing) {
        try {
            if (Objects.equals(thing, "table")) {
                throw new HaveNoTimeException();
            }

            if (Objects.equals(thing, "bathroom")) {
                throw new HaveNoDesireException();
            }

            System.out.println("Okay!");
        } catch (HaveNoTimeException exception) {
            System.out.println("I have no time to clean table");
        } catch (HaveNoDesireException exception) {
            System.out.println("I have no desire to clean bathroom");
        }
    }

    public void buy(String product) {
        try {
            if (Objects.equals(product, "fish")) {
                throw new HaveNoTimeException();
            }

            if (Objects.equals(product, "chicken")) {
                throw new HaveNoDesireException();
            }

            System.out.println("Okay!");
        } catch (HaveNoTimeException | HaveNoDesireException exception) {
            System.out.println("I have no time or desire to buy something");
        }
    }

    public void kill(String person) {
        try {
            if (Objects.equals(person, "Valik")) {
                throw new HaveNoDesireException();
            }

            System.out.println("Okay!");
        } catch (HaveNoDesireException exception) {
            System.out.println("I don't kill him!");
        } finally {
            System.out.println("You should kill " + person + " today!");
        }
    }
}