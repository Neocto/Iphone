public class App {
    public static void main(String[] args) throws Exception {
        iphone myIphone = new iphone("Iphone X");

        System.out.println("---- Telephone Set ----");
        myIphone.call("11 23333-4444");
        myIphone.answer();
        myIphone.startVoicemail();

        System.out.println("---- Music Player ----");
        myIphone.selectMusic("Starset - Dark on me");
        myIphone.pause();
        myIphone.playMusic();

        System.out.println("---- Internet Browser ----");
        myIphone.showPage("www.google.com");
        myIphone.addNewPage();
        myIphone.updatePage();

    }
}
