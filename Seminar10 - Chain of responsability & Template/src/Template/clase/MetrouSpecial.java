package Template.clase;

public class MetrouSpecial extends AMetrou {

    @Override
    public void opresteStatia1() {
        System.out.println("Metroul nu opreste in statia 1 deoarece este in renovare!");
    }

    @Override
    public void opresteStatia2() {
        System.out.println("Metroul a oprit in statia 2!");
    }

    @Override
    public void opresteStatia3() {
        System.out.println("Metroul a oprit in statia 3!");

    }

    @Override
    public void opresteStatia4() {
        System.out.println("Metroul nu opreste in statia 4 deoarece este in renovare!");

    }

    @Override
    public void opresteStatia5() {
        System.out.println("Metroul a oprit in statia 5!");

    }


}
