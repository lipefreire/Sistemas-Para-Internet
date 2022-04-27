import java.util.ArrayList;

public class TestandoArrayList {
	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList();
		arrayList.add("São Paulo");
		arrayList.add("Aracajú");
		arrayList.add("Rio");
	
		System.out.println(arrayList);
		arrayList.add(1, "Porto Alegre");
		System.out.println(arrayList);
		
		
		System.out.println(arrayList.indexOf("Rio"));
		System.out.println(arrayList.contains("Rio"));
		System.out.println(arrayList.get(1));
		
		//REMOVER
		arrayList.remove("Rio");
		System.out.println(arrayList);
		
		//IMPRIMIR O TAMANHO DA LISTA
		System.out.println(arrayList.size());
	}
}
