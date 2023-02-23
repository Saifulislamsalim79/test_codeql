package ai.kudi.agent.settings.security.p028ui;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.settings.navigators.SettingsNavigator;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SecurityFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.security.ui.SecurityFragment$onViewCreated$1 */
/* loaded from: classes.dex */
final class SecurityFragment$onViewCreated$1 extends AbstractC11802m implements InterfaceC11767l<String, C13666w> {
    final /* synthetic */ SecurityFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityFragment$onViewCreated$1(SecurityFragment securityFragment) {
        super(1);
        this.this$0 = securityFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(String str) {
        String $r2 = str;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        Log_OC.getArray(str, "it");
        SecurityFragment $r2 = this.this$0;
        String $r3 = $r2.getString(C0001R.string.reset_pin);
        boolean $z0 = Log_OC.append(str, $r3);
        if ($z0) {
            SecurityFragment $r22 = this.this$0;
            SettingsNavigator $r4 = $r22.getSettingsNavigator();
            $r4.toResetPinFragment();
            return;
        }
        SecurityFragment $r23 = this.this$0;
        String $r32 = $r23.getString(C0001R.string.set_secondary_phone_number);
        boolean $z02 = Log_OC.append(str, $r32);
        if ($z02) {
            SecurityFragment $r24 = this.this$0;
            SettingsNavigator $r42 = $r24.getSettingsNavigator();
            $r42.toSecondaryPhoneNumberFragment();
            return;
        }
        SecurityFragment $r25 = this.this$0;
        String $r33 = $r25.getString(C0001R.string.trusted_devices_text);
        boolean $z03 = Log_OC.append(str, $r33);
        if ($z03) {
            SecurityFragment $r26 = this.this$0;
            SettingsNavigator $r43 = $r26.getSettingsNavigator();
            $r43.toMyDevicesFragment();
            return;
        }
        SecurityFragment $r27 = this.this$0;
        String $r34 = $r27.getString(C0001R.string.reset_savings_pin);
        boolean $z04 = Log_OC.append(str, $r34);
        if ($z04) {
            SecurityFragment $r28 = this.this$0;
            SettingsNavigator $r44 = $r28.getSettingsNavigator();
            $r44.navigateToResetSavingsPin();
        }
    }
}
