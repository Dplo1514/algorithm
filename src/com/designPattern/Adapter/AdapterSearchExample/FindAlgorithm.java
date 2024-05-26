package com.designPattern.Adapter.AdapterSearchExample;

interface FindAlgorithm {
    void find(boolean global);
}

class FindMovieAlgorithm implements FindAlgorithm{
    @Override
    public void find(boolean global) {
        System.out.println("find Movie" + (global ? "globally" : ""));
    }
}
