package com.example.actividadlinearlayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.actividadlinearlayout.R.id;
import com.example.actividadlinearlayout.R.layout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

@Metadata(
   mv = {1, 9, 0},
   k = 1,
   xi = 48,
   d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"},
   d2 = {"Lcom/example/actividadlinearlayout/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}
)
public final class MainActivity extends AppCompatActivity {
   protected void onCreate(@Nullable Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      this.setContentView(layout.activity_calculadora);
      EditText etPeso = (EditText)this.findViewById(id.etPeso);
      EditText etAltura = (EditText)this.findViewById(id.etAltura);
      Button btnCalcular = (Button)this.findViewById(id.btnCalcular);
      TextView tvResultado = (TextView)this.findViewById(id.tvResultado);
      btnCalcular.setOnClickListener(MainActivity::onCreate$lambda$0);
   }

   private static final void onCreate$lambda$0(EditText $etPeso, EditText $etAltura, TextView $tvResultado, View it) {
      Float peso = StringsKt.toFloatOrNull($etPeso.getText().toString());
      Float altura = StringsKt.toFloatOrNull($etAltura.getText().toString());
      if (peso != null && altura != null && altura > 0.0F) {
         float imc = peso / (altura * altura);
         String var7 = "Tu IMC es: %.2f";
         Object[] var8 = new Object[]{imc};
         String var10001 = String.format(var7, Arrays.copyOf(var8, var8.length));
         Intrinsics.checkNotNullExpressionValue(var10001, "format(...)");
         $tvResultado.setText((CharSequence)var10001);
      } else {
         $tvResultado.setText((CharSequence)"Ingresa valores válidos");
      }

   }
}
