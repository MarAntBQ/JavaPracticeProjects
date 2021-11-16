package com.MarcoAntonio;

public class MediaDownloader {
    public interface DownloadListener {
        void onMediaDownloaded(String content);
    }

    public  static void download(String mediaTitle,DownloadListener downloadListener) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Downloading...." + mediaTitle);
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Downloaded...." + mediaTitle); 
                String content = "Cangrejos Saltarines, si que sus joyas se ven hermosas";
                downloadListener.onMediaDownloaded(content);
            }
        });
        thread.start();
    }
}
