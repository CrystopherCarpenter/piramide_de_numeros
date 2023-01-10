public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Digite o tamanho da pirâmide: ");

        int dim = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= dim; i++) {
            String num = String.valueOf(i);

            for (int j = 1; j < i; j++) {
                num = num + i; 
            }
            System.out.println(num);
        }
    }
}
