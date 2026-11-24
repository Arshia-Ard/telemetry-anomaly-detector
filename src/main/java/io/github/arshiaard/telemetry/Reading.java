package io.github.arshiaard.telemetry;

public class Reading {
    private final String channel;
    private final long timestamp;
    private final double value;

    public Reading(String channel, long timestamp, double value) {
        this.channel = channel;
        this.timestamp = timestamp;
        this.value = value;
    }

    public String getChannel() {
        return channel;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Reading{Channel:" + channel + ",timestamp:" + timestamp + ", value=" + value + "}";

    }

    public static void main(String[] args) {
        Reading r = new Reading("Cpu_temp", 1222, 72.5);
        System.out.println(r);
    }
}


