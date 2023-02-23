package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.utilities.NameUtils;
import io.intercom.android.sdk.utilities.NullSafety;
/* loaded from: classes3.dex */
public abstract class Participant implements Parcelable {
    public static final String ADMIN_TYPE = "admin";
    static final String USER_TYPE = "user";
    public static final Participant NULL = create("", "", "", "", Avatar.create("", ""), Boolean.FALSE);
    public static final Parcelable.Creator<Participant> CREATOR = new Parcelable.Creator<Participant>() { // from class: io.intercom.android.sdk.models.Participant.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Participant createFromParcel(Parcel parcel) {
            return Participant.create(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Avatar) parcel.readValue(Avatar.class.getClassLoader()), Boolean.valueOf(parcel.readByte() == 0));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Participant[] newArray(int i) {
            return new Participant[i];
        }
    };

    /* loaded from: classes3.dex */
    public static final class Builder {
        Avatar.Builder avatar;
        String email;

        /* renamed from: id */
        String f23914id;
        Boolean is_bot;
        String name;
        String type;

        public Participant build() {
            Avatar build;
            String str = this.type;
            if (str == null) {
                str = Participant.USER_TYPE;
            }
            String str2 = str;
            String valueOrEmpty = NullSafety.valueOrEmpty(this.name);
            String valueOrEmpty2 = NullSafety.valueOrEmpty(this.email);
            String initial = NameUtils.getInitial(valueOrEmpty.isEmpty() ? valueOrEmpty2 : valueOrEmpty);
            Avatar.Builder builder = this.avatar;
            if (builder == null) {
                build = Avatar.create("", initial);
            } else {
                build = builder.withInitials(initial).build();
            }
            return Participant.create(NullSafety.valueOrEmpty(this.f23914id), valueOrEmpty, str2, valueOrEmpty2, build, Boolean.valueOf(NullSafety.valueOrDefault(this.is_bot, false)));
        }

        public Builder withEmail(String str) {
            this.email = str;
            return this;
        }

        public Builder withId(String str) {
            this.f23914id = str;
            return this;
        }

        public Builder withIsBot(boolean z) {
            this.is_bot = Boolean.valueOf(z);
            return this;
        }

        public Builder withName(String str) {
            this.name = str;
            return this;
        }

        public Builder withType(String str) {
            this.type = str;
            return this;
        }
    }

    public static Participant create(String str, String str2, String str3, String str4, Avatar avatar, Boolean bool) {
        return new AutoValue_Participant(str, str2, str3, str4, avatar, bool);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract Avatar getAvatar();

    public abstract String getEmail();

    public String getForename() {
        return nameOrEmail().trim().split(" ")[0];
    }

    public abstract String getId();

    public abstract String getName();

    public abstract String getType();

    public boolean isAdmin() {
        return ADMIN_TYPE.equals(getType());
    }

    public abstract Boolean isBot();

    public boolean isUserWithId(String str) {
        return USER_TYPE.equals(getType()) && getId().equals(str);
    }

    String nameOrEmail() {
        return getName().isEmpty() ? getEmail() : getName();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getId());
        parcel.writeString(getName());
        parcel.writeString(getType());
        parcel.writeString(getEmail());
        parcel.writeValue(getAvatar());
        parcel.writeByte(isBot().booleanValue() ? (byte) 1 : (byte) 0);
    }
}
