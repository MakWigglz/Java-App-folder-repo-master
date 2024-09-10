public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
class Mind {
    private Part1 part1;
    private Part2 part2;
    private Part3 part3;
    private Part4 part4;

    public Mind() {
        // Initialize the parts here
        part1 = new Part1("Memory");
        part2 = new Part2("Thinking&Feeling");
        part3 = new Part3("I am Body/Mind");
        part4 = new Part4("Intellect");
    }


    // Define getters and setters for the parts
    public Part1 getPart1() {
        return part1;
    }

    public void setPart1(Part1 part1) {
        this.part1 = part1;
    }

    public Part2 getPart2() {
        return part2;
    }

    public void setPart2(Part2 part2) {
        this.part2 = part2;
    }

    public Part3 getPart3() {
        return part3;
    }

    public void setPart3(Part3 part3) {
        this.part3 = part3;
    }

    public Part4 getPart4() {
        return part4;
    }

    public void setPart4(Part4 part4) {
        this.part4 = part4;
    }

    // Define other methods for the Mind class
}

class Part1 {
    // Implementation for Part 1
}

class Part2 {
    // Implementation for Part 2
}

class Part3 {
    // Implementation for Part 3
}

class Part4 {
    // Implementation for Part 4
}