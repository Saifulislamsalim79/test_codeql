package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.utilities.NullSafety;
/* loaded from: classes3.dex */
public abstract class Avatar implements Parcelable {
    public static final Parcelable.Creator<Avatar> CREATOR = new Parcelable.Creator<Avatar>() { // from class: io.intercom.android.sdk.models.Avatar.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Avatar createFromParcel(Parcel parcel) {
            return Avatar.create(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Avatar[] newArray(int i) {
            return new Avatar[i];
        }
    };

    /* loaded from: classes3.dex */
    public static final class Builder {
        String image_url;
        String initials;

        public Avatar build() {
            return Avatar.create(NullSafety.valueOrEmpty(this.image_url), NullSafety.valueOrEmpty(this.initials));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder withInitials(String str) {
            this.initials = str;
            return this;
        }
    }

    public static Avatar create(String str, String str2) {
        return new AutoValue_Avatar(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getImageUrl();

    public abstract String getInitials();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(getImageUrl());
        parcel.writeString(getInitials());
    }
}
