package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.utilities.NullSafety;
/* loaded from: classes3.dex */
public abstract class ReplyOption implements Parcelable {
    public static final Parcelable.Creator<ReplyOption> CREATOR = new Parcelable.Creator<ReplyOption>() { // from class: io.intercom.android.sdk.models.ReplyOption.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReplyOption createFromParcel(Parcel parcel) {
            return ReplyOption.create(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReplyOption[] newArray(int i) {
            return new ReplyOption[i];
        }
    };

    /* loaded from: classes3.dex */
    public static final class Builder {
        String text;
        String uuid;

        public ReplyOption build() {
            return ReplyOption.create(NullSafety.valueOrEmpty(this.text), NullSafety.valueOrEmpty(this.uuid));
        }

        public Builder withText(String str) {
            this.text = str;
            return this;
        }

        public Builder withUuid(String str) {
            this.uuid = str;
            return this;
        }
    }

    static ReplyOption create(String str, String str2) {
        return new AutoValue_ReplyOption(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String text();

    public abstract String uuid();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(text());
        parcel.writeString(uuid());
    }
}
