package adapter.adapter2;

import adapter.adapter1.Banner;

public class PrintBanner extends Print {
    private Banner banner; // 위임 객체

    public PrintBanner(String title) {
        banner = new Banner(title);
    }

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }


//    public PrintBanner(String string) {
//        this.banner = new Banner(string);
//    }

    @Override
    public void printWeak() {
        banner.showWithParen(); // 기능 위임
    }

    @Override
    public void printStrong() {
        banner.showWithAster(); // 기능 위임
    }
}
