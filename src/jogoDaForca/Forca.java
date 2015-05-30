package jogoDaForca;

public class Forca {
	private String palavra;
	private String linhaDaPalavra = "";

	Forca(String palavra) {
		this.palavra = palavra;
	}

	public String desenhaLinhaForca() {
		for(int i = 0; i < this.palavra.length(); i++){
			linhaDaPalavra =  linhaDaPalavra +  "_ ";
		}
		return linhaDaPalavra;
	}
	
	public boolean advinhaLetra(String letra){
		int contador = this.palavra.length();  
		for (int i=0; i< contador; i++) {  
			   //char c = this.palavra.charAt(i);
			   if (this.palavra.substring(i,i+1).equalsIgnoreCase(letra)){
				  System.out.print(letra); 
			   }else{
				   System.out.println("letra inválida");
			   }
			} 
		return true;		
	}
}
