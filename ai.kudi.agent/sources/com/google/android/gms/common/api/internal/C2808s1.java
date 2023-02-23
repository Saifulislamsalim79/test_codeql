package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.AbstractC1449b0;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p201g.p218e.C7521a;
import p272h.p286c.p287a.p300b.p307d.p312e.HandlerC8431i;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.internal.s1 */
/* loaded from: classes2.dex */
public final class C2808s1 extends Fragment implements InterfaceC2775i {

    /* renamed from: f */
    private static final WeakHashMap<androidx.fragment.app.i, WeakReference<C2808s1>> f7865f = new WeakHashMap<>();

    /* renamed from: c */
    private final Map<String, LifecycleCallback> f7866c = Collections.synchronizedMap(new C7521a());

    /* renamed from: d */
    private int f7867d = 0;

    /* renamed from: e */
    private Bundle f7868e;

    /* renamed from: h */
    public static C2808s1 m31915h(androidx.fragment.app.i iVar) {
        C2808s1 c2808s1;
        WeakReference<C2808s1> weakReference = f7865f.get(iVar);
        if (weakReference == null || (c2808s1 = weakReference.get()) == null) {
            try {
                C2808s1 c2808s12 = (C2808s1) iVar.getSupportFragmentManager().m35938g0("SupportLifecycleFragmentImpl");
                if (c2808s12 == null || c2808s12.isRemoving()) {
                    c2808s12 = new C2808s1();
                    AbstractC1449b0 m35924l = iVar.getSupportFragmentManager().m35924l();
                    m35924l.m35826e(c2808s12, "SupportLifecycleFragmentImpl");
                    m35924l.mo35804j();
                }
                f7865f.put(iVar, new WeakReference<>(c2808s12));
                return c2808s12;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            }
        }
        return c2808s1;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2775i
    /* renamed from: a */
    public final void mo31920a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f7866c.containsKey(str)) {
            this.f7866c.put(str, lifecycleCallback);
            if (this.f7867d > 0) {
                new HandlerC8431i(Looper.getMainLooper()).post(new RunnableC2805r1(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2775i
    /* renamed from: b */
    public final <T extends LifecycleCallback> T mo31919b(String str, Class<T> cls) {
        return cls.cast(this.f7866c.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2775i
    /* renamed from: d */
    public final /* synthetic */ Activity mo31918d() {
        return getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f7866c.values()) {
            lifecycleCallback.m32058a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f7866c.values()) {
            lifecycleCallback.mo31952e(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7867d = 1;
        this.f7868e = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f7866c.entrySet()) {
            entry.getValue().mo31951f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f7867d = 5;
        for (LifecycleCallback lifecycleCallback : this.f7866c.values()) {
            lifecycleCallback.m32054g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f7867d = 3;
        for (LifecycleCallback lifecycleCallback : this.f7866c.values()) {
            lifecycleCallback.mo31906h();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f7866c.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo31950i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f7867d = 2;
        for (LifecycleCallback lifecycleCallback : this.f7866c.values()) {
            lifecycleCallback.mo31905j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f7867d = 4;
        for (LifecycleCallback lifecycleCallback : this.f7866c.values()) {
            lifecycleCallback.mo31904k();
        }
    }
}
