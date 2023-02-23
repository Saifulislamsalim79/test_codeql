package ai.kudi.agent.core.usecases;

import android.app.Activity;
import androidx.core.app.C1291a;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p444e.AbstractC11688p;
/* compiled from: RequestPermissionActivity.kt */
@Metadata(m10422d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m10421d2 = {"Lai/kudi/agent/core/usecases/RequestPermissionActivity;", "Lai/kudi/agent/core/usecases/RequestPermission;", "permission", "", "requestCode", "", "activity", "Landroid/app/Activity;", "(Ljava/lang/String;ILandroid/app/Activity;)V", "execute", "Lio/reactivex/Observable;", "", "forceShow", "app_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class RequestPermissionActivity extends RequestPermission {
    private final Activity activity;
    private final String permission;
    private final int requestCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestPermissionActivity(String str, int i, Activity activity) {
        super(str, i);
        Log_OC.getArray(str, "permission");
        Log_OC.getArray(activity, "activity");
        this.permission = str;
        this.requestCode = i;
        this.activity = activity;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // ai.kudi.agent.core.usecases.OneInputUseCase
    public /* bridge */ /* synthetic */ AbstractC11688p execute(Object obj) {
        Boolean $r2 = (Boolean) obj;
        boolean $z0 = $r2.booleanValue();
        AbstractC11688p $r3 = execute($z0);
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AbstractC11688p execute(boolean z) {
        if (!z) {
            Activity $r2 = this.activity;
            String $r1 = this.permission;
            boolean $z0 = C1291a.m36463t($r2, $r1);
            if ($z0) {
                Boolean $r3 = Boolean.FALSE;
                AbstractC11688p $r4 = AbstractC11688p.m10532N($r3);
                Log_OC.loadImage($r4, "just(false)");
                return $r4;
            }
        }
        Activity $r22 = this.activity;
        String $r12 = this.permission;
        String[] $r5 = {$r12};
        int $i0 = this.requestCode;
        C1291a.m36466q($r22, $r5, $i0);
        Boolean $r32 = Boolean.TRUE;
        AbstractC11688p $r42 = AbstractC11688p.m10532N($r32);
        Log_OC.loadImage($r42, "just(true)");
        return $r42;
    }
}
