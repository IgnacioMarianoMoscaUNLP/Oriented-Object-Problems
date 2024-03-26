package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonSimpleAdapter extends VoorheesExporter{
	private String crearJSONSocio(Socio socio) {
		JSONObject objectJson = new JSONObject();
		objectJson.put("nombre",socio.getNombre());
		objectJson.put("email",socio.getEmail());
		objectJson.put("legajo",socio.getLegajo());
		return objectJson.toJSONString();
	}

	public String exportar(List<Socio> socios) {
		JSONArray arrayJSON = new JSONArray();
		socios.stream().forEach(socio -> arrayJSON.add(this.crearJSONSocio(socio)));
		return arrayJSON.toJSONString();
	}
	
}
