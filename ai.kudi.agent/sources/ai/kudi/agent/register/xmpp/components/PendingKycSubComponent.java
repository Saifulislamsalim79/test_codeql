package ai.kudi.agent.register.xmpp.components;

import ai.kudi.agent.register.navigators.PendingKycNavigator;
import ai.kudi.agent.register.p022v2.p023ui.PendingKycActivity;
import ai.kudi.agent.register.p022v2.p023ui.PendingKycFormFragment;
import ai.kudi.agent.settings.personal.p027ui.IdtypesFragment;
import kotlin.Metadata;
/* compiled from: PendingKycSubComponent.kt */
@Metadata(m10422d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\nJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\u000b"}, m10421d2 = {"Lai/kudi/agent/register/di/components/PendingKycSubComponent;", "", "inject", "", "activity", "Lai/kudi/agent/register/v2/ui/PendingKycActivity;", "fragment", "Lai/kudi/agent/register/v2/ui/PendingKycFormFragment;", "idTypesFragment", "Lai/kudi/agent/settings/personal/ui/IdtypesFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface PendingKycSubComponent {

    /* compiled from: PendingKycSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m10421d2 = {"Lai/kudi/agent/register/di/components/PendingKycSubComponent$Factory;", "", "create", "Lai/kudi/agent/register/di/components/PendingKycSubComponent;", "registerV2Navigator", "Lai/kudi/agent/register/navigators/PendingKycNavigator;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        PendingKycSubComponent create(PendingKycNavigator pendingKycNavigator);
    }

    void inject(PendingKycActivity pendingKycActivity);

    void inject(PendingKycFormFragment pendingKycFormFragment);

    void inject(IdtypesFragment idtypesFragment);
}
