package ai.kudi.agent.start;

import ai.kudi.agent.core.crashreport.CrashlyticsReport;
import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p272h.p364d.p365a.p366c.C9410b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StartPresenter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "it", ""}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StartPresenter$start$3 extends AbstractC11802m implements InterfaceC11767l<Throwable, C13666w> {
    final /* synthetic */ boolean $hasSeenOnBoarding;
    final /* synthetic */ StartPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartPresenter$start$3(StartPresenter startPresenter, boolean z) {
        super(1);
        this.this$0 = startPresenter;
        this.$hasSeenOnBoarding = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m40940invoke$lambda0(StartPresenter startPresenter, boolean z, StartView startView) {
        Log_OC.getArray(startPresenter, "this$0");
        Log_OC.getArray(startView, "it");
        startPresenter.navigate(z);
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
        final StartPresenter $r3 = this.this$0;
        final boolean $z0 = this.$hasSeenOnBoarding;
        $r3.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.start.Item
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // p272h.p364d.p365a.p366c.C9410b.InterfaceC9411a
            /* renamed from: a */
            public final void mo14809a(Object obj) {
                StartPresenter $r1 = StartPresenter.this;
                boolean $z02 = $z0;
                StartView $r32 = (StartView) obj;
                StartPresenter$start$3.m40940invoke$lambda0($r1, $z02, $r32);
            }
        });
        CrashlyticsReport.logException(th);
    }
}
