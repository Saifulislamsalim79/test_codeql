package ai.kudi.agent.settings.p029ui;

import ai.kudi.agent.settings.p029ui.viewModels.AccountAndSettingsOptionsViewModel;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p286c.p287a.p343d.p344a.p345a.AbstractC9327a;
/* compiled from: AccountAndSettingsOptionsFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.AccountAndSettingsOptionsFragment$onViewCreated$4 */
/* loaded from: classes.dex */
final class AccountAndSettingsOptionsFragment$onViewCreated$4 extends AbstractC11802m implements InterfaceC11767l<AbstractC9327a, C13666w> {
    final /* synthetic */ AccountAndSettingsOptionsFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountAndSettingsOptionsFragment$onViewCreated$4(AccountAndSettingsOptionsFragment accountAndSettingsOptionsFragment) {
        super(1);
        this.this$0 = accountAndSettingsOptionsFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(AbstractC9327a abstractC9327a) {
        AbstractC9327a $r2 = abstractC9327a;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(AbstractC9327a abstractC9327a) {
        Log_OC.getArray(abstractC9327a, "it");
        AccountAndSettingsOptionsFragment $r3 = this.this$0;
        AccountAndSettingsOptionsViewModel $r1 = $r3.getAccountAndSettingsOptionsViewModel();
        $r1.onAppUpdateAvailable();
    }
}
