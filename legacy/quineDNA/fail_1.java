import java.io.*;
class Yang
{
	public static void main(String args[]) throws Exception
	{
		ProcessBuilder pb;
		Process p;
		BufferedReader br;
		String line;
		BufferedWriter bw = null;
		try {
		   	String YY1 = "import java.io.*;\nclass Yin\n{\n\tpublic static void main(String args[]) throws Exception\n\t{\n\t\tProcessBuilder pb;\n\t\tProcess p;\n\t\tBufferedReader br;\n\t\tString line;\n\t\tBufferedWriter bw = null;\n\t\ttry {\n\t\t\tString DNA = @;\n\t\t\tbw = new BufferedWriter(new FileWriter(\"Yang.java\"));\n\t\t\tbw.write(process(DNA));\n\t\t\tbw.flush();\n\t\t\tbw.close();\n\t\t\tpb = new ProcessBuilder(\"javac\",\"Yang.java\").redirectErrorStream(true);\n\t\t\tp = pb.start();\n\t\t\tp.waitFor();\n\t\t\t//pb = new ProcessBuilder(\"java\",\"Yang\").redirectErrorStream(true);\n\t\t\t//p = pb.start();\n\t\t\tpb = new ProcessBuilder(\"rm\",\"Yin.java\").redirectErrorStream(true);\n\t\t\tp = pb.start();\n\t\t\tp.waitFor();\n\t\t}\n\t\tcatch (Exception e) {\n\t\t}\n\t}";
		   	String YY2 = "\n\tpublic static String process(String baseDNA)\n\t{\n\t\tString bs = baseDNA.replaceAll(\"\\\\\\\\\", \"\\\\\\\\\\\\\\\\\");\n\t\tString bn = bs.replaceAll(\"\\n\", \"\\\\\\\\n\");\n\t\tString bt = bn.replaceAll(\"\\t\", \"\\\\\\\\t\");\n\t\tString dq = bt.replaceAll(\"\\\"\", \"\\\\\\\\\\\"\");\n\t\tString newDNA = \"\";\n\t\tfor (int i=0;i<baseDNA.length();i++)\n\t\t\tif (baseDNA.charAt(i) == 64)\n\t\t\t\tnewDNA = baseDNA.substring(0,i)+\"\\\"\"+dq+\"\\\"\"+baseDNA.substring(i+1);\n\t\treturn newDNA;\n\t}\n}
		   	
		   	
		   	\n\t\tString yy1 = dq.replaceAll(\"Yin\", \"YIN\");\n\t\tString yy2 = yy1.replaceAll(\"Yang\", \"Yin\");\n\t\tString yy3 = yy2.replaceAll(\"YIN\", \"Yang\");";
			bw = new BufferedWriter(new FileWriter("Yin.java"));
			bw.write(process(processYY(YY1))+process(YY2));
			bw.flush();
			bw.close();
			pb = new ProcessBuilder("javac","Yin.java").redirectErrorStream(true);
			p = pb.start();
			p.waitFor();
			//pb = new ProcessBuilder("java","Yin").redirectErrorStream(true);
			//p = pb.start();
			pb = new ProcessBuilder("rm","Yang.java").redirectErrorStream(true);
			p = pb.start();
			p.waitFor();
		}
		catch (Exception e) {
		}
			
	}
	public static String process(String baseDNA)
	{
		String bs = baseDNA.replaceAll("\\\\", "\\\\\\\\");
		String bn = bs.replaceAll("\n", "\\\\n");
		String bt = bn.replaceAll("\t", "\\\\t");
		String dq = bt.replaceAll("\"", "\\\\\"");
		String newDNA = "";
		for (int i=0;i<baseDNA.length();i++)
			if (baseDNA.charAt(i) == 64)
				newDNA = baseDNA.substring(0,i)+"\""+dq+"\""+baseDNA.substring(i+1);
		return newDNA;
	}
	public static String processYY(String baseDNA)
	{
		String yy1 = baseDNA.replaceAll("Yin", "Dmy");
		String yy2 = yy1.replaceAll("Yang", "Yin");
		String yy3 = yy2.replaceAll("Dmy", "Yang");
		return yy3;
	}
}
