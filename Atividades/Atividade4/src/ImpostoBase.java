public abstract class ImpostoBase implements Imposto {

    private double baseDeCalculo;
    private double aliquota;

    public ImpostoBase(double baseDeCalculo, double aliquota) {
        this.baseDeCalculo = baseDeCalculo;
        this.aliquota = aliquota;
    }

    public double getBaseDeCalculo() {
        return baseDeCalculo;
    }

    public void setBaseDeCalculo(double baseDeCalculo) {
        this.baseDeCalculo = baseDeCalculo;
    }

    public double getAliquota() {
        return aliquota;
    }

    public void setAliquota(double aliquota) {
        this.aliquota = aliquota;
    }

    @Override
    public double calcularImposto() {
        return baseDeCalculo * (aliquota / 100.0);
    }

    @Override
    public String getDescricao() {
        return "Imposto Base";
    }
}
