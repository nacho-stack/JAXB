package es.dam2.main;

import es.dam2.dao.*;
import es.dam2.servicio.*;
import java.io.File;

public class Main {
	public static void main(String[] args) {
		
		ExpedienteDAO dao = new ExpedienteDAOXml(new File("datos/fenomenos_original.xml"),
				new File("datos/fenomenos_salida.xml"));
		ObservatorioService servicio = new ObservatorioService(dao);
		servicio.imprimirResumen();
		System.out.println("Investigaciones entre 2018 y 2024: " + dao.contarInvestigaciones(2018, 2024));
		System.out.println("Evidencia audio: " + dao.buscarPorTipoEvidencia("audio").size());
		System.out.println("Búsqueda EXP-003: " + dao.buscarPorCodigo(new String("EXP-003")));
		System.out.println("Actividad: " + servicio.actividadPorResponsable());
		//PROBAMOS LAS QUE ACTUALIZAN EL FICHERO:
		dao.cerrarExpediente("EXP-001");
		
	}
}
