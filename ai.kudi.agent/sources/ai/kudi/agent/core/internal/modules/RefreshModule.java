package ai.kudi.agent.core.internal.modules;

import android.app.Application;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p198f.p199a.objectweb.asm.AnnotationVisitor;
import p198f.p199a.objectweb.asm.signature.C7448c;
import p198f.p199a.objectweb.asm.signature.InterfaceC7447b;
/* compiled from: RefreshModule.kt */
@Metadata(m10422d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m10421d2 = {"Lai/kudi/agent/core/di/modules/RefreshModule;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "providesChecker", "Lai/kudi/commons/refresh/checkers/Checker;", "providesRefresh", "Lai/kudi/commons/refresh/Refresh;", "checker", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RefreshModule {
    private final Application application;

    public RefreshModule(Application application) {
        Log_OC.getArray(application, "application");
        this.application = application;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final InterfaceC7447b providesChecker() {
        C7448c $r1 = new C7448c("https://app-service.kudi.ai/v1/recommendUpdates/agents", null, 2, null);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final AnnotationVisitor providesRefresh(InterfaceC7447b interfaceC7447b) {
        Log_OC.getArray(interfaceC7447b, "checker");
        Application $r2 = this.application;
        AnnotationVisitor $r3 = new AnnotationVisitor($r2, interfaceC7447b);
        return $r3;
    }
}
