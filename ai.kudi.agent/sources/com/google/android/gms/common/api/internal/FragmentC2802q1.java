package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import p201g.p218e.C7521a;
import p272h.p286c.p287a.p300b.p307d.p312e.HandlerC8431i;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.android.gms.common.api.internal.q1 */
/* loaded from: classes2.dex */
public final class FragmentC2802q1 extends Fragment implements InterfaceC2775i {

    /* renamed from: f */
    private static final WeakHashMap<Activity, WeakReference<FragmentC2802q1>> f7850f = new WeakHashMap<>();

    /* renamed from: c */
    private final Map<String, LifecycleCallback> f7851c = Collections.synchronizedMap(new C7521a());

    /* renamed from: d */
    private int f7852d = 0;

    /* renamed from: e */
    private Bundle f7853e;

    /* renamed from: f */
    public static FragmentC2802q1 m31922f(Activity activity) {
        FragmentC2802q1 fragmentC2802q1;
        WeakReference<FragmentC2802q1> weakReference = f7850f.get(activity);
        if (weakReference == null || (fragmentC2802q1 = weakReference.get()) == null) {
            try {
                FragmentC2802q1 fragmentC2802q12 = (FragmentC2802q1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (fragmentC2802q12 == null || fragmentC2802q12.isRemoving()) {
                    fragmentC2802q12 = new FragmentC2802q1();
                    activity.getFragmentManager().beginTransaction().add(fragmentC2802q12, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                f7850f.put(activity, new WeakReference<>(fragmentC2802q12));
                return fragmentC2802q12;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
            }
        }
        return fragmentC2802q1;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2775i
    /* renamed from: a */
    public final void mo31920a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f7851c.containsKey(str)) {
            this.f7851c.put(str, lifecycleCallback);
            if (this.f7852d > 0) {
                new HandlerC8431i(Looper.getMainLooper()).post(new RunnableC2799p1(this, lifecycleCallback, str));
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
        return cls.cast(this.f7851c.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC2775i
    /* renamed from: d */
    public final Activity mo31918d() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.f7851c.values()) {
            lifecycleCallback.m32058a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.f7851c.values()) {
            lifecycleCallback.mo31952e(i, i2, intent);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7852d = 1;
        this.f7853e = bundle;
        for (Map.Entry<String, LifecycleCallback> entry : this.f7851c.entrySet()) {
            entry.getValue().mo31951f(bundle != null ? bundle.getBundle(entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f7852d = 5;
        for (LifecycleCallback lifecycleCallback : this.f7851c.values()) {
            lifecycleCallback.m32054g();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f7852d = 3;
        for (LifecycleCallback lifecycleCallback : this.f7851c.values()) {
            lifecycleCallback.mo31906h();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry<String, LifecycleCallback> entry : this.f7851c.entrySet()) {
            Bundle bundle2 = new Bundle();
            entry.getValue().mo31950i(bundle2);
            bundle.putBundle(entry.getKey(), bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f7852d = 2;
        for (LifecycleCallback lifecycleCallback : this.f7851c.values()) {
            lifecycleCallback.mo31905j();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f7852d = 4;
        for (LifecycleCallback lifecycleCallback : this.f7851c.values()) {
            lifecycleCallback.mo31904k();
        }
    }
}
