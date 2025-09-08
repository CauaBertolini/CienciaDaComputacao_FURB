public class Retangulo {
    private Ponto2D superiorEsquerdo;
    private Ponto2D inferiorDireito;

    public Retangulo(Ponto2D superiorEsquerdo, Ponto2D inferiorDireito) {
        setSuperiorEsquerdo(inferiorDireito);
        setInferiorDireito(inferiorDireito);
    }

    @Override
    public String toString() {
        return "Retângulo: \n" +
                "Ponto Superior Esquerdo: X - " + superiorEsquerdo.getX() + " Y - "+ superiorEsquerdo.getY() +
                "Ponto Inferior Direito: X - " + inferiorDireito.getX() + " Y - " +  inferiorDireito.getY();
    }

    public double area() {

        double altura = getAltura();
        double largura = getLargura();

        return  altura * largura;
    }

    public double perimetro() {
        double perimetro = (getAltura()*2) + (getLargura()*2);
        return perimetro;
    }

    public boolean contem(Ponto2D p) {
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

    public void setSuperiorEsquerdo(Ponto2D superiorEsquerdo) {
        if (superiorEsquerdo == null) {
            throw  new IllegalArgumentException("Pontos não formam um retângulo válido");
        }
        if (inferiorDireito != null && !(superiorEsquerdo.getX() < inferiorDireito.getX() && superiorEsquerdo.getY() > inferiorDireito.getY())) {
            throw  new IllegalArgumentException("Pontos não formam um retângulo válido");
        }
        this.superiorEsquerdo = superiorEsquerdo;
    }

    public Ponto2D getSuperiorEsquerdo() {
        return superiorEsquerdo;
    }

    public void setInferiorDireito(Ponto2D inferiorDireito) {
        if (inferiorDireito == null) {
            throw new IllegalArgumentException("Pontos não formam um retângulo válido");
        }
        if (superiorEsquerdo != null && !(superiorEsquerdo.getX() < inferiorDireito.getX() && superiorEsquerdo.getY() > inferiorDireito.getY())) {
            throw  new IllegalArgumentException("Pontos não formam um retângulo válido");
        }
        this.inferiorDireito = inferiorDireito;
    }

    public Ponto2D getInferiorDireito() {
        return inferiorDireito;
    }

}
