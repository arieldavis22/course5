package CompositionChallenge;

public class Bed {
    private String size;
    private boolean hasFrame;

    public Bed(String size, boolean hasFrame) {
        this.size = size;
        this.hasFrame = hasFrame;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasFrame() {
        return hasFrame;
    }
}
