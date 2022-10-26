public class Iphone implements IOS,Smartphones {


    public void call() {
        System.out.println("Звонят : пум пум пум");
    }


    public void sms() {
        System.out.println("Сообщение : бульк");
    }

    @Override
    public void internet() {
        System.out.println("Интернет : WI-FI 5.0v");
    }

    @Override
    public void modelPhone() {
        System.out.println("Iphone 14");
    }

    @Override
    public void enterSafari() {
        System.out.println("Зашел в Safari");
    }

    @Override
    public String search() {
        System.out.println("Начал поиск...");
        return null;
    }


    @Override
    public void closeSafari() {
        System.out.println("Закрыл Safari");
    }

    @Override
    public void enterAppStore() {
        System.out.println("Зашел в AppStore");
    }

    @Override
    public void downloadApp() {
        System.out.println("Скачал приложение...");
    }


    @Override
    public void closeAppstore() {
        System.out.println("Закрыл AppStore");
    }

    @Override
    public void enterChrome() {}

    @Override
    public void closeChrome() {}

    @Override
    public void enterPlatMarket() {}

    @Override
    public void closePlatMarket() {}
}
