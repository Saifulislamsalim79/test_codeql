package io.intercom.android.sdk.store;

import io.intercom.android.sdk.actions.Action;
import io.intercom.android.sdk.models.TeamPresence;
import io.intercom.android.sdk.store.Store;
import java.util.Collections;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class TeamPresenceReducer implements Store.Reducer<TeamPresence> {
    static final TeamPresence INITIAL_STATE = TeamPresence.create(Collections.emptyList(), "", "");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.intercom.android.sdk.store.TeamPresenceReducer$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C104311 {
        static final /* synthetic */ int[] $SwitchMap$io$intercom$android$sdk$actions$Action$Type;

        static {
            int[] iArr = new int[Action.Type.values().length];
            $SwitchMap$io$intercom$android$sdk$actions$Action$Type = iArr;
            try {
                iArr[Action.Type.TEAM_PRESENCE_UPDATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // io.intercom.android.sdk.store.Store.Reducer
    public /* bridge */ /* synthetic */ TeamPresence reduce(Action action, TeamPresence teamPresence) {
        return reduce2((Action<?>) action, teamPresence);
    }

    /* renamed from: reduce  reason: avoid collision after fix types in other method */
    public TeamPresence reduce2(Action<?> action, TeamPresence teamPresence) {
        return C104311.$SwitchMap$io$intercom$android$sdk$actions$Action$Type[action.type().ordinal()] != 1 ? teamPresence : (TeamPresence) action.value();
    }
}
