package intermediate.Mdesignpatterns.factory.domain;

public class CurrencyFactory {
    public static Currency newCurrency(Country country){
        switch (country){
            case USA : return new Dollar();
            case BRAZIL:return new Real();
            default:throw new IllegalArgumentException("No currency for the given coutry.");
        }

    }
}
