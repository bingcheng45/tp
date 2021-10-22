package seedu.address.testutil;

import static seedu.address.testutil.TypicalPassportNumbers.PASSPORT_NUMBER_DEFAULT;

import java.util.Set;

import seedu.address.model.commonattributes.Email;
import seedu.address.model.guest.Guest;
import seedu.address.model.commonattributes.Name;
import seedu.address.model.guest.PassportNumber;
import seedu.address.model.guest.RoomNumber;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

public class GuestBuilder extends PersonBuilder {
    public static final RoomNumber DEFAULT_ROOM_NUMBER = new RoomNumber("10101");
    public static final PassportNumber DEFAULT_PASSPORT_NUMBER = new PassportNumber(PASSPORT_NUMBER_DEFAULT.toString());
    private static final Tag DEFAULT_TAG = new Tag("Guest");

    private RoomNumber roomNumber;
    private PassportNumber passportNumber;

    /**
     * Creates a {@code GuestBuilder} with the default details.
     */
    public GuestBuilder() {
        super();
        roomNumber = DEFAULT_ROOM_NUMBER;
        passportNumber = DEFAULT_PASSPORT_NUMBER;
        getTags().add(DEFAULT_TAG);
    }

    /**
     * Initializes the GuestBuilder with the data of {@code guestToCopy}.
     */
    public GuestBuilder(Guest guestToCopy) {
        super(guestToCopy);
        roomNumber = guestToCopy.getRoomNumber();
        passportNumber = guestToCopy.getPassportNumber();
    }

    /**
     * Sets the {@code Name} of the {@code Guest} that we are building.
     */
    public GuestBuilder withName(String name) {
        setName(new Name(name));
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Guest} that we are building.
     */
    public GuestBuilder withTags(String... tags) {
        Set<Tag> guestTag = SampleDataUtil.getTagSet(tags);
        guestTag.add(new Tag("Guest"));
        setTags(guestTag);
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code Guest} that we are building.
     */
    public GuestBuilder withEmail(String email) {
        setEmail(new Email(email));
        return this;
    }

    /**
     * Sets the {@code RoomNumber} of the {@code Guest} that we are building.
     */
    public GuestBuilder withRoomNumber(String roomNumber) {
        this.roomNumber = new RoomNumber(roomNumber);
        return this;
    }

    /**
     * Sets the {@code PassportNumber} of the {@code Guest} that we are building.
     */
    public GuestBuilder withPassportNumber(String passportNumber) {
        this.passportNumber = new PassportNumber(passportNumber);
        return this;
    }


    public Guest build() {
        return new Guest(getName(), getEmail(), getTags(), roomNumber, passportNumber);
    }
}
