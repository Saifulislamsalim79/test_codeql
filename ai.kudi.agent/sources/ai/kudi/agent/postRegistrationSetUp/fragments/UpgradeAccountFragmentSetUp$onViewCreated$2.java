package ai.kudi.agent.postRegistrationSetUp.fragments;

import ai.kudi.agent.postRegistrationSetUp.PostRegistrationActivity;
import ai.kudi.agent.settings.data.Constants;
import ai.kudi.agent.settings.p029ui.SettingsActivity;
import android.content.Intent;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: UpgradeAccountFragmentSetUp.kt */
@Metadata(m10422d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m10421d2 = {"<anonymous>", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class UpgradeAccountFragmentSetUp$onViewCreated$2 extends AbstractC11802m implements InterfaceC11756a<C13666w> {
    final /* synthetic */ UpgradeAccountFragmentSetUp this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeAccountFragmentSetUp$onViewCreated$2(UpgradeAccountFragmentSetUp upgradeAccountFragmentSetUp) {
        super(0);
        this.this$0 = upgradeAccountFragmentSetUp;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ C13666w invoke() {
        invoke2();
        C13666w r1 = C13666w.f30112a;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        UpgradeAccountFragmentSetUp $r1 = this.this$0;
        UpgradeAccountFragmentSetUp $r3 = this.this$0;
        PostRegistrationActivity $r4 = $r3.postRegistrationActivity;
        Intent $r2 = new Intent($r4, SettingsActivity.class);
        UpgradeAccountFragmentSetUp $r32 = this.this$0;
        $r2.putExtra("PARAM_SETTINGS", Constants.SETTINGS_PARAM_UPGRADE_KYC);
        String $r5 = $r32.currentKycLevel;
        $r2.putExtra(Constants.PARAM_CURRENT_KYC_LEVEL, $r5);
        C13666w c13666w = C13666w.f30112a;
        $r1.startActivityForResult($r2, 2);
    }
}
