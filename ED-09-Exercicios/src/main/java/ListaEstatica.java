public class ListaEstatica {
    int[] vect;
    int numElement;

    public ListaEstatica(int sizeVect) {
        this.vect = new int[sizeVect];
        this.numElement = 0;
    }

    public boolean addVect(int number) {
        if (numElement < vect.length) {
            vect[numElement++] = number;
            return true;
        } else {
            return false;
        }
    }

    public void showVect() {
        for (int i = 0; i < numElement; i++) {
            System.out.println(String.format("Valor[%d]: %d", i, vect[i]));
        }
    }

    public int search(int element) {
        int i = 0;
        int index = -1;
        for (int item : vect) {
            ++i;
            if (item == element) {
                index = (i - 1);
            }
        }
        return index;
    }

    // Retorna com sujeira.
//    public boolean removeByIndex(int index) {
//        if (index < 0 || index >= numElement) {
//            return false;
//        }
//        else {
//            for (int i = index; i < numElement-1; i++) {
//                vect[i] = vect[i+1];
//            }
//            numElement--;
//            return true;
//        }
//    }

    // Retorna limpo.
    public boolean removeByIndex(int index) {
        if (index < vect.length) {
            numElement--;
            int newIndex = 0;
            int[] newVect = new int[vect.length - 1];
            for (int i = 0; i < vect.length; i++) {
                if (i != index) {
                    newVect[newIndex++] = vect[i];
                }
            }
            this.vect = newVect;
            return true;
        }
        return false;
    }

    public boolean removeByElement(int element){
        if (search(element) != -1){
            return removeByIndex(search(element));
        }
        return false;
    }
}
