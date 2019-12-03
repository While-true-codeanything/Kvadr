package com.example.resheniekvadrurav;
import android.view.View;
import android.widget.TextView;
public class ButtonListner implements View.OnClickListener {
    private TextView a1;
    private TextView b1;
    private TextView c1;
    private TextView x3;
    private TextView x4;
    public ButtonListner(TextView a,TextView b,TextView c,TextView x1,TextView x2){
        a1=a;
        b1=b;
        c1=c;
        x3=x1;
        x4=x2;
    }
    public void onClick(View v) {
        int a = Integer.parseInt(a1.getText().toString());
        int b = Integer.parseInt(b1.getText().toString());
        int c = Integer.parseInt(c1.getText().toString());
        if (a == 0) {
            double n = 0;
            n = (-c / (b + 0.0));
            x3.setText("" + n);
            x4.setText("нет корней");
        } else if (b == 0) {
            double n = 0;
            n = -1.0 * c / a;
            n = Math.sqrt(n);
            x3.setText("" + -n);
            x4.setText("" + n);
        } else {
            double D = b * b - 4 * a * c;
            if (D > 0) {
                double x1, x2;
                x1 = (-b - Math.sqrt(D)) / (2.0 * a);
                x2 = (-b + Math.sqrt(D)) / (2.0 * a);
                x3.setText("" + x1);
                x4.setText("" + x2);
            } else if (D == 0) {
                double x;
                x = -b / (2.0 * a);
                x3.setText("" + x);
                x4.setText("нет 2 корня");
            } else {
                x3.setText("нет корней");
                x4.setText("нет корней");
            }
        }
    }
}
