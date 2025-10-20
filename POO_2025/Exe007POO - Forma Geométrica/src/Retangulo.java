public class Retangulo {
    private Ponto2D superiorEsquerdo;
    private Ponto2D inferiorDireito;

    public Retangulo(Ponto2D superiorEsquerdo, Ponto2D inferiorDireito) throws IllegalArgumentException {
        setSuperiorEsquerdo(superiorEsquerdo);
        setInferiorDireito(inferiorDireito);
    }

    @Override
    public String toString() {
        return "Ponto Superior Esquerdo: X - " + superiorEsquerdo.getX() + " Y - "+ superiorEsquerdo.getY() + "\n" +
                "Ponto Inferior Direito: X - " + inferiorDireito.getX() + " Y - " +  inferiorDireito.getY() + "\n" +
                "Altura: " + getAltura() + "\n" +
                "Largura: "+ getLargura() + "\n" +
                "É quadrado: " + isQuadrado() + "\n" +
                "Perímetro: " + getPerimetro();
    }

    public double area() {

        double altura = getAltura();
        double largura = getLargura();

        return  altura * largura;
    }

    public double getPerimetro() {
        double perimetro = (getAltura()*2) + (getLargura()*2);
        return perimetro;
    }

    public boolean contem(Ponto2D p) throws IllegalArgumentException {
        if (p == null) {
            throw new IllegalArgumentException("Ponto inválido");
        }
        if (p.getX() >= getSuperiorEsquerdo().getX() && p.getX() <= getInferiorDireito().getX() && p.getY() >= getInferiorDireito().getY() && p.getY() <= getSuperiorEsquerdo().getY()) {
            return true;
        }
        return false;
    }

    public boolean isQuadrado() {
        if (getAltura() == getLargura()) {
            return true;
        } else {
            return false;
        }
    }

    public double getAltura() {
        double altura = superiorEsquerdo.getY() - inferiorDireito.getY();
        return altura;
    }

    public double getLargura() {
        double largura = inferiorDireito.getX() - superiorEsquerdo.getX();
        return largura;
    }

    public void setSuperiorEsquerdo(Ponto2D superiorEsquerdo) throws IllegalArgumentException {
        if (inferiorDireito != null) {
            validarPontos(superiorEsquerdo, inferiorDireito);
        }
        this.superiorEsquerdo = superiorEsquerdo;
    }

    public Ponto2D getSuperiorEsquerdo() {
        return superiorEsquerdo;
    }

    public void setInferiorDireito(Ponto2D inferiorDireito) throws IllegalArgumentException {
        if (superiorEsquerdo != null) {
            validarPontos(superiorEsquerdo, inferiorDireito);
        }
        this.inferiorDireito = inferiorDireito;
    }

    public Ponto2D getInferiorDireito() {
        return inferiorDireito;
    }

    public void validarPontos(Ponto2D superiorEsquerdo, Ponto2D inferiorDireito) throws IllegalArgumentException {
        if (superiorEsquerdo.getX() > inferiorDireito.getX() ||
                superiorEsquerdo.getY() < inferiorDireito.getY()) {
            throw new IllegalArgumentException("Pontos não formam um retângulo válido");
        }
    }

}
