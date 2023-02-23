package p198f.p199a.objectweb.asm.util;

import ai.kudi.commons.refresh.activities.ForceUpdateActivity;
import android.app.Application;
import android.content.Intent;
import kotlin.p483e0.p485d.Log_OC;
/* compiled from: SimpleForceUpdateAction.kt */
/* renamed from: f.a.objectweb.asm.util.b */
/* loaded from: classes.dex */
public final class C7451b implements AnnotationVisitor {
    private final Application mContext;

    public C7451b(Application application) {
        Log_OC.getArray(application, "application");
        this.mContext = application;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p198f.p199a.objectweb.asm.util.AnnotationVisitor
    public void onOptionsItemSelected() {
        Application $r3 = this.mContext;
        Intent $r1 = new Intent($r3, ForceUpdateActivity.class);
        $r1.setFlags(268468224);
        Application $r32 = this.mContext;
        String $r2 = $r32.getPackageName();
        $r1.putExtra("extra.package.forceUpdateActivity", $r2);
        Application $r33 = this.mContext;
        $r33.startActivity($r1);
    }
}
