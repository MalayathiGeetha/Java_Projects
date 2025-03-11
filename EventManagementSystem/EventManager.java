
import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private List<Event> events;
    private List<Participant> participants;

    public EventManager() {
        events = new ArrayList<>();
        participants = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void displayEvents() {
        for (Event event : events) {
            System.out.println(event);
        }
    }

    public Event findEventById(int eventId) {
        for (Event event : events) {
            if (event.getEventId() == eventId) {
                return event;
            }
        }
        return null;
    }

    public void registerParticipant(String participantName, int eventId) {
        Event event = findEventById(eventId);
        if (event != null) {
            if (event.registerParticipant()) {
                participants.add(new Participant(participantName, eventId));
                System.out.println("Participant " + participantName + " successfully registered for event " + eventId);
            } else {
                System.out.println("Event is full. Cannot register more participants.");
            }
        } else {
            System.out.println("Event not found.");
        }
    }

    public void cancelRegistration(String participantName, int eventId) {
        Event event = findEventById(eventId);
        if (event != null) {
            Participant participantToRemove = null;
            for (Participant participant : participants) {
                if (participant.getParticipantName().equals(participantName) && participant.getEventId() == eventId) {
                    participantToRemove = participant;
                    break;
                }
            }

            if (participantToRemove != null) {
                event.cancelParticipant();
                participants.remove(participantToRemove);
                System.out.println("Registration canceled for " + participantName + " from event " + eventId);
            } else {
                System.out.println("Participant not found.");
            }
        } else {
            System.out.println("Event not found.");
        }
    }

    public void displayParticipantsForEvent(int eventId) {
        System.out.println("Participants for event ID: " + eventId);
        for (Participant participant : participants) {
            if (participant.getEventId() == eventId) {
                System.out.println(participant);
            }
        }
    }
}