package ai.kudi.agent.core.util;

import android.app.Activity;
import android.content.Context;
import androidx.core.app.C1291a;
import androidx.core.content.C1335a;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: AndroidOsPermissionUtil.kt */
@Metadata(m10422d1 = {"\u00004\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a/\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f\"\u00020\u0005¢\u0006\u0002\u0010\r\u001a/\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f\"\u00020\u0005¢\u0006\u0002\u0010\u0010\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0012"}, m10421d2 = {"hasPermission", "", "context", "Landroid/content/Context;", "permission", "", "requestPermission", "", "activity", "Landroid/app/Activity;", "requestCode", "", "", "(Landroid/app/Activity;I[Ljava/lang/String;)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;I[Ljava/lang/String;)V", "requiresPermissionRationale", "core_release"}, k = 2, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidOsPermissionUtilKt {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final boolean hasPermission(Context context, String str) {
        Log_OC.getArray(context, "context");
        Log_OC.getArray(str, "permission");
        int $i0 = C1335a.m36327a(context, str);
        return $i0 == 0;
    }

    public static final void requestPermission(Activity activity, int i, String... strArr) {
        Log_OC.getArray(activity, "activity");
        Log_OC.getArray(strArr, "permission");
        C1291a.m36466q(activity, strArr, i);
    }

    public static final void requestPermission(Fragment fragment, int i, String... strArr) {
        Log_OC.getArray(fragment, "fragment");
        Log_OC.getArray(strArr, "permission");
        fragment.requestPermissions(strArr, i);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static final boolean requiresPermissionRationale(Activity activity, String str) {
        Log_OC.getArray(activity, "activity");
        Log_OC.getArray(str, "permission");
        boolean $z0 = C1291a.m36463t(activity, str);
        return $z0;
    }
}
