class quine
{
	public static void main(String args[])
	{
		String DNA = "class quine\n{\n\tpublic static void main(String args[])\n\t{\n\t\tString DNA = @;\n\t\tSystem.out.println(process(DNA));\n\t}\n\tpublic static String process(String a)\n\t{\n\t\tString bs = a.replaceAll(\"\\\\\\\\\", \"\\\\\\\\\\\\\\\\\");\n\t\tString bn = bs.replaceAll(\"\\n\", \"\\\\\\\\n\");\n\t\tString bt = bn.replaceAll(\"\\t\", \"\\\\\\\\t\");\n\t\tString dq = bt.replaceAll(\"\\\"\", \"\\\\\\\\\\\"\");\n\t\tString newDNA = \"\";\n\t\tfor (int i=0;i<a.length();i++)\n\t\t\tif (a.charAt(i) == 64)\n\t\t\t\tnewDNA = a.substring(0,i)+\"\\\"\"+dq+\"\\\"\"+a.substring(i+1);\n\t\treturn newDNA;\n\t}\n}";
		System.out.println(process(DNA));
	}
	public static String process(String a)
	{
		String bs = a.replaceAll("\\\\", "\\\\\\\\");
		String bn = bs.replaceAll("\n", "\\\\n");
		String bt = bn.replaceAll("\t", "\\\\t");
		String dq = bt.replaceAll("\"", "\\\\\"");
		String newDNA = "";
		for (int i=0;i<a.length();i++)
			if (a.charAt(i) == 64)
				newDNA = a.substring(0,i)+"\""+dq+"\""+a.substring(i+1);
		return newDNA;
	}
}
