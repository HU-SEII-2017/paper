public class Program {
	public Language getLanguage(String lang) {
		if(lang.equals("C"))
			return Language.C;
		else if(lang.equals("CPP"))
			return Language.CPP;
		else
			return Language.JAVA;
	}

	public Language working(String lang) {
		if(lang.equals("C"))
			return Language.C;
		else if(lang.equals("CPP"))
			return Language.CPP;
		else if(lang.equals("JAVA"))
			return Language.JAVA;
		else
			return Language.PYTHON;
	}
}
