package androidx.activity.result.p053f;

import android.content.Context;
import android.content.Intent;
/* compiled from: ActivityResultContract.java */
/* renamed from: androidx.activity.result.f.a */
/* loaded from: classes2.dex */
public abstract class AbstractC0908a<I, O> {

    /* compiled from: ActivityResultContract.java */
    /* renamed from: androidx.activity.result.f.a$a */
    /* loaded from: classes2.dex */
    public static final class C0909a<T> {

        /* renamed from: a */
        private final T f2421a;

        public C0909a(T t) {
            this.f2421a = t;
        }

        /* renamed from: a */
        public T m37843a() {
            return this.f2421a;
        }
    }

    /* renamed from: a */
    public abstract Intent mo35877a(Context context, I i);

    /* renamed from: b */
    public C0909a<O> mo37842b(Context context, I i) {
        return null;
    }

    /* renamed from: c */
    public abstract O mo35876c(int i, Intent intent);
}
