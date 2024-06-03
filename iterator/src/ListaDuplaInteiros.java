import java.util.ListIterator;

public class ListaDuplaInteiros implements Iterable<Integer> {
    private NoListaDupla pre;
    private NoListaDupla post;
    private int n;

    public ListaDuplaInteiros() {
        pre = new NoListaDupla(0);
        post = new NoListaDupla(0);
        pre.setProx(post);
        post.setAnt(pre);
        n = 0;
    }

    public void add(Integer info) {
        NoListaDupla novo = new NoListaDupla(info);
        NoListaDupla ultimo = post.getAnt();
        novo.setProx(post);
        novo.setAnt(ultimo);
        post.setAnt(novo);
        ultimo.setProx(novo);
        n++;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("");
        ListIterator<Integer> iterator = this.iterator();
        while (iterator.hasNext()) {
            s.append(iterator.next().toString() + " ");
        }
        return s.toString();
    }

    @Override
    public ListIterator<Integer> iterator() {
        return new ListaDuplaIterator();
    }

    private class ListaDuplaIterator implements ListIterator<Integer> {

        private NoListaDupla atual;
        private int index;

        public ListaDuplaIterator() {
            atual = pre.getProx();
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < n;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                Integer info = atual.getInfo();
                atual = atual.getProx();
                index++;
                return info;
            }

            return null;
        }

        @Override
        public boolean hasPrevious() {
            return index > 0;
        }

        @Override
        public Integer previous() {
            if (hasPrevious()) {
                Integer info = atual.getAnt().getInfo();
                atual = atual.getAnt();
                index--;
                return info;
            }

            return null;
        }

        @Override
        public int nextIndex() {
            return index;
        }

        @Override
        public int previousIndex() {
            return index - 1;
        }

        @Override
        public void remove() {
            // Não implementado
        }

        @Override
        public void set(Integer e) {
            // Não implementado
        }

        @Override
        public void add(Integer e) {
            NoListaDupla x = atual.getAnt();
            NoListaDupla y = new NoListaDupla(e);
            NoListaDupla z = atual;
            x.setProx(y);
            y.setAnt(x);
            z.setAnt(y);
            y.setProx(z);
            n++;
            index++;
        }
    }
}
