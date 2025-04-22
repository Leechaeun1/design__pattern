package adapter.adapter1;

// 어댑터 역할1 : 상속 이용
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        // super(); => 에러
        super(string);
    }

    //wrapping
    @Override
    public void printWeak() {
        showWithParen();

    }

    //wrapping
    @Override
    public void printStrong() {
        showWithAster();

    }
}
