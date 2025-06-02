package org.example;

public class DogFactResponse {
    private boolean success;
    private String[] facts;

    public boolean isSuccess() { return success; }
    public String[] getFacts() { return facts; }
    public String getFirstFact() {
        return (facts != null && facts.length > 0) ? facts[0] : null;
    }
}
