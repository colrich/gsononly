package io.pivotal.jacksonless;


public class SomeDomainObject {
    String aoeu;
    String oeuoeu;

    public SomeDomainObject(String aoeu, String oeuoeu) {
        this.aoeu = aoeu;
        this.oeuoeu = oeuoeu;
    }

    public String getAoeu() { return aoeu; }
    public void setAoeu(String aoeu) { this.aoeu = aoeu; }

    public String getOeuoeu() { return oeuoeu; }
    public void setOeuoeu(String oeuoeu) { this.oeuoeu = oeuoeu; }

    @Override
    public String toString() {
        return "SomeDomainObject / Aoeu is " + getAoeu() + " / Oeuoeu is " + getOeuoeu();
    }
}