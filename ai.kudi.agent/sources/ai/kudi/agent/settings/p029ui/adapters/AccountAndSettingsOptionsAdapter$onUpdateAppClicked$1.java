package ai.kudi.agent.settings.p029ui.adapters;

import ai.kudi.agent.settings.data.SettingsOption;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AccountAndSettingsOptionsAdapter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/settings/data/SettingsOption;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.adapters.AccountAndSettingsOptionsAdapter$onUpdateAppClicked$1 */
/* loaded from: classes.dex */
final class AccountAndSettingsOptionsAdapter$onUpdateAppClicked$1 extends AbstractC11802m implements InterfaceC11767l<SettingsOption, C13666w> {
    public static final AccountAndSettingsOptionsAdapter$onUpdateAppClicked$1 INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        AccountAndSettingsOptionsAdapter$onUpdateAppClicked$1 $r0 = new AccountAndSettingsOptionsAdapter$onUpdateAppClicked$1();
        INSTANCE = $r0;
    }

    AccountAndSettingsOptionsAdapter$onUpdateAppClicked$1() {
        super(1);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(SettingsOption settingsOption) {
        SettingsOption $r2 = settingsOption;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SettingsOption settingsOption) {
        Log_OC.getArray(settingsOption, "it");
    }
}
