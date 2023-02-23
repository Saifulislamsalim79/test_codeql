package ai.kudi.agent.outlet_mgt.presenters;

import ai.kudi.agent.network.util.KudiErrorParserKt;
import ai.kudi.agent.outlet_mgt.views.OutletMgtView;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OutletMgtPresenter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR, ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class OutletMgtPresenter$sendOtpForCreateOutlet$3 extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {
    final /* synthetic */ OutletMgtPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OutletMgtPresenter$sendOtpForCreateOutlet$3(OutletMgtPresenter outletMgtPresenter) {
        super(1);
        this.this$0 = outletMgtPresenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m39891invoke$lambda0(Throwable th, OutletMgtView outletMgtView) {
        Log_OC.getArray(th, "$error");
        Log_OC.getArray(outletMgtView, "it");
        outletMgtView.toggleOtpLoading(false);
        InterfaceC11767l $r2 = KudiErrorParserKt.parseHttpError2$default(null, null, 3, null);
        Object $r3 = $r2.invoke(th);
        String $r4 = (String) $r3;
        outletMgtView.handleError($r4);
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
    public final void invoke2(final Throwable th) {
        Log_OC.getArray(th, IjkMediaPlayer.OnNativeInvokeListener.ARG_ERROR);
        OutletMgtPresenter $r3 = this.this$0;
        $r3.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.outlet_mgt.presenters.NumberPicker$TwoDigitFormatter
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void format(Object obj) {
                Throwable $r1 = th;
                OutletMgtView $r32 = (OutletMgtView) obj;
                OutletMgtPresenter$sendOtpForCreateOutlet$3.m39891invoke$lambda0($r1, $r32);
            }
        });
    }
}
