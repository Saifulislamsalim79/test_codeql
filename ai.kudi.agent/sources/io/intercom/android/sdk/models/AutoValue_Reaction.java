package io.intercom.android.sdk.models;
/* loaded from: classes3.dex */
final class AutoValue_Reaction extends Reaction {
    private final String imageUrl;
    private final int index;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Reaction(int i, String str) {
        this.index = i;
        if (str != null) {
            this.imageUrl = str;
            return;
        }
        throw new NullPointerException("Null imageUrl");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Reaction) {
            Reaction reaction = (Reaction) obj;
            return this.index == reaction.getIndex() && this.imageUrl.equals(reaction.getImageUrl());
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Reaction
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Override // io.intercom.android.sdk.models.Reaction
    public int getIndex() {
        return this.index;
    }

    public int hashCode() {
        return ((this.index ^ 1000003) * 1000003) ^ this.imageUrl.hashCode();
    }

    public String toString() {
        return "Reaction{index=" + this.index + ", imageUrl=" + this.imageUrl + "}";
    }
}
