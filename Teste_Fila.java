public class Teste_Fila {
    public static void main(String[] args) {
        Fila minha_fila = new Fila();
        String valores;
        int removido;

        //Inserindo elementos na fila
        for (int valor=1; valor<11 ; valor++) {
            minha_fila.add(valor);
        }

        System.out.print("\n\nA fila está vazia: ");
        System.out.println(minha_fila.isEmpty());
        System.out.print("Qual o tamanho da fila: ");
        System.out.println( minha_fila.size());

        valores =  minha_fila.mostrar();
        System.out.print("\n\nEstado atual da fila: ");
        System.out.print(valores);

        System.out.print("\npxm: ");
        System.out.println(minha_fila.proximo());
        removido = minha_fila.rem();
        System.out.println("Removendo... " + removido);

        System.out.print("\npxm: ");
        System.out.println(minha_fila.proximo());
        removido = minha_fila.rem();
        System.out.println("Removendo... " + removido);

        System.out.print("\npxm: ");
        System.out.println(minha_fila.proximo());
        removido = minha_fila.rem();
        System.out.println("Removendo... " + removido);

        valores = minha_fila.mostrar();
        System.out.print("Estado atual da fila: ");
        System.out.println(valores);

        System.out.print("\npxm: ");
        System.out.println(minha_fila.proximo());
        removido = minha_fila.rem();
        System.out.println("Removendo... " + removido);

        System.out.print("\npxm: ");
        System.out.println(minha_fila.proximo());
        removido = minha_fila.rem();
        System.out.println("Removendo... " + removido);

        System.out.print("\npxm: ");
        System.out.println(minha_fila.proximo());

        System.out.print("\nA fila está vazia: ");
        System.out.println(minha_fila.isEmpty());
        System.out.print("\nQual o tamanho da fila: ");
        System.out.println( minha_fila.size());

        valores = minha_fila.mostrar();
        System.out.print("Estado atual da fila: ");
        System.out.println(valores);

        removido = minha_fila.rem();
        System.out.println("\nRemovendo... " + removido);
        removido = minha_fila.rem();
        System.out.println("Removendo... " + removido);
        removido = minha_fila.rem();
        System.out.println("Removendo... " + removido);

        System.out.print("\nA fila está vazia: ");
        System.out.println(minha_fila.isEmpty());
        System.out.print("Qual o tamanho da fila: ");
        System.out.println( minha_fila.size());

        removido = minha_fila.rem();
        System.out.println("\nRemovendo... " + removido);
        removido = minha_fila.rem();
        System.out.println("Removendo... " + removido);

        //Testando exceção
        removido = minha_fila.rem();

        System.out.print("\nA fila está vazia: ");
        System.out.println(minha_fila.isEmpty());
        System.out.print("Qual o tamanho da fila: ");
        System.out.println( minha_fila.size());
    }
}