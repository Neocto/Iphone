public class iphone implements telephoneSet, musicPlayer, internetBrowser{
    private String model;

    public iphone(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

//métodos telephoneSet
    @Override
    public void call(String number){
        System.out.println("Ligando para o número: " + number);
    }
    @Override 
    public void answer(){
        System.out.println("Atendendo a ligação...");
    }
    @Override 
    public void startVoicemail(){
        System.out.println("Iniciando correio de voz...");
    }

//métodos musicPlayer
    @Override
    public void selectMusic(String music){
        System.out.println("Tocando a música: " + music);
    }
    @Override 
    public void pause(){
        System.out.println("Pausando a música.");
    }
    @Override 
    public void playMusic(){
        System.out.println("Tocando a música.");
    }
//métodos internetBrowser
    @Override
    public void showPage(String url){
        System.out.println("Mostrando página: " + url);
    }
    @Override 
    public void addNewPage(){
        System.out.println("Adicionando página...");
    }
    @Override 
    public void updatePage(){
        System.out.println("Atualizando página...");
    }

}
