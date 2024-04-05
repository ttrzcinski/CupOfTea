package com.ttrzcinski;

class CupOfTea {

    ICup getCup() {
        return null;
    }
    ILiquid getLiquid() {
        return null;
    }

    IBag getBag() {
        return null;
    }

    CupOfTeaBuilder builder() {
        return new CupOfTeaBuilder();
    }

    public class CupOfTeaBuilder {

        public ICupBaseStep withCup(Cup cup) {
            // TODO Auto-generated method stub
            return null;
        }
    }
}