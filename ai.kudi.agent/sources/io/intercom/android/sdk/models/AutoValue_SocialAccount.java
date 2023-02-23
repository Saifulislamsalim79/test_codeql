package io.intercom.android.sdk.models;
/* loaded from: classes3.dex */
final class AutoValue_SocialAccount extends SocialAccount {
    private final String profileUrl;
    private final String provider;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SocialAccount(String str, String str2) {
        if (str != null) {
            this.provider = str;
            if (str2 != null) {
                this.profileUrl = str2;
                return;
            }
            throw new NullPointerException("Null profileUrl");
        }
        throw new NullPointerException("Null provider");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SocialAccount) {
            SocialAccount socialAccount = (SocialAccount) obj;
            return this.provider.equals(socialAccount.getProvider()) && this.profileUrl.equals(socialAccount.getProfileUrl());
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.SocialAccount
    public String getProfileUrl() {
        return this.profileUrl;
    }

    @Override // io.intercom.android.sdk.models.SocialAccount
    public String getProvider() {
        return this.provider;
    }

    public int hashCode() {
        return ((this.provider.hashCode() ^ 1000003) * 1000003) ^ this.profileUrl.hashCode();
    }

    public String toString() {
        return "SocialAccount{provider=" + this.provider + ", profileUrl=" + this.profileUrl + "}";
    }
}
