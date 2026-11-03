package com.mycompany.casopractico02gloria;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    private TextField txtSalarioBase;
    @FXML
    private TextField txtHorasExtra;
    @FXML
    private TextField txtPagoExtra;
    @FXML
    private TextField txtSubtotal;
    @FXML
    private TextField txtIsr;
    @FXML
    private TextField txtNeto;

    @FXML
    private void btnCalcular_click() {
        try {
            double salarioBase = Double.parseDouble(txtSalarioBase.getText());
            double horasExtra = Double.parseDouble(txtHorasExtra.getText());

            double pagoExtra = horasExtra * 120.0;
            double subtotal = salarioBase + pagoExtra;
            double isr = subtotal * 0.16;
            double neto = subtotal - isr;

            txtPagoExtra.setText(String.valueOf(pagoExtra));
            txtSubtotal.setText(String.valueOf(subtotal));
            txtIsr.setText(String.format("%.2f", isr));
            txtNeto.setText(String.format("%.2f", neto));

        } catch (NumberFormatException e) {
            txtNeto.setText("Error en datos");
        }
    }
}