package B12_Observer.clase;

public interface Subject {
    public void adaugaClientFildel(Observer client);
        public void stergeClientFildel(Observer client);
    public void anuntaOferta(String mesaj);
    public void anuntaIntroducereMeniu(String mesaj);
}
