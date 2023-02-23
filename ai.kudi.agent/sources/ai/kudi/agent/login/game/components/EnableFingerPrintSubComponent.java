package ai.kudi.agent.login.game.components;

import ai.kudi.agent.login.p011ui.EnableFingerPrintActivity;
import ai.kudi.agent.register.p022v2.p023ui.EnableFingerPrintFragment;
import kotlin.Metadata;
/* compiled from: EnableFingerPrintSubComponent.kt */
@Metadata(m10422d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, m10421d2 = {"Lai/kudi/agent/login/di/components/EnableFingerPrintSubComponent;", "", "inject", "", "activity", "Lai/kudi/agent/login/ui/EnableFingerPrintActivity;", "fragment", "Lai/kudi/agent/register/v2/ui/EnableFingerPrintFragment;", "Factory", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public interface EnableFingerPrintSubComponent {

    /* compiled from: EnableFingerPrintSubComponent.kt */
    @Metadata(m10422d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m10421d2 = {"Lai/kudi/agent/login/di/components/EnableFingerPrintSubComponent$Factory;", "", "create", "Lai/kudi/agent/login/di/components/EnableFingerPrintSubComponent;", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
    /* loaded from: classes.dex */
    public interface Factory {
        EnableFingerPrintSubComponent create();
    }

    void inject(EnableFingerPrintActivity enableFingerPrintActivity);

    void inject(EnableFingerPrintFragment enableFingerPrintFragment);
}
