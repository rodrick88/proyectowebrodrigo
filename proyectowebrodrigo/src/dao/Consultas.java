package dao;

public class Consultas {
	
	public static final String CONSULTA_PATO_POR_ID = "SELECT * FROM Patologias p, Sintomas s WHERE p.id_patol = ? AND s.id_sint IN (SELECT id_sint FROM PatolSint WHERE id_patol = ?)";
}
