package lang;

public class Strings3 {

	public static void main(String[] args) {
		
		// String que muda.
		
		String cpf = "42256467856";
		
		StringBuffer sb = new StringBuffer(cpf);
		sb.insert(3, ".");
		sb.insert(7, ".");
		sb.insert(11, "-");
		sb.append(" CPF");
		sb.append(" Pessoa Fisica");
		System.out.println(sb.toString());
		
		StringBuffer sbu = new StringBuffer(60);
		System.out.println(sbu);
		
		StringBuffer sbf = new StringBuffer(sb);
		sbf.append(" Leonardo");
		sbf.append('.');
		System.out.println(sbf);
		
		StringBuffer sbfr = new StringBuffer();
		sbfr.append(sbf);
		System.out.println(sbfr);
	}
}
