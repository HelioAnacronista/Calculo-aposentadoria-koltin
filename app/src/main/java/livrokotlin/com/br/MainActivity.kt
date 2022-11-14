package livrokotlin.com.br

import android.app.Activity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView


class MainActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Definindo o arquivo de layout
        setContentView(R.layout.activity_main)

        //Acessando o componente spinner
        val spn_sexo = findViewById<Spinner>(R.id.spn_sexo)
        spn_sexo.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, listOf("masculino", "femenino"))

        //Acessando o componente idade
        val txt_idade = findViewById<EditText>(R.id.txt_idade)

        //Acessando o componente resultado
        val txt_resultado = findViewById<TextView>(R.id.txt_resultado)

        //Acessando o componente de Botão
        val btn_calcular = findViewById<Button>(R.id.btn_calcular)
        //Setar a ação de click
        btn_calcular.setOnClickListener({
            //Captura o item no layout e converte em string
            val sexo = spn_sexo.selectedItem as String
            //Captura o item no layout
            val idade = txt_idade.text.toString().toInt()

            var resultado = 0
            if (sexo == "masculino") {
                resultado = 65 - idade
            } else {
                resultado = 60 - idade
            }

            //Atualizando a tela de acordo com o resultado
            txt_resultado.text = "Falta $resultado anos para voce se aposentar."
        })











    }
}