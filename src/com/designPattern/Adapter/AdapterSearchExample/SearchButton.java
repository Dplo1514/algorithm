package com.designPattern.Adapter.AdapterSearchExample;

public class SearchButton {
    private MyProgram myProgram;
    private SearchStrategy searchStrategy = new SearchStrategyAll();
    public SearchButton (MyProgram _myProgram){
        myProgram = _myProgram;
    }

    public void setSearchStrategy(SearchStrategy _searchStrategy) {
        this.searchStrategy = _searchStrategy;
    }
    public void onClick(){
        searchStrategy.search();
    }
}
