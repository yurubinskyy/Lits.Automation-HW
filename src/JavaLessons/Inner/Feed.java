package Inner;

public class Feed {
    private String animal;
    private Food food;

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void feed() {
        int i = 3;


        class Validate {
            boolean validate(String animal, double weight) {
                if ("Lion".equals(animal)) {
                    if (i > weight) {
                        System.out.println("Lion needs more meat");
                        return false;
                    }
                }
                return true;
            }
        }
        Validate validation = new Validate();
        if (validation.validate(animal, food.getWeight())) {
            System.out.println("enough food");
        }
        System.out.println(" omnonon");
    }

    public class Food {
        private String type;
        private double weight;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public void validate() {
            System.out.println(animal + " - really like " + type);

        }
    }
}
