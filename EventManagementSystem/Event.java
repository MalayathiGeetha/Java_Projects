

public class Event {
    private int eventId;
    private String eventName;
    private String eventDate; // e.g., "2024-12-01"
    private String eventLocation;
    private int maxParticipants;
    private int registeredParticipants;

    public Event(int eventId, String eventName, String eventDate, String eventLocation, int maxParticipants) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLocation = eventLocation;
        this.maxParticipants = maxParticipants;
        this.registeredParticipants = 0;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public int getRegisteredParticipants() {
        return registeredParticipants;
    }

    public boolean registerParticipant() {
        if (registeredParticipants < maxParticipants) {
            registeredParticipants++;
            return true;
        } else {
            return false;
        }
    }

    public void cancelParticipant() {
        if (registeredParticipants > 0) {
            registeredParticipants--;
        }
    }

    @Override
    public String toString() {
        return "Event ID: " + eventId + ", Name: " + eventName + ", Date: " + eventDate + 
               ", Location: " + eventLocation + ", Max Participants: " + maxParticipants + 
               ", Registered: " + registeredParticipants;
    }
}
