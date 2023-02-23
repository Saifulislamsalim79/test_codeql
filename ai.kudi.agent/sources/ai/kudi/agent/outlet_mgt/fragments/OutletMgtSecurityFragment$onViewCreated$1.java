package ai.kudi.agent.outlet_mgt.fragments;

import ai.kudi.agent.C0001R;
import ai.kudi.agent.core.util.ViewExtKt;
import ai.kudi.agent.databinding.FragmentResetPin2Binding;
import ai.kudi.agent.databinding.FragmentSecurityBinding;
import ai.kudi.agent.databinding.OutletMgtSecurityFragmentBinding;
import android.widget.ScrollView;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p201g.p270x.InterfaceC8209a;
/* compiled from: OutletMgtSecurityFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class OutletMgtSecurityFragment$onViewCreated$1 extends AbstractC11802m implements InterfaceC11767l<String, C13666w> {
    final /* synthetic */ OutletMgtSecurityFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutletMgtSecurityFragment$onViewCreated$1(OutletMgtSecurityFragment outletMgtSecurityFragment) {
        super(1);
        this.this$0 = outletMgtSecurityFragment;
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
        OutletMgtSecurityFragment $r2 = this.this$0;
        String $r3 = $r2.getString(C0001R.string.reset_pin);
        boolean $z0 = Log_OC.append(str, $r3);
        if ($z0) {
            OutletMgtSecurityFragment $r22 = this.this$0;
            InterfaceC8209a $r4 = $r22.requireBinding();
            OutletMgtSecurityFragmentBinding $r5 = (OutletMgtSecurityFragmentBinding) $r4;
            FragmentSecurityBinding $r6 = $r5.securityLayout;
            ScrollView $r7 = $r6.getRoot();
            Log_OC.loadImage($r7, "requireBinding().securityLayout.root");
            ViewExtKt.hide$default($r7, false, 1, null);
            OutletMgtSecurityFragment $r23 = this.this$0;
            InterfaceC8209a $r42 = $r23.requireBinding();
            OutletMgtSecurityFragmentBinding $r52 = (OutletMgtSecurityFragmentBinding) $r42;
            FragmentResetPin2Binding $r8 = $r52.resetPinLayout;
            ScrollView $r72 = $r8.getRoot();
            Log_OC.loadImage($r72, "requireBinding().resetPinLayout.root");
            ViewExtKt.show($r72);
            OutletMgtSecurityFragment $r24 = this.this$0;
            $r24.isOnResetPinFragment = true;
        }
    }
}
