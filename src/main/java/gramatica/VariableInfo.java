package gramatica;

class VariableInfo {
    private Object value;
    private boolean initialized;

    public VariableInfo(Object value, boolean initialized) {
        this.value = value;
        this.initialized = initialized;
    }

    public Object getValue() {
        return value;
    }

    public boolean isInitialized() {
        return initialized;
    }

    public void setValue(Object value) {
        this.value = value;
        this.initialized = true;
    }
}