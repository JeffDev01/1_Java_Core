package intermediate.Mdesignpatterns.factory.domain;

public interface Currency {

    String getSymbol();

}

class Real implements Currency{


    @Override
    public String getSymbol() {
        return "R$";
    }
}

class Dollar implements Currency{


    @Override
    public String getSymbol() {
        return "$";
    }
}
