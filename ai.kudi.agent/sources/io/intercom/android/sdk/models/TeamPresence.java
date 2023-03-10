package io.intercom.android.sdk.models;

import io.intercom.android.sdk.commons.utilities.CollectionUtils;
import io.intercom.android.sdk.models.Participant;
import io.intercom.android.sdk.utilities.NullSafety;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public abstract class TeamPresence {

    /* loaded from: classes3.dex */
    public static final class Builder {
        List<Participant.Builder> active_admins;
        String expected_response_delay;
        String office_hours;

        public TeamPresence build() {
            ArrayList arrayList = new ArrayList(CollectionUtils.capacityFor(this.active_admins));
            List<Participant.Builder> list = this.active_admins;
            if (list != null) {
                for (Participant.Builder builder : list) {
                    if (builder != null) {
                        arrayList.add(builder.build());
                    }
                }
            }
            return TeamPresence.create(arrayList, NullSafety.valueOrEmpty(this.expected_response_delay), NullSafety.valueOrEmpty(this.office_hours));
        }
    }

    public static TeamPresence create(List<Participant> list, String str, String str2) {
        return new AutoValue_TeamPresence(list, str, str2);
    }

    public abstract List<Participant> getActiveAdmins();

    public abstract String getExpectedResponseDelay();

    public abstract String getOfficeHours();

    public boolean isEmpty() {
        return getActiveAdmins().isEmpty() && getExpectedResponseDelay().isEmpty();
    }
}
