package edu.nus.cbr.cases.attributetypes;

/**
 * Created by Shutao on 30/6/2017.
 */
public enum NoOfIngredientsAttr implements BasicAttr {
    LESSTHREE(0),
    THREESEVEN(0.5),
    MORESEVEN(1);

    private Double num;

    NoOfIngredientsAttr(double i) {
        this.num = i;
    }

    public Double getNum() {
        return this.num;
    }

    public static NoOfIngredientsAttr permissiveValueOf(Integer number) {
        if (number == null) {
            return null;
        }
        if (number <= 3) {
            return NoOfIngredientsAttr.LESSTHREE;
        } else if (number > 3 && number <= 7) {
            return NoOfIngredientsAttr.THREESEVEN;
        } else {
            return NoOfIngredientsAttr.MORESEVEN;
        }
    }
}
