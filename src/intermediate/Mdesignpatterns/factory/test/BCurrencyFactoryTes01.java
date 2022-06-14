package intermediate.Mdesignpatterns.factory.test;

import intermediate.Mdesignpatterns.factory.domain.Country;
import intermediate.Mdesignpatterns.factory.domain.Currency;
import intermediate.Mdesignpatterns.factory.domain.CurrencyFactory;

public class BCurrencyFactoryTes01 {

    public static void main(String[] args) {

        Currency currency = CurrencyFactory.newCurrency(Country.BRAZIL);
        System.out.println(currency.getSymbol());

    }
}
