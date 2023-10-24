package main;

import controlador.Notificacion;
import dominio.ServicioMensaje;
import servicios.ServicioEmail;
import servicios.ServicioSMS;
import servicios.ServicioWhatsApp;

public class Main {
    public static void main(String[] args) {
        ServicioMensaje servicioEmail = new ServicioEmail();

        Notificacion notificacionEmail = new Notificacion(servicioEmail);

        notificacionEmail.notificar("Esto es un Email");


        ServicioMensaje servicioSMS = new ServicioSMS();

        Notificacion notificacionSMS = new Notificacion(servicioSMS);

        notificacionSMS.notificar("Esto es un SMS");


        ServicioMensaje servicioWhatsApp = new ServicioWhatsApp();

        Notificacion notificacionWhatsApp = new Notificacion(servicioWhatsApp);

        notificacionWhatsApp.notificar("Esto es un WhatsApp");


    }
}
