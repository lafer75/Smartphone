public class Android implements Linux, Smartphones {

    public void call() {
        System.out.println("Звонят : тун тун тун");
    }

    @Override
    public void sms() {
        System.out.println("Сообщение : дзинь");
    }

    @Override
    public  void internet() {
        System.out.println("Интернет : WI-FI 5.0v");
    }

    @Override
    public  void modelPhone() {
        System.out.println("Xiaomi MI 11");
    }

    public void enterChrome() {
        System.out.println("Зашел в Chrome");
    }

    @Override
    public String search() {
        System.out.println("Начал поиск...");
        return null;
    }

    public void closeChrome() {
        System.out.println("Закрыл Chrome");
    }

    @Override
    public void enterPlatMarket() {
        System.out.println("Зашел в Play Market");
    }

    @Override
    public void downloadApp() {
        System.out.println("Скачал приложение...");
    }

    @Override
    public void closePlatMarket() {
        System.out.println("Закрыл Play Market");

    }

    @Override
    public void enterSafari() {}

    @Override
    public void closeSafari() {}

    @Override
    public void enterAppStore() {}

    @Override
    public void closeAppstore() {}
}
