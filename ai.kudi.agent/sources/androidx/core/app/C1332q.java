package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C1335a;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TaskStackBuilder.java */
/* renamed from: androidx.core.app.q */
/* loaded from: classes2.dex */
public final class C1332q implements Iterable<Intent> {

    /* renamed from: c */
    private final ArrayList<Intent> f4179c = new ArrayList<>();

    /* renamed from: d */
    private final Context f4180d;

    private C1332q(Context context) {
        this.f4180d = context;
    }

    /* renamed from: h */
    public static C1332q m36333h(Context context) {
        return new C1332q(context);
    }

    /* renamed from: d */
    public C1332q m36336d(Intent intent) {
        this.f4179c.add(intent);
        return this;
    }

    /* renamed from: e */
    public C1332q m36335e(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = C1312i.m36433a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f4180d.getPackageManager());
            }
            m36334f(component);
            m36336d(supportParentActivityIntent);
        }
        return this;
    }

    /* renamed from: f */
    public C1332q m36334f(ComponentName componentName) {
        int size = this.f4179c.size();
        try {
            Intent m36432b = C1312i.m36432b(this.f4180d, componentName);
            while (m36432b != null) {
                this.f4179c.add(size, m36432b);
                m36432b = C1312i.m36432b(this.f4180d, m36432b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f4179c.iterator();
    }

    /* renamed from: k */
    public void m36332k() {
        m36331l(null);
    }

    /* renamed from: l */
    public void m36331l(Bundle bundle) {
        if (!this.f4179c.isEmpty()) {
            ArrayList<Intent> arrayList = this.f4179c;
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (C1335a.m36317k(this.f4180d, intentArr, bundle)) {
                return;
            }
            Intent intent = new Intent(intentArr[intentArr.length - 1]);
            intent.addFlags(268435456);
            this.f4180d.startActivity(intent);
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
