package io.intercom.android.sdk.models;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AutoValue_Participant extends Participant {
    private final Avatar getAvatar;
    private final String getEmail;
    private final String getId;
    private final String getName;
    private final String getType;
    private final Boolean isBot;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_Participant(String str, String str2, String str3, String str4, Avatar avatar, Boolean bool) {
        if (str != null) {
            this.getId = str;
            if (str2 != null) {
                this.getName = str2;
                if (str3 != null) {
                    this.getType = str3;
                    if (str4 != null) {
                        this.getEmail = str4;
                        if (avatar != null) {
                            this.getAvatar = avatar;
                            if (bool != null) {
                                this.isBot = bool;
                                return;
                            }
                            throw new NullPointerException("Null isBot");
                        }
                        throw new NullPointerException("Null getAvatar");
                    }
                    throw new NullPointerException("Null getEmail");
                }
                throw new NullPointerException("Null getType");
            }
            throw new NullPointerException("Null getName");
        }
        throw new NullPointerException("Null getId");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Participant) {
            Participant participant = (Participant) obj;
            return this.getId.equals(participant.getId()) && this.getName.equals(participant.getName()) && this.getType.equals(participant.getType()) && this.getEmail.equals(participant.getEmail()) && this.getAvatar.equals(participant.getAvatar()) && this.isBot.equals(participant.isBot());
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public Avatar getAvatar() {
        return this.getAvatar;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public String getEmail() {
        return this.getEmail;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public String getId() {
        return this.getId;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public String getName() {
        return this.getName;
    }

    @Override // io.intercom.android.sdk.models.Participant
    public String getType() {
        return this.getType;
    }

    public int hashCode() {
        return ((((((((((this.getId.hashCode() ^ 1000003) * 1000003) ^ this.getName.hashCode()) * 1000003) ^ this.getType.hashCode()) * 1000003) ^ this.getEmail.hashCode()) * 1000003) ^ this.getAvatar.hashCode()) * 1000003) ^ this.isBot.hashCode();
    }

    @Override // io.intercom.android.sdk.models.Participant
    public Boolean isBot() {
        return this.isBot;
    }

    public String toString() {
        return "Participant{getId=" + this.getId + ", getName=" + this.getName + ", getType=" + this.getType + ", getEmail=" + this.getEmail + ", getAvatar=" + this.getAvatar + ", isBot=" + this.isBot + "}";
    }
}
