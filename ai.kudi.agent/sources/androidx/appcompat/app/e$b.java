package androidx.appcompat.app;

import android.content.Context;
import androidx.activity.p052d.InterfaceC0895b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppCompatActivity.java */
/* loaded from: classes2.dex */
public class e$b implements InterfaceC0895b {

    /* renamed from: a */
    final /* synthetic */ e f2561a;

    e$b(e eVar) {
        this.f2561a = eVar;
    }

    @Override // androidx.activity.p052d.InterfaceC0895b
    /* renamed from: a */
    public void mo35830a(Context context) {
        g delegate = this.f2561a.getDelegate();
        delegate.o();
        delegate.r(this.f2561a.getSavedStateRegistry().m34399a("androidx:appcompat"));
    }
}
