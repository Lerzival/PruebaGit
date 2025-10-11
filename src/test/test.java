package test;

public class test {

	public static void main (String[] args) {
		int[] prueba = {0,1,2,3,5,6,8,9,12,34,14,56,34,68,67,15,94,26};
		Recursividad recursividad = new Recursividad();
		int encontrado = recursividad.encontrar(34, prueba);
		System.out.println(encontrado);
	}
}
