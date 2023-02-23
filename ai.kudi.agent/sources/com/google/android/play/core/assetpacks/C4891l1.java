package com.google.android.play.core.assetpacks;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.C4966c0;
import com.google.android.play.core.internal.InterfaceC5005y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.l1 */
/* loaded from: classes2.dex */
public final class C4891l1 {

    /* renamed from: f */
    private static final C4957a f12391f = new C4957a("ExtractorSessionStoreView");

    /* renamed from: a */
    private final C4840b0 f12392a;

    /* renamed from: b */
    private final InterfaceC5005y<InterfaceC4883j3> f12393b;

    /* renamed from: c */
    private final C4939x0 f12394c;

    /* renamed from: d */
    private final Map<Integer, C4876i1> f12395d = new HashMap();

    /* renamed from: e */
    private final ReentrantLock f12396e = new ReentrantLock();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4891l1(C4840b0 c4840b0, InterfaceC5005y<InterfaceC4883j3> interfaceC5005y, C4939x0 c4939x0, InterfaceC5005y<Executor> interfaceC5005y2) {
        this.f12392a = c4840b0;
        this.f12393b = interfaceC5005y;
        this.f12394c = c4939x0;
    }

    /* renamed from: a */
    private final <T> T m26094a(InterfaceC4886k1<T> interfaceC4886k1) {
        try {
            m26093b();
            return interfaceC4886k1.mo26101a();
        } finally {
            m26089f();
        }
    }

