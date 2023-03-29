import java.util.ArrayList;

public class Percentual {

	public static void main(String[] args) {
		double sP = 67836.43;
		double rJ = 36678.66;
		double mG = 29229.88;
		double eS = 27165.48;
		double outros = 19849.53;
		
		double somaTotal = sP+rJ+mG+eS+outros;
		
		double percentualSp = sP*100/somaTotal;
		double percentualRj = rJ*100/somaTotal;
		double percentualMg = mG*100/somaTotal;
		double percentualEs = eS*100/somaTotal;
		double percentualOutros = outros*100/somaTotal;
		
		System.out.println("SP: " + percentualSp
						+  "\nRJ: " + percentualRj
						+  "\nMG: " + percentualMg
						+  "\nES: " + percentualEs
						+  "\nOUTROS: " + percentualOutros
						);
	}

}
