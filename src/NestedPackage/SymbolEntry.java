package NestedPackage;

public class SymbolEntry<T> {
	public T symbol;
    public int offset;
    public int size;

    public SymbolEntry(T symbol, int offset, int size) {
        this.symbol = symbol;
        this.offset = offset;
        this.size = size;
    }
    
    public String toString() {
        return "Entry at " + offset +
                ", size " + size +
                "value: " + symbol;
    }
}