package exemplo.verificador;

import android.media.MediaPlayer;
import android.preference.EditTextPreference;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Abre a tela.xml
        setContentView(R.layout.tela);

        //Buscando os valores
        final EditText precogasolina = (EditText) findViewById(R.id.texto1);
        final EditText precoalcool = (EditText) findViewById(R.id.texto2);
        final TextView verificado = (TextView) findViewById(R.id.resultado);
        Button button = (Button) findViewById(R.id.botao);

        //Informa o Listener...
        button.setOnClickListener(new Button.OnClickListener(){

            public void onClick(View v){

                //Pegando os valores...
                String valor1 = precogasolina.getText().toString();
                String valor2 = precoalcool.getText().toString();

                //Convertendo para Double...
                double conversao1 = Double.parseDouble(valor1);
                double conversao2 = Double.parseDouble(valor2);

                //Calculado os 70% do preço da Gasolina...
                double calculo = conversao1*70/100;

                //Exibindo o Resultado...
                if(conversao2<=calculo)
                    verificado.setText("Melhor abastecer com Álcool");
                else
                    verificado.setText("Melhor abastecer com Gasolina");

            }
        });
    }
}
