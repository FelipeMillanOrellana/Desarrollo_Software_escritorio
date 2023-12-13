/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author Admn
 */
public class NewClass {
    

//boton llama al servivio
import com.veterinaria.dto.MascotaDTO;
import com.veterinaria.services.MascotaService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMascotas extends JFrame {
    private MascotaService mascotaService;

    private JTextField txtNombre;
    private JTextField txtTipo;
    // Otros campos de texto y componentes para los atributos de la mascota

    public VentanaMascotas(MascotaService mascotaService) {
        this.mascotaService = mascotaService;

        // Configuración de la ventana, layout, etc.

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarMascota();
            }
        });

        // Agregar otros componentes a la ventana según sea necesario

        // Agregar el botón a la ventana
        add(btnGuardar);

        // Configuración final de la ventana
        pack();
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void guardarMascota() {
        // Recuperar los datos de los campos de texto u otros componentes
        String nombre = txtNombre.getText();
        String tipo = txtTipo.getText();
        // Obtener otros atributos de la mascota

        // Crear una instancia de MascotaDTO con los datos
        MascotaDTO mascota = new MascotaDTO(nombre, tipo);
        // Establecer otros atributos de la mascota

        // Llamar al servicio para guardar la mascota
        mascotaService.guardar(mascota);

        // Limpiar los campos después de guardar
        txtNombre.setText("");
        txtTipo.setText("");
        // Limpiar otros campos
    }

    // Otros métodos y configuraciones de la ventana
}

}