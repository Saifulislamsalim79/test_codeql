package io.intercom.android.sdk.models;

import java.util.List;
/* loaded from: classes3.dex */
final class AutoValue_TeamPresence extends TeamPresence {
    private final List<Participant> activeAdmins;
    private final String expectedResponseDelay;
    private final String officeHours;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_TeamPresence(List<Participant> list, String str, String str2) {
        if (list != null) {
            this.activeAdmins = list;
            if (str != null) {
                this.expectedResponseDelay = str;
                if (str2 != null) {
                    this.officeHours = str2;
                    return;
                }
                throw new NullPointerException("Null officeHours");
            }
            throw new NullPointerException("Null expectedResponseDelay");
        }
        throw new NullPointerException("Null activeAdmins");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TeamPresence) {
            TeamPresence teamPresence = (TeamPresence) obj;
            return this.activeAdmins.equals(teamPresence.getActiveAdmins()) && this.expectedResponseDelay.equals(teamPresence.getExpectedResponseDelay()) && this.officeHours.equals(teamPresence.getOfficeHours());
        }
        return false;
    }

    @Override // io.intercom.android.sdk.models.TeamPresence
    public List<Participant> getActiveAdmins() {
        return this.activeAdmins;
    }

    @Override // io.intercom.android.sdk.models.TeamPresence
    public String getExpectedResponseDelay() {
        return this.expectedResponseDelay;
    }

    @Override // io.intercom.android.sdk.models.TeamPresence
    public String getOfficeHours() {
        return this.officeHours;
    }

    public int hashCode() {
        return ((((this.activeAdmins.hashCode() ^ 1000003) * 1000003) ^ this.expectedResponseDelay.hashCode()) * 1000003) ^ this.officeHours.hashCode();
    }

    public String toString() {
        return "TeamPresence{activeAdmins=" + this.activeAdmins + ", expectedResponseDelay=" + this.expectedResponseDelay + ", officeHours=" + this.officeHours + "}";
    }
}
