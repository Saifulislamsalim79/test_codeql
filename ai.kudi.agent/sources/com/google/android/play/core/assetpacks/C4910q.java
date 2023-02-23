package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C4983l;
import com.google.android.play.core.internal.C4989o;
import com.google.android.play.core.internal.InterfaceC4988n0;
import com.google.android.play.core.tasks.AbstractC5011c;
import com.google.android.play.core.tasks.C5013e;
import com.google.android.play.core.tasks.C5021m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p272h.p286c.p287a.p343d.p344a.p347c.C9357a;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.q */
/* loaded from: classes2.dex */
public final class C4910q implements InterfaceC4883j3 {

    /* renamed from: f */
    private static final C4957a f12460f = new C4957a("AssetPackServiceImpl");

    /* renamed from: g */
    private static final Intent f12461g = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    private final String f12462a;

    /* renamed from: b */
    private final C4939x0 f12463b;

    /* renamed from: c */
    private C4983l<InterfaceC4988n0> f12464c;

    /* renamed from: d */
    private C4983l<InterfaceC4988n0> f12465d;

    /* renamed from: e */
    private final AtomicBoolean f12466e = new AtomicBoolean();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4910q(Context context, C4939x0 c4939x0) {
        this.f12462a = context.getPackageName();
        this.f12463b = c4939x0;
        if (C4989o.m25903a(context)) {
            this.f12464c = new C4983l<>(C9357a.m14970a(context), f12460f, "AssetPackService", f12461g, C4888k3.f12387a);
            this.f12465d = new C4983l<>(C9357a.m14970a(context), f12460f, "AssetPackService-keepAlive", f12461g, C4893l3.f12405a);
        }
        f12460f.m25957c("AssetPackService initiated.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static /* synthetic */ ArrayList m26047f(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Bundle bundle = new Bundle();
            bundle.putString("module_name", (String) it.next());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static /* synthetic */ List m26046g(C4910q c4910q, List list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AbstractC4839b next = AbstractC4844c.m26132b((Bundle) list.get(i), c4910q.f12463b).mo26113e().values().iterator().next();
            if (next == null) {
                f12460f.m25955e("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if (C4932v1.m25997c(next.mo26116f())) {
                arrayList.add(next.mo26117e());
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public final void m26045h(int i, String str, int i2) {
        if (this.f12464c == null) {
            throw new C4923t0("The Play Store app is not installed or is an unofficial version.", i);
        }
        f12460f.m25954f("notifyModuleCompleted", new Object[0]);
        C5021m c5021m = new C5021m();
        this.f12464c.m25937c(new C4869h(this, c5021m, i, str, c5021m, i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static /* synthetic */ Bundle m26041m(Map map) {
        Bundle m26032v = m26032v();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        m26032v.putParcelableArrayList("installed_asset_module", arrayList);
        return m26032v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static Bundle m26038p(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", i);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static Bundle m26037q(int i, String str) {
        Bundle m26038p = m26038p(i);
        m26038p.putString("module_name", str);
        return m26038p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public static /* synthetic */ Bundle m26036r(int i, String str, String str2, int i2) {
        Bundle m26037q = m26037q(i, str);
        m26037q.putString("slice_id", str2);
        m26037q.putInt("chunk_number", i2);
        return m26037q;
    }

    /* renamed from: u */
    private static <T> AbstractC5011c<T> m26033u() {
        f12460f.m25955e("onError(%d)", -11);
        return C5013e.m25871a(new AssetPackException(-11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static Bundle m26032v() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10800);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        bundle.putIntegerArrayList("supported_patch_formats", new ArrayList<>());
        return bundle;
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4883j3
    /* renamed from: a */
    public final AbstractC5011c<List<String>> mo26016a(Map<String, Long> map) {
        if (this.f12464c == null) {
            return m26033u();
        }
        f12460f.m25954f("syncPacks", new Object[0]);
        C5021m c5021m = new C5021m();
        this.f12464c.m25937c(new C4859f(this, c5021m, map, c5021m));
        return c5021m.m25859a();
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4883j3
    /* renamed from: a */
    public final synchronized void mo26018a() {
        if (this.f12465d == null) {
            f12460f.m25953g("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        f12460f.m25954f("keepAlive", new Object[0]);
        if (!this.f12466e.compareAndSet(false, true)) {
            f12460f.m25954f("Service is already kept alive.", new Object[0]);
            return;
        }
        C5021m c5021m = new C5021m();
        this.f12465d.m25937c(new C4884k(this, c5021m, c5021m));
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4883j3
    /* renamed from: a */
    public final void mo26017a(List<String> list) {
        if (this.f12464c == null) {
            return;
        }
        f12460f.m25954f("cancelDownloads(%s)", list);
        C5021m c5021m = new C5021m();
        this.f12464c.m25937c(new C4854e(this, c5021m, list, c5021m));
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4883j3
    /* renamed from: b */
    public final void mo26015b(int i, String str) {
        m26045h(i, str, 10);
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4883j3
    /* renamed from: c */
    public final AbstractC5011c<ParcelFileDescriptor> mo26014c(int i, String str, String str2, int i2) {
        if (this.f12464c == null) {
            return m26033u();
        }
        f12460f.m25954f("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        C5021m c5021m = new C5021m();
        this.f12464c.m25937c(new C4879j(this, c5021m, i, str, str2, i2, c5021m));
        return c5021m.m25859a();
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4883j3
    /* renamed from: d */
    public final void mo26013d(int i, String str, String str2, int i2) {
        if (this.f12464c == null) {
            throw new C4923t0("The Play Store app is not installed or is an unofficial version.", i);
        }
        f12460f.m25954f("notifyChunkTransferred", new Object[0]);
        C5021m c5021m = new C5021m();
        this.f12464c.m25937c(new C4864g(this, c5021m, i, str, str2, i2, c5021m));
    }

    @Override // com.google.android.play.core.assetpacks.InterfaceC4883j3
    /* renamed from: j */
    public final void mo26007j(int i) {
        if (this.f12464c == null) {
            throw new C4923t0("The Play Store app is not installed or is an unofficial version.", i);
        }
        f12460f.m25954f("notifySessionFailed", new Object[0]);
        C5021m c5021m = new C5021m();
        this.f12464c.m25937c(new C4874i(this, c5021m, i, c5021m));
    }
}
