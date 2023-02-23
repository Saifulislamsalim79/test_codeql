package androidx.core.app;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Parcelable;
import android.view.View;
import java.util.List;
import java.util.Map;
/* compiled from: SharedElementCallback.java */
/* renamed from: androidx.core.app.p */
/* loaded from: classes2.dex */
public abstract class AbstractC1330p {

    /* compiled from: SharedElementCallback.java */
    /* renamed from: androidx.core.app.p$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC1331a {
    }

    /* renamed from: a */
    public abstract Parcelable m36343a(View view, Matrix matrix, RectF rectF);

    /* renamed from: b */
    public abstract View m36342b(Context context, Parcelable parcelable);

    /* renamed from: c */
    public abstract void m36341c(List<String> list, Map<String, View> map);

    /* renamed from: d */
    public abstract void m36340d(List<View> list);

    /* renamed from: e */
    public abstract void m36339e(List<String> list, List<View> list2, List<View> list3);

    /* renamed from: f */
    public abstract void m36338f(List<String> list, List<View> list2, List<View> list3);

    /* renamed from: g */
    public abstract void m36337g(List<String> list, List<View> list2, InterfaceC1331a interfaceC1331a);
}
