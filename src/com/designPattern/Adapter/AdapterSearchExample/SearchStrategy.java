package com.designPattern.Adapter.AdapterSearchExample;


// option들 마다의 행동을 모듈화해서 독립적이고 상호 교체가능하게 만든다.
public interface SearchStrategy {
    void search();
}
// 독립된 모듈
class SearchStrategyAll implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("Search ALL");
    }
//    public void search(){
//        System.out.println("Search ALL");
//    }
}
class SearchStrategyImage implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("Search IMAGE");
    }
}
class SearchStrategyNews implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("Search NEWS");
    }
}
class SearchStrategyMap implements SearchStrategy {
    @Override
    public void search() {
        System.out.println("Search MAP");
    }
}
