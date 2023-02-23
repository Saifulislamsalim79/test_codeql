package ai.kudi.agent.bills.p002ui;

import ai.kudi.agent.bills.data.Biller;
import ai.kudi.agent.bills.data.BillerParams;
import ai.kudi.agent.core.util.ContextExtKt;
import ai.kudi.agent.product.p019ui.ProductActivity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: HomeFragment.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", "Lai/kudi/agent/bills/data/Biller;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* renamed from: ai.kudi.agent.bills.ui.HomeFragment$loadBillers$1$billersAdapter$1 */
/* loaded from: classes.dex */
final class HomeFragment$loadBillers$1$billersAdapter$1 extends AbstractC11802m implements InterfaceC11767l<Biller, C13666w> {
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeFragment.kt */
    @Metadata(m10422d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m10421d2 = {"<anonymous>", "", "Landroid/os/Bundle;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
    /* renamed from: ai.kudi.agent.bills.ui.HomeFragment$loadBillers$1$billersAdapter$1$1 */
    /* loaded from: classes.dex */
    public static final class C00251 extends AbstractC11802m implements InterfaceC11767l<Bundle, C13666w> {
        final /* synthetic */ Biller mIntent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C00251(Biller biller) {
            super(1);
            this.mIntent = biller;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        @Override // kotlin.p483e0.p484c.InterfaceC11767l
        public /* bridge */ /* synthetic */ C13666w invoke(Bundle bundle) {
            Bundle $r2 = bundle;
            invoke2($r2);
            C13666w r3 = C13666w.f30112a;
            return r3;
        }

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
         */
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Bundle bundle) {
            Log_OC.getArray(bundle, "$this$launchActivity");
            Biller $r2 = this.mIntent;
            bundle.putParcelable(BillerParams.PARCEL_NAME, $r2);
            Biller $r22 = this.mIntent;
            bundle.putParcelable(BillerParams.BILLER_TYPE, $r22);
            bundle.putString(ProductActivity.EXTRA_MODE, ProductActivity.EXTRA_MODE_OTHER_BILLS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$loadBillers$1$billersAdapter$1(HomeFragment homeFragment) {
        super(1);
        this.this$0 = homeFragment;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Biller biller) {
        Biller $r2 = biller;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Biller biller) {
        Log_OC.getArray(biller, "it");
        Fragment $r4 = this.this$0;
        Fragment r6 = $r4;
        FragmentActivity $r3 = r6.requireActivity();
        Log_OC.loadImage($r3, "requireActivity()");
        C00251 r5 = new C00251(biller);
        ContextExtKt.launchActivity$default((Context) $r3, false, ProductActivity.class, (InterfaceC11767l) r5, 1, (Object) null);
    }
}
