# Iphone UML

```mermaid
    classDiagram
    Iphone <|-- TelephoneSet
    Iphone <|-- MusicPlayer
    Iphone <|-- InternetBrowser
    Iphone: +call(String number)
    Iphone: +answer()
    Iphone: +startVoicemail()
    Iphone: +selectMusic(String music)
    Iphone: +pause()
    Iphone: +playMusic()
    Iphone: +showPage(String url)
    Iphone: +addNewPage()
    Iphone: +updatePage()

    class TelephoneSet{
      +call(String number)
      +answer()
      +startVoicemail()
    }
    class MusicPlayer{
       +selectMusic(String music)
       +pause()
       +playMusic()
    }
    class InternetBrowser{
        +showPage(String url)
        +addNewPage()
        +updatePage()
    }
    ```
