
public class Fila {
    private int fila[];
    private int maximo;
    private int tamanho;

    public Fila() {
        this.maximo = 2;
        this.tamanho = 0;
        this.fila = new int[this.maximo];
    }

    public void add (int valor) {
        if (tamanho < maximo) {
            this.fila[this.tamanho] = valor;
            this.tamanho++;
        }
        else {
            this.maximo *= 2;
            int[] nova_fila = new int[this.maximo];

            for (int i = 0; i < tamanho ; i++) {
                nova_fila[i] = this.fila[i];
            }

            this.fila = nova_fila;
            this.fila[this.tamanho] = valor;
            this.tamanho++;
        }
    }

    public int rem () {
        if (this.isEmpty()) {
            throw new RuntimeException("Fila vazia, impossível remover!");
        }

        int valor = this.fila[0];

        for (int i=0; i < (this.tamanho)-1; i++) {
            this.fila[i] = this.fila[i+1];
        }
        this.tamanho--;

        return valor;
    }

    public int proximo() {
        if (this.isEmpty()) {
            throw new RuntimeException("Fila vazia, não existe próximo!");
        }
        return this.fila[0];
    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    public int size() {
        return this.tamanho;
    }

    public String mostrar() {
        String valores = "";
        for(int i=0; i < this.tamanho; i++) {
            valores = valores + this.fila[i] + " ";
        }

        return valores;
    }
}