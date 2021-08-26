public class Lanzador {
    public static void main(String[] args) {
       Banco banco= new Banco();
        String[] credito1=banco.calcularCredito(new int[]{1000000,10});
        String[] credito2=banco.calcularCredito(new int[]{500000, 25});
        String[] credito3=banco.calcularCredito(new int[]{2500000, 20});
        System.out.println(credito1[0]+", "+credito1[1]);
        System.out.println(credito2[0]+", "+credito2[1]);
        System.out.println(credito3[0]+", "+credito3[1]);
    }
}
