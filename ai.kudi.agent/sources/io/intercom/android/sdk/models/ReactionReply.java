package io.intercom.android.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import io.intercom.android.sdk.commons.utilities.CollectionUtils;
import io.intercom.android.sdk.models.Reaction;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public class ReactionReply implements Parcelable {
    private Integer reactionIndex;
    private final List<Reaction> reactionSet;
    public static final ReactionReply NULL = new ReactionReply(new Builder());
    public static final Parcelable.Creator<ReactionReply> CREATOR = new Parcelable.Creator<ReactionReply>() { // from class: io.intercom.android.sdk.models.ReactionReply.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReactionReply createFromParcel(Parcel parcel) {
            return new ReactionReply(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ReactionReply[] newArray(int i) {
            return new ReactionReply[i];
        }
    };

    /* loaded from: classes3.dex */
    public static class Builder {
        Integer reaction_index;
        List<Reaction.Builder> reaction_set;

        public ReactionReply build() {
            return new ReactionReply(this);
        }
    }

    ReactionReply(Builder builder) {
        this.reactionIndex = builder.reaction_index;
        this.reactionSet = new ArrayList(CollectionUtils.capacityFor(builder.reaction_set));
        List<Reaction.Builder> list = builder.reaction_set;
        if (list != null) {
            for (Reaction.Builder builder2 : list) {
                this.reactionSet.add(builder2.build());
            }
        }
    }

    public static boolean isNull(ReactionReply reactionReply) {
        return NULL.equals(reactionReply) || reactionReply == null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ReactionReply.class != obj.getClass()) {
            return false;
        }
        ReactionReply reactionReply = (ReactionReply) obj;
        if (this.reactionSet.equals(reactionReply.reactionSet)) {
            Integer num = this.reactionIndex;
            Integer num2 = reactionReply.reactionIndex;
            return num != null ? num.equals(num2) : num2 == null;
        }
        return false;
    }

    public Integer getReactionIndex() {
        return this.reactionIndex;
    }

    public List<Reaction> getReactionSet() {
        return this.reactionSet;
    }

    public int hashCode() {
        int hashCode = this.reactionSet.hashCode() * 31;
        Integer num = this.reactionIndex;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public void setReactionIndex(int i) {
        this.reactionIndex = Integer.valueOf(i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.reactionIndex == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.reactionIndex.intValue());
        }
        parcel.writeList(this.reactionSet);
    }

    ReactionReply(Parcel parcel) {
        this.reactionIndex = parcel.readByte() == 0 ? null : Integer.valueOf(parcel.readInt());
        ArrayList arrayList = new ArrayList();
        this.reactionSet = arrayList;
        parcel.readList(arrayList, Reaction.class.getClassLoader());
    }
}
