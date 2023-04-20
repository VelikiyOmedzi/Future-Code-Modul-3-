package HomeWork1;

import HomeWork1.Metal;

public class Sword <T extends Metal> {
    private T t;

    public void MakeSword(T t) {
        this.t = t;
    }

    public boolean testEndurance() {
        if(this.t.getEndurance() < 50) return false;
        return true;
    }
}
