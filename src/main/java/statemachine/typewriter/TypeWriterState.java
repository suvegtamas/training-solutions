package statemachine.typewriter;

public enum TypeWriterState {
    LOWERCASE {
        @Override
        public TypeWriterState next() {
            return UPPERCASE;
        }
    }, UPPERCASE {
        @Override
        public TypeWriterState next() {
            return LOWERCASE;
        }
    };
    abstract public TypeWriterState next();
}
