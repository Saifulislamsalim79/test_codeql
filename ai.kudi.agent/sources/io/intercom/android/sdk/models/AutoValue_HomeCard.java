package io.intercom.android.sdk.models;
/* loaded from: classes3.dex */
final class AutoValue_HomeCard extends HomeCard {
    private final String fallbackUrl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_HomeCard(String str) {
        if (str != null) {
            this.fallbackUrl = str;
            return;
        }
        throw new NullPointerException("Null fallbackUrl");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HomeCard) {
            return this.fallbackUrl.equals(((HomeCard) obj).fallbackUrl());
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.HomeCard
    public String fallbackUrl() {
        return this.fallbackUrl;
    }

    public int hashCode() {
        return this.fallbackUrl.hashCode() ^ 1000003;
    }

    public String toString() {
        return "HomeCard{fallbackUrl=" + this.fallbackUrl + "}";
    }
}
