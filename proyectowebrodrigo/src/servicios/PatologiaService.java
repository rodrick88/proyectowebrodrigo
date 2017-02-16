package servicios;

import dao.PatologiaDAO;
import dto.PatologiaDTO;

public class PatologiaService {
	
	public PatologiaDTO buscarPatologiaPorId (int id)
	{
		PatologiaDTO patoDTO = null;
		
			PatologiaDAO pdao = new PatologiaDAO();
			patoDTO = pdao.buscarPorId(id);
		
		//	System.out.println(patoDTO.toString());
			
		return patoDTO;
	}

}
