package ai.kudi.agent.bills.viewmodels;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import com.google.gson.C6784f;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashMap;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p565l.AbstractC14135d0;
import retrofit2.C14840l;
import retrofit2.HttpException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PerformPaymentViewModel.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PerformPaymentViewModel$handleRequestError$1 extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {
    final /* synthetic */ String $genericResponse;
    final /* synthetic */ PerformPaymentViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformPaymentViewModel$handleRequestError$1(PerformPaymentViewModel performPaymentViewModel, String str) {
        super(1);
        this.this$0 = performPaymentViewModel;
        this.$genericResponse = str;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(Throwable th) {
        Throwable $r2 = th;
        invoke2($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        Log_OC.getArray(th, "it");
        boolean $z0 = th instanceof HttpException;
        if (!$z0) {
            PerformPaymentViewModel $r3 = this.this$0;
            String $r7 = this.$genericResponse;
            $r3.publishPaymentFailed($r7);
            return;
        }
        HttpException $r2 = (HttpException) th;
        int $i0 = $r2.m352a();
        if ($i0 == 403) {
            PerformPaymentViewModel $r32 = this.this$0;
            $r32.publishPaymentFailed("Insufficient funds.");
            return;
        }
        try {
            C6784f $r4 = new C6784f();
            HttpException $r22 = (HttpException) th;
            C14840l $r5 = $r22.m349d();
            AbstractC14135d0 $r6 = $r5 == null ? null : $r5.m281d();
            Log_OC.append($r6);
            String $r72 = $r6.m2835P();
            Object $r8 = $r4.m20760l($r72, HashMap.class);
            if ($r8 == null) {
                NullPointerException $r10 = new NullPointerException("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.Any>");
                throw $r10;
            }
            HashMap $r9 = (HashMap) $r8;
            PerformPaymentViewModel $r33 = this.this$0;
            Object $r82 = $r9.get(MetricTracker.Object.MESSAGE);
            if ($r82 == null) {
                NullPointerException $r102 = new NullPointerException("null cannot be cast to non-null type kotlin.String");
                throw $r102;
            }
            String $r73 = (String) $r82;
            $r33.publishPaymentFailed($r73);
        } catch (Exception $r11) {
            CrashlyticsReport.logException($r11);
            PerformPaymentViewModel $r34 = this.this$0;
            String $r74 = this.$genericResponse;
            $r34.publishPaymentFailed($r74);
        }
    }
}
