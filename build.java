public class build extends MainApp {
    static void PresentationAndroid(Smartphones A) {
        A.modelPhone();
        A.call();
        A.sms();
        A.internet();
        A.enterChrome();
        A.search();
        A.closeChrome();
        A.enterPlatMarket();
        A.downloadApp();
        A.closePlatMarket();
        System.out.println("------------------------");

    }

    static void PresentationIphone(Smartphones I) {
        I.modelPhone();
        I.call();
        I.sms();
        I.internet();
        I.enterSafari();
        I.search();
        I.closeSafari();
        I.enterAppStore();
        I.downloadApp();
        I.closeAppstore();
        System.out.println("------------------------");


    }
}
