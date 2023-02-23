package ai.kudi.agent.p036v2.productCustomerRegistrationSummary.fragment;

import ai.kudi.agent.core.util.LocationUtil;
import ai.kudi.agent.p036v2.productCustomerRegistrationSummary.viewModel.ProductCustomerRegistrationSummaryViewModel;
import android.content.Context;
import android.location.Location;
import com.google.android.gms.location.C4107a;
import com.google.android.gms.location.C4109b;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProductCustomerRegistrationSummaryFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "otp", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.fragment.ProductCustomerRegistrationSummaryFragment$handleCustomerVerification$1 */
/* loaded from: classes.dex */
public final class C0713xf06da3c2 extends AbstractC11802m implements InterfaceC11767l<String, C13666w> {
    final /* synthetic */ ProductCustomerRegistrationSummaryFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProductCustomerRegistrationSummaryFragment.kt */
    @Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Landroid/location/Location;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.v2.productCustomerRegistrationSummary.fragment.ProductCustomerRegistrationSummaryFragment$handleCustomerVerification$1$1 */
    /* loaded from: classes.dex */
    public static final class C07141 extends AbstractC11802m implements InterfaceC11767l<Location, C13666w> {
        final /* synthetic */ String $otp;
        final /* synthetic */ ProductCustomerRegistrationSummaryFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07141(ProductCustomerRegistrationSummaryFragment productCustomerRegistrationSummaryFragment, String str) {
            super(1);
            this.this$0 = productCustomerRegistrationSummaryFragment;
            this.$otp = str;
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
            ProductCustomerRegistrationSummaryFragment $r1 = this.this$0;
            ProductCustomerRegistrationSummaryViewModel $r3 = $r1.getProductCustomerRegistrationSummaryViewModel();
            double $d1 = location == null ? 0.0d : location.getLatitude();
            double $d0 = location != null ? location.getLongitude() : 0.0d;
            String $r4 = this.$otp;
            $r3.verifyCustomer($d1, $d0, $r4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0713xf06da3c2(ProductCustomerRegistrationSummaryFragment productCustomerRegistrationSummaryFragment) {
        super(1);
        this.this$0 = productCustomerRegistrationSummaryFragment;
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
        Log_OC.getArray(str, "otp");
        LocationUtil $r4 = this.this$0.locationTracker;
        if ($r4 != null) {
            Context $r5 = this.this$0.requireContext();
            C4107a $r6 = C4109b.m28502b($r5);
            Log_OC.loadImage($r6, "getFusedLocationProviderClient(requireContext())");
            C07141 $r1 = new C07141(this.this$0, str);
            LocationUtil.getLastLocation$default($r4, $r6, 0, $r1, 2, null);
        }
        ProductCustomerRegistrationSummaryFragment $r3 = this.this$0;
        int $i0 = $r3.verificationRetryCount;
        $r3.verificationRetryCount = $i0 + 1;
        int unused = $r3.verificationRetryCount;
    }
}
