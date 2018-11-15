package iterator;

/**
 * Created by Administrator on 2016/12/30 0030.
 */
public class NameRepository implements Container {
    public String[] name = {"Robert", "John", "Julie", "Lora"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < name.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return name[index++];
            }
            return null;
        }
    }
}
