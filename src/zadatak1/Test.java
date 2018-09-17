package zadatak1;

public class Test {
	public static void main(String[] args) {
		Author ivo = new Author("Ivo Andric", "ivo.andric@gmail.com", 'M');
		
		Book naDriniCuprija = new Book("Na Drini cuprija", ivo, 15, 4);
		
		System.out.println(naDriniCuprija.toString());
		
		
	}
}
