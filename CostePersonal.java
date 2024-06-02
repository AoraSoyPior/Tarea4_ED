public class CostePersonal {
	
	static float CosteDelPersonal(Trabajador trabajadores[]) {
		float costeFinal = 0;
		for (Trabajador trabajador : trabajadores) {
			costeFinal += calcularCosteTrabajador(trabajador);
		}
		
		return costeFinal;
	}

	private static float calcularCosteTrabajador(Trabajador trabajador){
		if (esDirectorOSubdirector(trabajador)){
			return trabajador.getNomina();
		} else{
			return trabajador.getNomina() + calcularHorasExtras(trabajador);
		}
	}

	private static boolean esDirectorOSubdirector(Trabajador trabajador){
		return trabajador.getTipoTrabajador() == Trabajador.DIRECTOR || trabajador.getTipoTrabajador == Trabajador.SUBDIRECTOR;
	}

	private static float calcularHorasExtras(Trabajador trabajador){
		return trabajador.getHorasExtras() * 20;
	}
}