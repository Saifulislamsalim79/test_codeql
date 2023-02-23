package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.C1291a;
import androidx.core.content.C1335a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p201g.p227h.p237k.C7675h;
/* compiled from: FragmentHostCallback.java */
/* renamed from: androidx.fragment.app.o */
/* loaded from: classes2.dex */
public abstract class AbstractC1505o<E> extends AbstractC1499k {

    /* renamed from: c */
    private final Activity f4622c;

    /* renamed from: d */
    private final Context f4623d;

    /* renamed from: e */
    private final Handler f4624e;

    /* renamed from: f */
    final FragmentManager f4625f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1505o(i iVar) {
        this(iVar, iVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.AbstractC1499k
    /* renamed from: c */
    public View mo35680c(int i) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1499k
    /* renamed from: d */
    public boolean mo35679d() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Activity m35678e() {
        return this.f4622c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Context m35677f() {
        return this.f4623d;
    }

    /* renamed from: g */
    public Handler m35676g() {
        return this.f4624e;
    }

    /* renamed from: h */
    public void mo35675h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: i */
    public abstract E mo35674i();

    /* renamed from: j */
    public LayoutInflater mo35673j() {
        return LayoutInflater.from(this.f4623d);
    }

    @Deprecated
    /* renamed from: k */
    public void m35672k(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: l */
    public boolean mo35671l(String str) {
        return false;
    }

    /* renamed from: m */
    public void m35670m(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C1335a.m36316l(this.f4623d, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    /* renamed from: n */
    public void m35669n(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C1291a.m36461v(this.f4622c, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: o */
    public void mo35668o() {
    }

    AbstractC1505o(Activity activity, Context context, Handler handler, int i) {
        this.f4625f = new C1510r();
        this.f4622c = activity;
        C7675h.m17865g(context, "context == null");
        this.f4623d = context;
        C7675h.m17865g(handler, "handler == null");
        this.f4624e = handler;
    }
}
