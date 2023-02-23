package ai.kudi.agent.start;

import io.intercom.android.sdk.metrics.ops.OpsMetricTracker;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p198f.p199a.objectweb.asm.AnnotationVisitor;
import p272h.p364d.p365a.p366c.C9410b;
/* compiled from: StartPresenter.kt */
@Metadata(m10422d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0002J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m10421d2 = {"Lai/kudi/agent/start/StartPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpBasePresenter;", "Lai/kudi/agent/start/StartView;", "refresh", "Lai/kudi/commons/refresh/Refresh;", "(Lai/kudi/commons/refresh/Refresh;)V", "isNewUser", "", "()Z", "setNewUser", "(Z)V", "navigate", "", "hasSeenOnBoarding", OpsMetricTracker.START, "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class StartPresenter extends C9410b<StartView> {
    private boolean isNewUser;
    private final AnnotationVisitor refresh;

    public StartPresenter(AnnotationVisitor annotationVisitor) {
        Log_OC.getArray(annotationVisitor, "refresh");
        this.refresh = annotationVisitor;
        this.isNewUser = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void navigate(final boolean z) {
        ifViewAttached(new C9410b.InterfaceC9411a() { // from class: ai.kudi.agent.start.Max
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            public final void increment(Object obj) {
                boolean $z0 = z;
                StartView $r2 = (StartView) obj;
                StartPresenter.m40937navigate$lambda1($z0, $r2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: navigate$lambda-1  reason: not valid java name */
    public static final void m40937navigate$lambda1(boolean z, StartView startView) {
        Log_OC.getArray(startView, "view");
        startView.hideCheckingUpdate();
        if (z) {
            startView.navigateToLogin();
        } else {
            startView.navigateToIntro();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: start$lambda-0  reason: not valid java name */
    public static final void m40938start$lambda0(StartView startView) {
        Log_OC.getArray(startView, "view");
        startView.showCheckingUpdate();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isNewUser() {
        boolean z0 = this.isNewUser;
        return z0;
    }

    public final void setNewUser(boolean z) {
        this.isNewUser = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void start(boolean z) {
        C0565c $r1 = C0565c.f1525a;
        ifViewAttached($r1);
        AnnotationVisitor $r2 = this.refresh;
        $r2.onCreate();
        StartPresenter$start$2 $r3 = new StartPresenter$start$2(this, z);
        $r2.remove($r3);
        StartPresenter$start$3 $r4 = new StartPresenter$start$3(this, z);
        $r2.show($r4);
    }
}
