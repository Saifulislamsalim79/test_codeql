package ai.kudi.agent.settings.p029ui.adapters;

import ai.kudi.agent.settings.data.SecurityOption;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SecurityOptionsAdapter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/settings/data/SecurityOption;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.settings.ui.adapters.SecurityOptionsAdapter$removeSecondaryPhoneNumberAndTrustedDevices$1 */
/* loaded from: classes.dex */
public final class C0551xc9482f70 extends AbstractC11802m implements InterfaceC11767l<SecurityOption, Boolean> {
    final /* synthetic */ SecurityOptionsAdapter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0551xc9482f70(SecurityOptionsAdapter securityOptionsAdapter) {
        super(1);
        this.this$0 = securityOptionsAdapter;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ Boolean invoke(SecurityOption securityOption) {
        SecurityOption $r2 = securityOption;
        boolean $z0 = invoke2($r2);
        Boolean $r3 = Boolean.valueOf($z0);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final boolean invoke2(SecurityOption securityOption) {
        Log_OC.getArray(securityOption, "it");
        SecurityOptionsAdapter $r2 = this.this$0;
        SecurityOption $r3 = $r2.securityOptionSecondaryPhone;
        boolean $z0 = Log_OC.append(securityOption, $r3);
        if ($z0) {
            return true;
        }
        SecurityOptionsAdapter $r22 = this.this$0;
        SecurityOption $r32 = $r22.securityOptionTrustedDevices;
        boolean $z02 = Log_OC.append(securityOption, $r32);
        return $z02;
    }
}
