package javax.jws;

import javax.jws.WebService;

@WebService()
public class Loteria {

	private numero numero;

	@WebMethod()
	public String Loteria(numero aleatorio) {
	    this.numero = aleatorio;
		String resultado;
		System.out.println("combinacion: " + resultado);
	    return "combinacion " + resultado + "reintegro";
	}
}
