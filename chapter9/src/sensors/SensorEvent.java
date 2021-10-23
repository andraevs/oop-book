package sensors;

import java.time.LocalDate;

public class SensorEvent {
  private LocalDate timestamp;
  private String location;
  private EventType type;

  public SensorEvent(LocalDate timestamp, String location, EventType type) {
    this.timestamp = timestamp;
    this.location = location;
    this.type = type;
  }

  @Override
  public String toString() {
    return "SensorEvent{" +
            "location='" + location + '\'' +
            ", type=" + type +
            '}';
  }
}
