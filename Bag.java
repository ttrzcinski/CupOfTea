package com.ttrzcinski;

public class Bag implements IBag {

    private String taste;

    public Bag(String taste) {
        this.taste = taste;
	}

	@Override
    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String getTaste() {
        return this.taste;
    }

}
