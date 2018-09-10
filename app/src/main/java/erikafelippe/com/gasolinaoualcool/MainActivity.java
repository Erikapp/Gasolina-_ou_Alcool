package erikafelippe.com.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Criar cada item do layout
    private EditText precoAlcool;
    private EditText precoGasolina;
    private Button botaoVerificar;
    private TextView textoResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //No OnCreate criar o findById de cada item mencionado acima
        precoAlcool = (EditText) findViewById(R.id.precoAlcoolId);
        precoGasolina = (EditText) findViewById(R.id.precoGasolinaId);
        botaoVerificar = (Button) findViewById(R.id.botaoVerificarId);
        textoResultado = (TextView) findViewById(R.id.textoResultadoId);

        //Escrever esse codigo sempre que tiver botao clicável
        botaoVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Recupera os valores digitados e converte em String
                //ou seja, precoAlcool e convertido para String e
                //guardado na variável textoPrecoAlcool
                String textoPrecoAlcool = precoAlcool.getText().toString();
                String textoPrecoGasolina = precoGasolina.getText().toString();

                //Converter String para números e assim é possível calcular
                //ou seja, textoPrecoAlcool que é do tipo String é convertido
                //para Double e armazenado na variável valorAlcool
                Double valorAlcool = Double.parseDouble(textoPrecoAlcool);
                Double valorGasolina = Double.parseDouble(textoPrecoGasolina);

                //Fórmula do cálculo = álcool / gasolina
                double resultado = valorAlcool / valorGasolina;
                if (resultado >= 0.7) {
                    //Melhor usar gasolina
                    textoResultado.setText("É melhor utilizar Gasolina.");
                } else {
                    //Melhor usar álcool
                    textoResultado.setText("É melhor utilizar Álcool.");
                }
            }
        });

    }
}


