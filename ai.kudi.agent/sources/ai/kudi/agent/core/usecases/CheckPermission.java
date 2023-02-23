package ai.kudi.agent.core.usecases;

import android.content.Context;
import androidx.core.content.C1335a;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: CheckPermission.kt */
@Metadata(m10422d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m10421d2 = {"Lai/kudi/agent/core/usecases/CheckPermission;", "Lai/kudi/agent/core/usecases/NoInputUseCase;", "", "permission", "", "context", "Landroid/content/Context;", "(Ljava/lang/String;Landroid/content/Context;)V", "execute", "Lio/reactivex/Observable;", "getPermission", "", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class CheckPermission implements NoInputUseCase<Boolean> {
    private final Context context;
    private final String permission;

    public CheckPermission(String str, Context context) {
        Log_OC.getArray(str, "permission");
        Log_OC.getArray(context, "context");
        this.permission = str;
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: execute$lambda-0  reason: not valid java name */
    public static final Boolean m39169execute$lambda0(CheckPermission checkPermission) {
        Log_OC.getArray(checkPermission, "this$0");
        int $i0 = checkPermission.getPermission();
        boolean $z0 = $i0 == 0;
        Boolean $r1 = Boolean.valueOf($z0);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final int getPermission() {
        Context $r2 = this.context;
        String $r1 = this.permission;
        int $i0 = C1335a.m36327a($r2, $r1);
        return $i0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.NoInputUseCase
    public AbstractC11688p execute() {
        AbstractC11688p $r1 = AbstractC11688p.m10536J(new Callable() { // from class: ai.kudi.agent.core.usecases.HttpRequestTaskCallable
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                CheckPermission $r2 = CheckPermission.this;
                Boolean $r12 = CheckPermission.m39169execute$lambda0($r2);
                return $r12;
            }
        });
        Log_OC.loadImage($r1, "fromCallable {\n            getPermission() == PackageManager.PERMISSION_GRANTED\n        }");
        return $r1;
    }
}
