package com.designpatten.proxy.downloader;

import com.designpatten.proxy.cool_library.ThirdPartyYoutubeImpl;
import com.designpatten.proxy.proxy.YoutubeCacheProxy;

public class Demo {
    public static void main(String[] args) {
        var naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeImpl());
        var smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());
        long naive = testDownloader(naiveDownloader);
        long smart = testDownloader(smartDownloader);

        System.out.println("naive: " + naive);
        System.out.println("smart: " + smart);
    }

    private static long testDownloader(YoutubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }

}
