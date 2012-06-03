import org.hibernate.Session;

import com.mk.sistema.vendas.HibernateUtil;

public class ConnectionTest {

	public static void main(String[] args) {
		Session session = null;
		
		try {
			session = HibernateUtil.getSession().openSession();
			System.out.println("Conectado com sucesso!");
		} finally {
			session.close();
			System.out.println("Conexão fechada.");
		}
	}
}