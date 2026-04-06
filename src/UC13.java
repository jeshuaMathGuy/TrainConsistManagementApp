import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    String type; // e.g., "Passenger" or "Goods"
    int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }
}

public class UC13{

    public static void main(String[] args) {
        // Prepare a large collection of bogies
        List<Bogie> bogies = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            bogies.add(new Bogie(i % 2 == 0 ? "Passenger" : "Goods", i % 200 + 1));
        }

        // --- Loop-based filtering ---
        long loopStart = System.nanoTime();
        List<Bogie> passengerBogiesLoop = new ArrayList<>();
        for (Bogie bogie : bogies) {
            if ("Passenger".equals(bogie.getType())) {
                passengerBogiesLoop.add(bogie);
            }
        }
        long loopEnd = System.nanoTime();
        long loopDuration = loopEnd - loopStart;
        System.out.println("Loop-based filtering took: " + loopDuration + " ns");

        // --- Stream-based filtering ---
        long streamStart = System.nanoTime();
        List<Bogie> passengerBogiesStream = bogies.stream()
                .filter(b -> "Passenger".equals(b.getType()))
                .collect(Collectors.toList());
        long streamEnd = System.nanoTime();
        long streamDuration = streamEnd - streamStart;
        System.out.println("Stream-based filtering took: " + streamDuration + " ns");

        // Optional: Compare results to ensure correctness
        System.out.println("Loop size: " + passengerBogiesLoop.size());
        System.out.println("Stream size: " + passengerBogiesStream.size());
    }
}