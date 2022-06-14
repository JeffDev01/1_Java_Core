package intermediate.Mdesignpatterns.singleton.test;

import intermediate.Mdesignpatterns.builder.domain.Person;
import intermediate.Mdesignpatterns.factory.domain.Country;
import intermediate.Mdesignpatterns.factory.domain.Currency;
import intermediate.Mdesignpatterns.factory.domain.CurrencyFactory;
import intermediate.Mdesignpatterns.singleton.domain.Aircraft;
import intermediate.Mdesignpatterns.singleton.dto.ReportDTO;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {

        Aircraft aircraft = new Aircraft("AirBus");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        Person person = Person.PersonBuilder.builder().firstName("Jefferson").lastName(" Borges de Brito").build();

        ReportDTO reportDTO = ReportDTO.ReportDTOBuilder.builder()
                .aircraftName(aircraft.getName())
                .country(country)
                .currency(currency)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDTO);

    }
}
