package ai.kudi.agent.register.p021ui;

import ai.kudi.agent.register.domain.wiki.PersonalInfo;
import ai.kudi.agent.register.domain.wiki.RegistrationInfo;
import ai.kudi.agent.register.p021ui.viewmodels.BusinessInfoViewModel;
import android.location.Location;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BusinessInfoFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.register.ui.BusinessInfoFragment$onContinueClicked$1$1 */
/* loaded from: classes.dex */
public final class BusinessInfoFragment$onContinueClicked$1$1 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
    final /* synthetic */ String $area;
    final /* synthetic */ String $businessAddress;
    final /* synthetic */ String $businessEmailAddress;
    final /* synthetic */ String $businessName;
    final /* synthetic */ BusinessInfoFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessInfoFragment$onContinueClicked$1$1(BusinessInfoFragment businessInfoFragment, String str, String str2, String str3, String str4) {
        super(1);
        this.this$0 = businessInfoFragment;
        this.$businessName = str;
        this.$businessAddress = str2;
        this.$businessEmailAddress = str3;
        this.$area = str4;
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
        RegistrationInfo $r5;
        if (location == null || ($r5 = this.this$0.registrationData) == null) {
            return;
        }
        BusinessInfoFragment $r4 = this.this$0;
        String $r6 = this.$businessName;
        String $r7 = this.$businessAddress;
        String $r1 = this.$businessEmailAddress;
        String $r2 = this.$area;
        $r4.setUpAccountType($r5);
        BusinessInfoViewModel $r8 = $r4.getVm();
        PersonalInfo $r9 = $r5.getPersonalInfo();
        $r9.setBusinessName($r6);
        PersonalInfo $r92 = $r5.getPersonalInfo();
        $r92.setBusinessAddress($r7);
        PersonalInfo $r93 = $r5.getPersonalInfo();
        $r93.setEmail($r1);
        PersonalInfo $r94 = $r5.getPersonalInfo();
        String $r12 = $r4.getState();
        $r94.setState($r12);
        PersonalInfo $r95 = $r5.getPersonalInfo();
        String $r13 = $r4.getLga();
        $r95.setLocalGovernmentArea($r13);
        PersonalInfo $r96 = $r5.getPersonalInfo();
        double $d0 = location.getLatitude();
        Double $r10 = Double.valueOf($d0);
        $r96.setLatitude($r10);
        PersonalInfo $r97 = $r5.getPersonalInfo();
        double $d02 = location.getLatitude();
        Double $r102 = Double.valueOf($d02);
        $r97.setLongitude($r102);
        PersonalInfo $r98 = $r5.getPersonalInfo();
        float $f0 = $r4.getLgaLatitude();
        Float $r11 = Float.valueOf($f0);
        $r98.setLgaLatitude($r11);
        PersonalInfo $r99 = $r5.getPersonalInfo();
        float $f02 = $r4.getLgaLongitude();
        Float $r112 = Float.valueOf($f02);
        $r99.setLgaLongitude($r112);
        PersonalInfo $r910 = $r5.getPersonalInfo();
        $r910.setBusinessAddressArea($r2);
        C13666w c13666w = C13666w.f30112a;
        $r8.submitInfo($r5);
    }
}
