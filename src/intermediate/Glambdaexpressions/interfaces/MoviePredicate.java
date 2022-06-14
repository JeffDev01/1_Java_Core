package intermediate.Glambdaexpressions.interfaces;

import intermediate.Glambdaexpressions.domain.Movie;


/*como nessa interface temos apenas 1 metodo abestrato podemos chamar essa interface de FunctionalINterface, assim é
 * possível trabalhar com Funções Lambdas*/
@FunctionalInterface
public interface MoviePredicate {

    boolean test(Movie movie);/*Método abstrato que retorna boolean*/

}
