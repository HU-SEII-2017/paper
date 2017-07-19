public class Program {
	public com.astortest.Language getLanguage(java.lang.String lang) {
		if (lang.equals("C"))
			return com.astortest.Language.C;
		else
			if (lang.equals("CPP"))
				return com.astortest.Language.CPP;
			else
				if (lang.equals("JAVA"))
					return com.astortest.Language.JAVA;
				else
					return com.astortest.Language.PYTHON;		
	}
}