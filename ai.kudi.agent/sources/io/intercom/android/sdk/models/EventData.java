package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.models.EventParticipant;
/* loaded from: classes3.dex */
public class EventData implements Parcelable {
    private final String eventAsPlainText;
    private final EventParticipant participant;
    public static final EventData NULL = new EventData(new Builder());
    public static final Parcelable.Creator<EventData> CREATOR = new Parcelable.Creator<EventData>() { // from class: io.intercom.android.sdk.models.EventData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EventData createFromParcel(Parcel parcel) {
            return new EventData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EventData[] newArray(int i) {
            return new EventData[i];
        }
    };

    /* loaded from: classes3.dex */
    public static final class Builder {
        String eventAsPlainText;
        EventParticipant.Builder participant;

        public EventData build() {
            return new EventData(this);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getEventAsPlainText() {
        return this.eventAsPlainText;
    }

    public EventParticipant getParticipant() {
        return this.participant;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.participant);
        parcel.writeString(this.eventAsPlainText);
    }

    private EventData(Builder builder) {
        EventParticipant.Builder builder2 = builder.participant;
        this.participant = builder2 == null ? EventParticipant.NULL : builder2.build();
        String str = builder.eventAsPlainText;
        this.eventAsPlainText = str == null ? "" : str;
    }

    protected EventData(Parcel parcel) {
        this.participant = (EventParticipant) parcel.readValue(EventParticipant.class.getClassLoader());
        this.eventAsPlainText = parcel.readString();
    }
}
