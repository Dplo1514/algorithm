package com.designPattern.Adapter.AdapterSearchExample;

public class SearchFindAdapter implements SearchStrategy{

    private FindAlgorithm findAlgorithm;

    public SearchFindAdapter(FindAlgorithm _findAlgorithm) {
        this.findAlgorithm = _findAlgorithm;
    }

    @Override
    public void search() {
        findAlgorithm.find(true);
    }
}
