package ai.kudi.agent.register.p021ui;

import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p021ui.viewmodels.CreatePinViewModel;
import android.location.Location;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CreatePinFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "locatiom", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.CreatePinFragment$onCreateAccountClicked$1 */
/* loaded from: classes.dex */
public final class CreatePinFragment$onCreateAccountClicked$1 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
    final /* synthetic */ String $confirmPin;
    final /* synthetic */ String $deviceId;
    final /* synthetic */ String $deviceName;
    final /* synthetic */ String $pin;
    final /* synthetic */ CreatePinFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePinFragment$onCreateAccountClicked$1(CreatePinFragment createPinFragment, String str, String str2, String str3, String str4) {
        super(1);
        this.this$0 = createPinFragment;
        this.$pin = str;
        this.$confirmPin = str2;
        this.$deviceId = str3;
        this.$deviceName = str4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Location location) {
        Location $r2 = location;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Location location) {
        RegistrationInfo $r7;
        if (location == null || ($r7 = this.this$0.registrationInfo) == null) {
            return;
        }
        CreatePinFragment $r6 = this.this$0;
        String $r2 = this.$pin;
        String $r3 = this.$confirmPin;
        String $r4 = this.$deviceId;
        String $r5 = this.$deviceName;
        CreatePinViewModel $r8 = CreatePinFragment.access$getViewModel($r6);
        Log_OC.append($r4);
        Log_OC.append($r5);
        boolean $z0 = $r6.isTermsChecked;
        double $d0 = location.getLatitude();
        double $d1 = location.getLongitude();
        $r8.submitPin($r7, $r2, $r3, $r4, $r5, $z0, $d0, $d1);
    }
}
