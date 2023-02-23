package androidx.lifecycle;

import java.io.Closeable;
import kotlin.p476c0.InterfaceC11719g;
import kotlinx.coroutines.C14057t1;
import kotlinx.coroutines.InterfaceC13932m0;
/* compiled from: ViewModel.kt */
/* renamed from: androidx.lifecycle.c */
/* loaded from: classes2.dex */
public final class C1547c implements Closeable, InterfaceC13932m0 {

    /* renamed from: c */
    private final InterfaceC11719g f4748c;

    public C1547c(InterfaceC11719g interfaceC11719g) {
        kotlin.e0.d.l.f(interfaceC11719g, "context");
        this.f4748c = interfaceC11719g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C14057t1.m3158d(mo3397o0(), null, 1, null);
    }

    @Override // kotlinx.coroutines.InterfaceC13932m0
    /* renamed from: o0 */
    public InterfaceC11719g mo3397o0() {
        return this.f4748c;
    }
}
