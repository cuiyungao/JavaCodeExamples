package iteratorPattern;

public abstract class Iterator {
    public abstract Object First();
    public abstract void Next();
    public abstract boolean isDone();
    public abstract Object CurrentItem();
}
