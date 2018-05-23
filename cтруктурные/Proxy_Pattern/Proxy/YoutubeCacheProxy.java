package cтруктурные.Proxy_Pattern.Proxy;

import java.util.HashMap;
//Сервисный класс для работы с кешем
public class YoutubeCacheProxy implements ThirdPartyYoutubeLib {
        // оригинальный обект
    private ThirdPartyYoutubeLib youtubeService;

    private HashMap<String, Video> cachePopular = new HashMap<String, Video>();
    private HashMap<String, Video> cacheAll = new HashMap<String, Video>();

    // в конструкторе иницируем оригинал

    public YoutubeCacheProxy() {
        this.youtubeService = new ThirdPartyYoutubeClass();
    }

    @Override
    public HashMap<String, Video> popularVideos() {
        // если молекия кеш полпуя пустая то    взять ее из оригиналного обекта
        if (cachePopular.isEmpty()) {
            cachePopular = youtubeService.popularVideos();
        } else {
            System.out.println("Получить список из кеша");
        }
        return cachePopular;
    }

    @Override
    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if (video == null) {
            video = youtubeService.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
        }
        return video;
    }

    public void reset() {
        cachePopular.clear();
        cacheAll.clear();
    }
}