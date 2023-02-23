package io.intercom.android.sdk.models;
/* loaded from: classes3.dex */
final class AutoValue_Avatar extends Avatar {
    private final String imageUrl;
    private final String initials;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Avatar(String str, String str2) {
        if (str != null) {
            this.imageUrl = str;
            if (str2 != null) {
                this.initials = str2;
                return;
            }
            throw new NullPointerException("Null initials");
        }
        throw new NullPointerException("Null imageUrl");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Avatar) {
            Avatar avatar = (Avatar) obj;
            return this.imageUrl.equals(avatar.getImageUrl()) && this.initials.equals(avatar.getInitials());
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Avatar
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Override // io.intercom.android.sdk.models.Avatar
    public String getInitials() {
        return this.initials;
    }

    public int hashCode() {
        return ((this.imageUrl.hashCode() ^ 1000003) * 1000003) ^ this.initials.hashCode();
    }

    public String toString() {
        return "Avatar{imageUrl=" + this.imageUrl + ", initials=" + this.initials + "}";
    }
}
