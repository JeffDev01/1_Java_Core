package intermediate.Ncrud.classes;

import javax.sql.RowSet;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import java.sql.SQLException;

public class MyRowSetListener implements RowSetListener {
    @Override
    public void rowSetChanged(RowSetEvent event) {
        System.out.println("Comando execute executado"); /*Quando a linha inteira do registro é alterado*/
    }

    @Override
    public void rowChanged(RowSetEvent event) {
        System.out.println("Linha foi atualizada, inserida ou deletada");/*qualquer set dentro da linha.*/
        if(event.getSource() instanceof RowSet){
            try {
                ((RowSet) event.getSource()).execute();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    @Override
    public void cursorMoved(RowSetEvent event) {
        System.out.println("Cursor moveu"); /*Todas as vezes que o cursor for movimentado*/
    }
}
