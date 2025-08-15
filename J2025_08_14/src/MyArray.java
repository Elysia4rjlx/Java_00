class MyArray<T> {
    public Object[] array = new Object[10];

    public T getPos(int pos) {
        return (T)this.array[pos];
    }

    public void setVal(int pos, T val) {
        this.array[pos] = val;
    }


}

