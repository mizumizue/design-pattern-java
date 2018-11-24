package com.trewanek.designpattern.adaptertransfer;

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}