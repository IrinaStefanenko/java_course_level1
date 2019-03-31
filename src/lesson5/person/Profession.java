package lesson5.person;

public abstract class Profession {

    protected String name;

    protected Profession(String name) {
        this.name = name;
    }

    public abstract void job();

    public String getName() {
        return name;
    }

    public static Profession create() {
        return new SEO("");
    }

    private static class SEO extends Profession {

        protected SEO(String name) {
            super(name);
        }

        @Override
        public void job() {

        }
    }

}
