package Program;

public class WrapperFactory {

    public Wrapper createWrapper(Wrapper.Type type) {
        Wrapper wrapper = null;

        switch (type){
            case PAPER -> {
                wrapper = new Wrapper(Wrapper.Type.PAPER, 1.0);
                break;
            }
            case CELLOPHANE -> {
                wrapper = new Wrapper(Wrapper.Type.CELLOPHANE, 0.2);
                break;
        }
            case CRAFT_PAPER -> {
                wrapper = new Wrapper(Wrapper.Type.CRAFT_PAPER, 1.5);
                break;
            }

        }
        return wrapper;
    }
}
