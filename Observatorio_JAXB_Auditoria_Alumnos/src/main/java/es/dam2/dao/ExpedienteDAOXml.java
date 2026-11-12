package es.dam2.dao;

import es.dam2.expedientes.*;
import jakarta.xml.bind.*;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación recibida de un proveedor externo. Auditar su comportamiento.
 */
public class ExpedienteDAOXml implements ExpedienteDAO {
	private final File origen;
	private final File destino;
	private final JAXBContext contexto;
	private final ArchivoType archivo;

	public ExpedienteDAOXml(File origen, File destino) {
		try {
			this.origen = origen;
			this.destino = destino;
			contexto = JAXBContext.newInstance(ArchivoType.class);
			Unmarshaller lector = contexto.createUnmarshaller();
			JAXBElement<ArchivoType> raiz = lector.unmarshal(new StreamSource(origen), ArchivoType.class);
			archivo = raiz.getValue();
		} catch (JAXBException ex) {
			throw new IllegalStateException("No se pudo cargar el archivo XML", ex);
		}
	}

	public List<ExpedienteType> listarExpedientes() {
		return archivo.getExpediente();
	}

	public ExpedienteType buscarPorCodigo(String codigo) {
		for (ExpedienteType e : archivo.getExpediente()) {

			// ERROR:
			// if (e.getCodigo() == codigo)
			if (e.getCodigo().equals(codigo))
				return e;
		}
		return null;
	}

	public long contarInvestigaciones(int desde, int hasta) {
//		int total = 0;
//		for (ExpedienteType e : archivo.getExpediente()) {
//			for (InvestigacionType i : e.getInvestigaciones().getInvestigacion()) {
//				int anio = i.getAño().getYear();
//				if (anio >= desde && anio <= hasta)
//					total++;
//			}
//		}

		return archivo.getExpediente().stream().flatMap(x -> x.getInvestigaciones().getInvestigacion().stream())
				.filter(x -> x.getAño().getYear() >= desde && x.getAño().getYear() <= hasta).count();

//		return total;
	}

	public List<ExpedienteType> buscarPorTipoEvidencia(String tipo) {
		List<ExpedienteType> resultado = new ArrayList<>();
		for (ExpedienteType e : archivo.getExpediente()) {
			for (InvestigacionType i : e.getInvestigaciones().getInvestigacion()) {
				if (i.getEvidencias() != null)
					for (EvidenciaType evidencia : i.getEvidencias().getEvidencia()) {
						if (evidencia.getTipo().value().equals(tipo))
							resultado.add(e);
					}
			}
		}
		return resultado;
	}

	public boolean agregarInvestigacion(String codigo, InvestigacionType nueva) {
		ExpedienteType e = buscarPorCodigo(codigo);
		if (e == null)
			return false;
		// List<InvestigacionType> investigaciones = new
		// ArrayList<>(e.getInvestigaciones().getInvestigacion());
		e.getInvestigaciones().getInvestigacion().add(nueva);
		guardar();
		return true;
	}

	public int eliminarInvestigacionesAnteriores(int anio) {
		int eliminadas = 0;
		for (ExpedienteType e : archivo.getExpediente()) {
//			for (InvestigacionType i : e.getInvestigaciones().getInvestigacion()) {
//				if (i.getAño().getYear() <= anio) {
//					e.getInvestigaciones().getInvestigacion().remove(i);
//					eliminadas++;
//				}
//			}
			int tam = e.getInvestigaciones().getInvestigacion().size();
			e.getInvestigaciones().getInvestigacion().removeIf(x -> x.getAño().getYear() <= anio);
			eliminadas += (tam - e.getInvestigaciones().getInvestigacion().size());
		}
		guardar();
		return eliminadas;
	}

	public boolean cerrarExpediente(String codigo) {
		ExpedienteType e = buscarPorCodigo(codigo);
		if (e == null)
			return false;
		e.setEstado(EstadoType.CERRADO);
		guardar();
		return true;
	}

	public void guardar() {
		try {
			Marshaller marshaller = contexto.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			ObjectFactory factory = new ObjectFactory();

			JAXBElement<ArchivoType> raiz =
			    factory.createArchivo(archivo);

			marshaller.marshal(raiz, destino);
			

		} catch (JAXBException ex) {
			System.err.println("Aviso: " + ex.getMessage());
		}
	}
}
