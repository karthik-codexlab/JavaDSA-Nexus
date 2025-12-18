package java_design_patterns.creational;

public class BuilderPattern {

    private final String orderId;
    private final String restaurant;
    private final boolean isPriority;

    private BuilderPattern(Builder builder) {
        this.orderId = builder.orderId;
        this.restaurant = builder.restaurant;
        this.isPriority = builder.isPriority;
    }

    static class Builder {
        private String orderId;
        private String restaurant;
        private boolean isPriority;

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder restaurant(String restaurant) {
            this.restaurant = restaurant;
            return this;
        }

        public Builder priority(boolean priority) {
            this.isPriority = priority;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
    }
}
