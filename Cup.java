package com.ttrzcinski;

public class Cup implements ICup {

    private boolean icon;

    public Cup(boolean b) {
        this.icon = b;
	}

	@Override
    public boolean isIcon() {
        return this.icon;
    }

    @Override
    public void setIcon(boolean icon) {
        this.icon = icon;
    }

}
