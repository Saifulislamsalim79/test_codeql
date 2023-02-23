package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.utilities.NullSafety;
/* loaded from: classes3.dex */
public abstract class Reaction implements Parcelable {
    public static final Parcelable.Creator<Reaction> CREATOR = new Parcelable.Creator<Reaction>() { // from class: io.intercom.android.sdk.models.Reaction.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Reaction createFromParcel(Parcel parcel) {
            return Reaction.create(parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Reaction[] newArray(int i) {
            return new Reaction[i];
        }
    };

    /* loaded from: classes3.dex */
    public static final class Builder {
        String image_url;
        int index;

        public Reaction build() {
            return Reaction.create(this.index, NullSafety.valueOrEmpty(this.image_url));
        }
    }

    public static Reaction create(int i, String str) {
        return new AutoValue_Reaction(i, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract String getImageUrl();

    public abstract int getIndex();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(getIndex());
        parcel.writeString(getImageUrl());
    }
}
