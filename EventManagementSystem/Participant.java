

public class Participant {
    private String participantName;
    private int eventId;

    public Participant(String participantName, int eventId) {
        this.participantName = participantName;
        this.eventId = eventId;
    }

    public String getParticipantName() {
        return participantName;
    }

    public int getEventId() {
        return eventId;
    }

    @Override
    public String toString() {
        return "Participant: " + participantName + ", Event ID: " + eventId;
    }
}
