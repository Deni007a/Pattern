package cтруктурные.Proxy_Pattern.Proxy;

import java.util.HashMap;
//    общий Интерфейс удалённого сервиса видео сервиса
//  кеширующий заместитель

public interface ThirdPartyYoutubeLib {

    public HashMap<String, Video> popularVideos();

    public Video getVideo(String videoId);
}
