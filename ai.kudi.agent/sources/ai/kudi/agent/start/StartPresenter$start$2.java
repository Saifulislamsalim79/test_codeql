package ai.kudi.agent.start;

import kotlin.C13666w;
import kotlin.Metadata;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p483e0.p485d.Log_OC;
import p198f.p199a.objectweb.asm.signature.Label;
import p272h.p364d.p365a.p366c.C9410b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StartPresenter.kt */
@Metadata(m10422d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m10421d2 = {"<anonymous>", "", "checkResult", "Lai/kudi/commons/refresh/checkers/CheckResult;"}, k = 3, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StartPresenter$start$2 extends AbstractC11802m implements InterfaceC11767l<f.a.a.a.g.a, C13666w> {
    final /* synthetic */ boolean $hasSeenOnBoarding;
    final /* synthetic */ StartPresenter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartPresenter$start$2(StartPresenter startPresenter, boolean z) {
        super(1);
        this.this$0 = startPresenter;
        this.$hasSeenOnBoarding = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final void m40939invoke$lambda0(Label label, StartPresenter startPresenter, boolean z, StartView startView) {
        Log_OC.getArray(label, "$checkResult");
        Log_OC.getArray(startPresenter, "this$0");
        Log_OC.getArray(startView, "it");
        boolean $z1 = label.m18699b();
        if ($z1) {
            return;
        }
        boolean $z12 = label.m18700a();
        if ($z12) {
            return;
        }
        startPresenter.navigate(z);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11767l
    public /* bridge */ /* synthetic */ C13666w invoke(f.a.a.a.g.a aVar) {
        Label $r2 = (Label) aVar;
        invoke($r2);
        C13666w r3 = C13666w.f30112a;
        return r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void invoke(final Label label) {
        Log_OC.getArray(label, "checkResult");
        final StartPresenter $r3 = this.this$0;
        final boolean $z0 = this.$hasSeenOnBoarding;
        $r3.ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.start.a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void close(Object obj) {
                Label $r1 = Label.this;
                StartPresenter $r2 = $r3;
                boolean $z02 = $z0;
                StartView $r4 = (StartView) obj;
                StartPresenter$start$2.m40939invoke$lambda0($r1, $r2, $z02, $r4);
            }
        });
    }
}
