import javax.management.ListenerNotFoundException;
import java.util.Arrays;

public class MyArrayList implements ISeqList {

    public int[] elem;
    public int usedSize;//表长
    public static final int DEFAULT_CAPACITY = 5;//默认容量

    public MyArrayList() {
        elem = new int[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initCapacity) {
        elem = new int[initCapacity];
    }

    @Override
    public void add(int data) {

        if (isFull()) {
            grow();
        }
        elem[usedSize] = data;
        usedSize++;
    }

    private void grow() {
        elem = Arrays.copyOf(elem, 2 * elem.length);
    }

    @Override
    public boolean isFull() {
        return usedSize == elem.length;
    }

    @Override
    public void add(int pos, int data) {
        if (isFull()) {
            grow();
        }
        for (int i = usedSize - 1; i >= pos; i++) {
            elem[i + 1] = elem[i];
        }
        elem[pos] = data;
        usedSize++;
    }

    private void checkPos(int pos) {
        if (pos < 0 || pos > usedSize) {
            throw new PosOutOfBoundsException("添加元素时pos位置不合法：" + pos);
        }
    }

    @Override
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if (elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    @Override
    // 查找某个元素对应的位置
    public int indexOf(int toFind) {
        for (int i = 0; i < usedSize; i++) {
            if (elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    @Override
    // 获取 pos 位置的元素
    public int get(int pos) {
        checkPosByGetOrSet(pos);
        if (isEmpty()) {
            throw new ListEmptyException("获取元素时，顺序表为空...");
        }
        return elem[pos];
    }

    private void checkPosByGetOrSet(int pos) {
        if (pos < 0 || pos >= usedSize) {
            throw new PosOutOfBoundsException("获取元素时pos位置不合法：" + pos);
        }
    }

    @Override
    public void set(int pos, int value) {
        checkPosByGetOrSet(pos);
        elem[pos] = value;

    }

    @Override
    public void remove(int toRemove) {
        int index = indexOf(toRemove);
        if (index == -1) {
            System.out.println("没有你想要删除的元素...");
            return;
        }
        for (int i = index; i < usedSize - 1; i++) {
            elem[i] = elem[i + 1];
        }
        usedSize--;
    }

    @Override
    public int size() {
        return usedSize;
    }

    @Override
    public void clear() {
        usedSize = 0;
    }

    @Override
    public void display() {
        for (int i = 0; i < usedSize; i++) {
            System.out.print(elem[i] + " ");
        }
        System.out.println();
    }


    @Override
    public boolean isEmpty() {
        return usedSize == 0;
    }
}
