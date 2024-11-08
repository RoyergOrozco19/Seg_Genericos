package org.arle;

import org.arle.entity.Especialidad;
import org.arle.entity.Medico;
import org.arle.entity.Paciente;
import org.arle.service.MedicoService;

import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class App {

    public static void main(String[] args) {
        BlockingQueue<Paciente> colaPacientes = new ArrayBlockingQueue<>(10);
        MedicoService medicoService = new MedicoService();

        Medico medico1 = new Medico("Dr. Juan", Especialidad.Pediatra, colaPacientes);
        Medico medico2 = new Medico("Dr. María", Especialidad.Neurologia, colaPacientes);
        Medico medico3 = new Medico("Dr. David", Especialidad.Urologia, colaPacientes);
        Medico medico4 = new Medico("Dr. Carlos", Especialidad.Bacteriologia, colaPacientes);
        Medico medico5 = new Medico("Dra. Camila", Especialidad.Oncologia, colaPacientes);


        medicoService.agregarMedico(medico1);
        medicoService.agregarMedico(medico2);
        medicoService.agregarMedico(medico3);
        medicoService.agregarMedico(medico4);
        medicoService.agregarMedico(medico5);

        Thread hiloMedico1 = new Thread(medico1);
        Thread hiloMedico2 = new Thread(medico2);
        Thread hiloMedico3 = new Thread(medico3);
        Thread hiloMedico4 = new Thread(medico4);
        Thread hiloMedico5 = new Thread(medico5);

        hiloMedico1.start();
        hiloMedico2.start();
        hiloMedico3.start();
        hiloMedico4.start();
        hiloMedico5.start();

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Menú Principal:");
            System.out.println("1. Agregar paciente a la Fila");
            System.out.println("2. Mostrar cantidad de pacientes atendidos por los medicos disponibles");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre del paciente: ");
                    String nombrePaciente = scanner.nextLine();
                    System.out.print("Ingrese tiempo de atención (en segundos): ");
                    int tiempoAtencion = scanner.nextInt();

                    try {
                        colaPacientes.put(new Paciente(nombrePaciente, tiempoAtencion));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;

                case 2:
                    System.out.println("Dr. Juan ha atendido a " + medico1.getPacientesAtendidos() + " pacientes.");
                    System.out.println("Dra. María ha atendido a " + medico2.getPacientesAtendidos() + " pacientes.");
                    System.out.println("Dra. David ha atendido a " + medico3.getPacientesAtendidos() + " pacientes.");
                    System.out.println("Dra. Carlos ha atendido a " + medico4.getPacientesAtendidos() + " pacientes.");
                    System.out.println("Dra. Camila ha atendido a " + medico5.getPacientesAtendidos() + " pacientes.");
                    break;

                case 3:
                    salir = true;
                    hiloMedico1.interrupt();
                    hiloMedico2.interrupt();
                    hiloMedico3.interrupt();
                    hiloMedico4.interrupt();
                    hiloMedico5.interrupt();
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}
