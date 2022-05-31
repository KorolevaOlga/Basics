package flovers.flowers.src.Program;

public class WrapperFactory {

    public Wrapper createWrapper(int numberPaper) {
        Wrapper wrapper = null;

        switch (numberPaper) {
            case 1 -> {
                wrapper = new Wrapper(Wrapper.Type.PAPER, 1.0);
                break;
            }
            case 2 -> {
                wrapper = new Wrapper(Wrapper.Type.CELLOPHANE, 0.2);
                break;
            }
            case 3 -> {
                wrapper = new Wrapper(Wrapper.Type.CRAFT_PAPER, 1.5);
                break;
            }

        }
        return wrapper;
    }
}
