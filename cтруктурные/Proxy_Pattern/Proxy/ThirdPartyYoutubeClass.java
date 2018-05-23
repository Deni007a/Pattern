package cтруктурные.Proxy_Pattern.Proxy;

import java.util.HashMap;

// Конкретная реализация сервиса. Методы этого класса
// запрашивают у ютуба различную информацию. Скорость
// запроса зависит от интернет-канала пользователя и
// состояния самого ютуба. Чем больше будет вызовов к
// сервису, тем менее отзывчивой будет программа.

public class ThirdPartyYoutubeClass implements ThirdPartyYoutubeLib {
    // Получить список видеороликов
    @Override
    public HashMap<String, Video> popularVideos() {
        connectToServer("http://www.типаЮтуб.com");
        return getRandomVideos();
    }

    // Получить детальную информацию о каком-то видеоролике.
    @Override
    public Video getVideo(String videoId) {
        connectToServer("http://www.типаЮтуб.com/" + videoId);
        return getSomeVideo(videoId);
    }

    // -----------------------------------------------------------------------
    // Fake methods to simulate network activity. They as slow as a real life.
    //Поддельные методы для имитации сетевой активности.
    // Они так же медленны, как и в реальной жизни

    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    private void experienceNetworkLatency() {
        int randomLatency = random(5, 10);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency();
        System.out.print("Connected!" + "\n");
    }

    private HashMap<String, Video> getRandomVideos() {
        System.out.print("Downloading populars... ");

        experienceNetworkLatency();
        HashMap<String, Video> hmap = new HashMap<String, Video>();
        hmap.put("catzzzzzzzzz", new Video("sadgahasgdas", "Catzzzz.avi"));
        hmap.put("mkafksangasj", new Video("mkafksangasj", "Dog play with ball.mp4"));


        System.out.print("Done!" + "\n");
        return hmap;
    }

    private Video getSomeVideo(String videoId) {
        System.out.print("Downloading video... ");

        experienceNetworkLatency();
        Video video = new Video(videoId, "Some video title");

        System.out.print("Done!" + "\n");
        return video;
    }

}