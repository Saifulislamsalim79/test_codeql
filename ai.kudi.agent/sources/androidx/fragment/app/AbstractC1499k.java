package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
/* compiled from: FragmentContainer.java */
/* renamed from: androidx.fragment.app.k */
/* loaded from: classes2.dex */
public abstract class AbstractC1499k {
    @Deprecated
    /* renamed from: b */
    public Fragment m35709b(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    /* renamed from: c */
    public abstract View mo35680c(int i);

    /* renamed from: d */
    public abstract boolean mo35679d();
}
