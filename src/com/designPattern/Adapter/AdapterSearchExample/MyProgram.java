package com.designPattern.Adapter.AdapterSearchExample;

public class MyProgram {
    private SearchButton searchButton = new SearchButton(this);
    // 모듈의 상호 교체가
    public void setModeALL() {searchButton.setSearchStrategy(new SearchStrategyAll());}
    public void setModeImage() {
        searchButton.setSearchStrategy(new SearchStrategyImage());
    }
    public void setModeNews() { searchButton.setSearchStrategy(new SearchStrategyNews());}
    public void setModeMap() {
        searchButton.setSearchStrategy(new SearchStrategyMap());
    }

    public void setModeMovie() {
        searchButton.setSearchStrategy(new SearchFindAdapter(new FindMovieAlgorithm()));
    }

    public void testProgram(){
        searchButton.onClick();
        setModeImage();
        searchButton.onClick();
        setModeMap();
        searchButton.onClick();
        setModeNews();
        searchButton.onClick();
        setModeALL();
        searchButton.onClick();
        setModeMovie();
        searchButton.onClick();
    }
}
