package ai.kudi.agent.register.p021ui;

import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p021ui.viewmodels.PersonalInfoViewModel;
import android.location.Location;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PersonalInfoFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.PersonalInfoFragment$onContinueClicked$1 */
/* loaded from: classes.dex */
public final class PersonalInfoFragment$onContinueClicked$1 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
    final /* synthetic */ String $closestLandmark;
    final /* synthetic */ String $residentialAddress;
    final /* synthetic */ PersonalInfoFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalInfoFragment$onContinueClicked$1(PersonalInfoFragment personalInfoFragment, String str, String str2) {
        super(1);
        this.this$0 = personalInfoFragment;
        this.$residentialAddress = str;
        this.$closestLandmark = str2;
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
        PersonalInfoFragment $r1 = this.this$0;
        PersonalInfoViewModel $r3 = $r1.getVm();
        PersonalInfoFragment $r12 = this.this$0;
        RegistrationInfo $r4 = $r12.registrationData;
        Log_OC.append($r4);
        String $r5 = this.$residentialAddress;
        String $r6 = this.$closestLandmark;
        PersonalInfoFragment $r13 = this.this$0;
        PersonalInfo $r7 = $r4.getPersonalInfo();
        $r7.setHomeAddress($r5);
        PersonalInfo $r72 = $r4.getPersonalInfo();
        $r72.setClosestLandmark($r6);
        PersonalInfo $r73 = $r4.getPersonalInfo();
        String $r52 = $r13.getState();
        $r73.setState($r52);
        PersonalInfo $r74 = $r4.getPersonalInfo();
        String $r53 = $r13.getLga();
        $r74.setLocalGovernmentArea($r53);
        PersonalInfo $r75 = $r4.getPersonalInfo();
        Double $r8 = Double.valueOf(0.0d);
        Double $r9 = $r8;
        if (location != null) {
            double $d0 = location.getLatitude();
            $r8 = Double.valueOf($d0);
        }
        $r75.setLatitude($r8);
        PersonalInfo $r76 = $r4.getPersonalInfo();
        if (location != null) {
            double $d02 = location.getLatitude();
            $r9 = Double.valueOf($d02);
        }
        $r76.setLongitude($r9);
        PersonalInfo $r77 = $r4.getPersonalInfo();
        float $f0 = $r13.getLgaLatitude();
        Float $r10 = Float.valueOf($f0);
        $r77.setLgaLatitude($r10);
        PersonalInfo $r78 = $r4.getPersonalInfo();
        float $f02 = $r13.getLgaLongitude();
        Float $r102 = Float.valueOf($f02);
        $r78.setLgaLongitude($r102);
        C13666w c13666w = C13666w.f30112a;
        $r3.submitInfo($r4);
    }
}
