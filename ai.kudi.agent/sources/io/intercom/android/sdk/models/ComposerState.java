package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.utilities.NullSafety;
/* loaded from: classes3.dex */
public abstract class ComposerState implements Parcelable {
    public static final ComposerState NULL = new Builder().build();
    public static final Parcelable.Creator<ComposerState> CREATOR = new Parcelable.Creator<ComposerState>() { // from class: io.intercom.android.sdk.models.ComposerState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ComposerState createFromParcel(Parcel parcel) {
            return ComposerState.create(parcel.readByte() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ComposerState[] newArray(int i) {
            return new ComposerState[i];
        }
    };

    /* loaded from: classes3.dex */
    public static final class Builder {
        Boolean visible;

        public ComposerState build() {
            return ComposerState.create(NullSafety.valueOrDefault(this.visible, true));
        }

        public Builder withVisible(Boolean bool) {
            this.visible = bool;
            return this;
        }
    }

    static ComposerState create(boolean z) {
        return new AutoValue_ComposerState(z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public abstract boolean isVisible();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(isVisible() ? (byte) 1 : (byte) 0);
    }
}
