package arvoreBinaria;

public class ArvoreBinaria<T> implements IArvoreBinaria<T> {

    private NoArvoreBinaria<T> _raiz;

    public ArvoreBinaria() {
        _raiz = null;
    }

    private int contarNos(NoArvoreBinaria<T> no) {
        return 0;
    }

    private void arvorePre(NoArvoreBinaria<T> no) {
        pertence(no.getInfo());
    }

    @Override
    public void setRaiz(NoArvoreBinaria<T> raiz) {
        this._raiz =  raiz;
    }

    @Override
    public boolean estaVazia() {
        return (_raiz == null);
    }

    @Override
    public boolean pertence(T info) {
        System.out.println("PROCURANDO: " + info);
        return pertence(_raiz, info);
    }

    private boolean pertence(NoArvoreBinaria<T> no, T info) {

        if (no == null) {
            System.out.println("<>");
            return false;
        }

        else {
            System.out.println("< " + no.getInfo() + " >");

            System.out.println(" ESQUERDA < " + no.getEsquerda().getInfo() + " >");

            if (no.getInfo().equals(info)) {
                return true;
            }

            System.out.println(" DIREITA < " + no.getDireita().getInfo() + " >");

            if (pertence(no.getEsquerda(), info)) {
                return true;
            }
            if (pertence(no.getDireita(), info)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int contarNos() {
        return 0;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
