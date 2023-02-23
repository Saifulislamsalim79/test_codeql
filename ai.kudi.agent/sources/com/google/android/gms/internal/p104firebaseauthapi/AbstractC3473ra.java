package com.google.android.gms.internal.p104firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.ra */
/* loaded from: classes2.dex */
abstract class AbstractC3473ra<T> implements Iterator<T> {

    /* renamed from: c */
    private T f8906c;

    /* renamed from: d */
    private int f8907d = 2;

    /* renamed from: a */
    protected abstract T mo29915a();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final T m30381b() {
        this.f8907d = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f8907d;
        if (i != 4) {
            int i2 = i - 1;
            if (i != 0) {
                if (i2 != 0) {
                    if (i2 != 2) {
                        this.f8907d = 4;
                        this.f8906c = mo29915a();
                        if (this.f8907d != 3) {
                            this.f8907d = 1;
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.f8907d = 2;
            T t = this.f8906c;
            this.f8906c = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