    /* renamed from: o */
    private final Map<String, C4876i1> m26080o(final List<String> list) {
        return (Map) m26094a(new InterfaceC4886k1(this, list) { // from class: com.google.android.play.core.assetpacks.d1

            /* renamed from: a */
            private final C4891l1 f12275a;

            /* renamed from: b */
            private final List f12276b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12275a = this;
                this.f12276b = list;
            }

            @Override // com.google.android.play.core.assetpacks.InterfaceC4886k1
            /* renamed from: a */
            public final Object mo26101a() {
                return this.f12275a.m26083l(this.f12276b);
            }
        });
    }

    /* renamed from: q */
    private final C4876i1 m26078q(int i) {
        Map<Integer, C4876i1> map = this.f12395d;
        Integer valueOf = Integer.valueOf(i);
        C4876i1 c4876i1 = map.get(valueOf);
        if (c4876i1 != null) {
            return c4876i1;
        }
        throw new C4923t0(String.format("Could not find session %d while trying to get it", valueOf), i);
    }

    /* renamed from: r */
    private static String m26077r(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.isEmpty()) {
            throw new C4923t0("Session without pack received.");
        }
        return stringArrayList.get(0);
    }

    /* renamed from: s */
    private static <T> List<T> m26076s(List<T> list) {
        return list == null ? Collections.emptyList() : list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m26093b() {
        this.f12396e.lock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m26092c(final int i) {
        m26094a(new InterfaceC4886k1(this, i) { // from class: com.google.android.play.core.assetpacks.f1

            /* renamed from: a */
            private final C4891l1 f12306a;

            /* renamed from: b */
            private final int f12307b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12306a = this;
                this.f12307b = i;
            }

            @Override // com.google.android.play.core.assetpacks.InterfaceC4886k1
            /* renamed from: a */
            public final Object mo26101a() {
                this.f12306a.m26082m(this.f12307b);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m26091d(final String str, final int i, final long j) {
        m26094a(new InterfaceC4886k1(this, str, i, j) { // from class: com.google.android.play.core.assetpacks.c1

            /* renamed from: a */
            private final C4891l1 f12268a;

            /* renamed from: b */
            private final String f12269b;

            /* renamed from: c */
            private final int f12270c;

            /* renamed from: d */
            private final long f12271d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12268a = this;
                this.f12269b = str;
                this.f12270c = i;
                this.f12271d = j;
            }

            @Override // com.google.android.play.core.assetpacks.InterfaceC4886k1
            /* renamed from: a */
            public final Object mo26101a() {
                this.f12268a.m26087h(this.f12269b, this.f12270c, this.f12271d);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean m26090e(final Bundle bundle) {
        return ((Boolean) m26094a(new InterfaceC4886k1(this, bundle) { // from class: com.google.android.play.core.assetpacks.a1

            /* renamed from: a */
            private final C4891l1 f12254a;

            /* renamed from: b */
            private final Bundle f12255b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12254a = this;
                this.f12255b = bundle;
            }

            @Override // com.google.android.play.core.assetpacks.InterfaceC4886k1
            /* renamed from: a */
            public final Object mo26101a() {
                return this.f12254a.m26081n(this.f12255b);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m26089f() {
        this.f12396e.unlock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void m26088g(int i) {
        m26078q(i).f12354c.f12336c = 5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m26087h(String str, int i, long j) {
        C4876i1 c4876i1 = m26080o(Arrays.asList(str)).get(str);
        if (c4876i1 == null || C4932v1.m25994f(c4876i1.f12354c.f12336c)) {
            f12391f.m25955e(String.format("Could not find pack %s while trying to complete it", str), new Object[0]);
        }
        this.f12392a.m26167A(str, i, j);
        c4876i1.f12354c.f12336c = 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean m26086i(final Bundle bundle) {
        return ((Boolean) m26094a(new InterfaceC4886k1(this, bundle) { // from class: com.google.android.play.core.assetpacks.b1

            /* renamed from: a */
            private final C4891l1 f12261a;

            /* renamed from: b */
            private final Bundle f12262b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12261a = this;
                this.f12262b = bundle;
            }

            @Override // com.google.android.play.core.assetpacks.InterfaceC4886k1
            /* renamed from: a */
            public final Object mo26101a() {
                return this.f12261a.m26085j(this.f12262b);
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ Boolean m26085j(Bundle bundle) {
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.TRUE;
        }
        Map<Integer, C4876i1> map = this.f12395d;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            C4876i1 c4876i1 = this.f12395d.get(valueOf);
            if (c4876i1.f12354c.f12336c == 6) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(!C4932v1.m25996d(c4876i1.f12354c.f12336c, bundle.getInt(C4966c0.m25949a(TransactionField.STATUS, m26077r(bundle)))));
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public final Map<Integer, C4876i1> m26084k() {
        return this.f12395d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final /* synthetic */ Map m26083l(List list) {
        HashMap hashMap = new HashMap();
        for (C4876i1 c4876i1 : this.f12395d.values()) {
            String str = c4876i1.f12354c.f12334a;
            if (list.contains(str)) {
                C4876i1 c4876i12 = (C4876i1) hashMap.get(str);
                if ((c4876i12 == null ? -1 : c4876i12.f12352a) < c4876i1.f12352a) {
                    hashMap.put(str, c4876i1);
                }
            }
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void m26082m(int i) {
        C4876i1 m26078q = m26078q(i);
        if (!C4932v1.m25994f(m26078q.f12354c.f12336c)) {
            throw new C4923t0(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
        }
        C4840b0 c4840b0 = this.f12392a;
        C4871h1 c4871h1 = m26078q.f12354c;
        c4840b0.m26167A(c4871h1.f12334a, m26078q.f12353b, c4871h1.f12335b);
        C4871h1 c4871h12 = m26078q.f12354c;
        int i2 = c4871h12.f12336c;
        if (i2 == 5 || i2 == 6) {
            this.f12392a.m26141t(c4871h12.f12334a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ Boolean m26081n(Bundle bundle) {
        C4881j1 c4881j1;
        int i = bundle.getInt("session_id");
        if (i == 0) {
            return Boolean.FALSE;
        }
        Map<Integer, C4876i1> map = this.f12395d;
        Integer valueOf = Integer.valueOf(i);
        boolean z = false;
        if (map.containsKey(valueOf)) {
            C4876i1 m26078q = m26078q(i);
            int i2 = bundle.getInt(C4966c0.m25949a(TransactionField.STATUS, m26078q.f12354c.f12334a));
            if (C4932v1.m25996d(m26078q.f12354c.f12336c, i2)) {
                f12391f.m25957c("Found stale update for session %s with status %d.", valueOf, Integer.valueOf(m26078q.f12354c.f12336c));
                C4871h1 c4871h1 = m26078q.f12354c;
                String str = c4871h1.f12334a;
                int i3 = c4871h1.f12336c;
                if (i3 == 4) {
                    this.f12393b.m25876a().mo26015b(i, str);
                } else if (i3 == 5) {
                    this.f12393b.m25876a().mo26007j(i);
                } else if (i3 == 6) {
                    this.f12393b.m25876a().mo26017a(Arrays.asList(str));
                }
            } else {
                m26078q.f12354c.f12336c = i2;
                if (C4932v1.m25994f(i2)) {
                    m26092c(i);
                    this.f12394c.m25985b(m26078q.f12354c.f12334a);
                } else {
                    List<C4881j1> list = m26078q.f12354c.f12338e;
                    int size = list.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        C4881j1 c4881j12 = list.get(i4);
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList(C4966c0.m25948b("chunk_intents", m26078q.f12354c.f12334a, c4881j12.f12366a));
                        if (parcelableArrayList != null) {
                            for (int i5 = 0; i5 < parcelableArrayList.size(); i5++) {
                                if (parcelableArrayList.get(i5) != null && ((Intent) parcelableArrayList.get(i5)).getData() != null) {
                                    c4881j12.f12369d.get(i5).f12324a = true;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            String m26077r = m26077r(bundle);
            long j = bundle.getLong(C4966c0.m25949a("pack_version", m26077r));
            int i6 = bundle.getInt(C4966c0.m25949a(TransactionField.STATUS, m26077r));
            long j2 = bundle.getLong(C4966c0.m25949a("total_bytes_to_download", m26077r));
            ArrayList<String> stringArrayList = bundle.getStringArrayList(C4966c0.m25949a("slice_ids", m26077r));
            ArrayList arrayList = new ArrayList();
            Iterator it = m26076s(stringArrayList).iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(C4966c0.m25948b("chunk_intents", m26077r, str2));
                ArrayList arrayList2 = new ArrayList();
                for (Intent intent : m26076s(parcelableArrayList2)) {
                    Iterator it2 = it;
                    if (intent != null) {
                        z = true;
                    }
                    arrayList2.add(new C4866g1(z));
                    it = it2;
                    z = false;
                }
                Iterator it3 = it;
                String string = bundle.getString(C4966c0.m25948b("uncompressed_hash_sha256", m26077r, str2));
                long j3 = bundle.getLong(C4966c0.m25948b("uncompressed_size", m26077r, str2));
                int i7 = bundle.getInt(C4966c0.m25948b("patch_format", m26077r, str2), 0);
                if (i7 != 0) {
                    c4881j1 = new C4881j1(str2, string, j3, arrayList2, 0, i7);
                    z = false;
                } else {
                    z = false;
                    c4881j1 = new C4881j1(str2, string, j3, arrayList2, bundle.getInt(C4966c0.m25948b("compression_format", m26077r, str2), 0), 0);
                }
                arrayList.add(c4881j1);
                it = it3;
            }
            this.f12395d.put(Integer.valueOf(i), new C4876i1(i, bundle.getInt("app_version_code"), new C4871h1(m26077r, j, i6, j2, arrayList)));
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public final void m26079p(final int i) {
        m26094a(new InterfaceC4886k1(this, i) { // from class: com.google.android.play.core.assetpacks.e1

            /* renamed from: a */
            private final C4891l1 f12290a;

            /* renamed from: b */
            private final int f12291b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12290a = this;
                this.f12291b = i;
            }

            @Override // com.google.android.play.core.assetpacks.InterfaceC4886k1
            /* renamed from: a */
            public final Object mo26101a() {
                this.f12290a.m26088g(this.f12291b);
                return null;
            }
        });
    }
}
