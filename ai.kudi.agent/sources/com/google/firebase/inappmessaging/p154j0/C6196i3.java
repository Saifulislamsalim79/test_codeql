package com.google.firebase.inappmessaging.p154j0;

import android.os.Bundle;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.inappmessaging.p154j0.C6196i3;
import com.google.firebase.p170o.InterfaceC6558a;
import com.google.firebase.p170o.InterfaceC6560b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: ProxyAnalyticsConnector.java */
/* renamed from: com.google.firebase.inappmessaging.j0.i3 */
/* loaded from: classes2.dex */
public class C6196i3 implements InterfaceC5174a {

    /* renamed from: a */
    private volatile Object f15062a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ProxyAnalyticsConnector.java */
    /* renamed from: com.google.firebase.inappmessaging.j0.i3$b */
    /* loaded from: classes2.dex */
    public static class C6198b implements InterfaceC5174a.InterfaceC5175a {

        /* renamed from: c */
        private static final Object f15063c = new Object();

        /* renamed from: a */
        private Set<String> f15064a;

        /* renamed from: b */
        private volatile Object f15065b;

        @Override // com.google.firebase.analytics.p111a.InterfaceC5174a.InterfaceC5175a
        /* renamed from: a */
        public void mo22580a(Set<String> set) {
            Object obj = this.f15065b;
            if (obj == f15063c) {
                return;
            }
            if (obj != null) {
                ((InterfaceC5174a.InterfaceC5175a) obj).mo22580a(set);
                return;
            }
            synchronized (this) {
                this.f15064a.addAll(set);
            }
        }

        /* renamed from: b */
        public /* synthetic */ void m22579b(String str, InterfaceC5174a.InterfaceC5176b interfaceC5176b, InterfaceC6560b interfaceC6560b) {
            if (this.f15065b == f15063c) {
                return;
            }
            InterfaceC5174a.InterfaceC5175a mo22583g = ((InterfaceC5174a) interfaceC6560b.get()).mo22583g(str, interfaceC5176b);
            this.f15065b = mo22583g;
            synchronized (this) {
                if (!this.f15064a.isEmpty()) {
                    mo22583g.mo22580a(this.f15064a);
                    this.f15064a = new HashSet();
                }
            }
        }

        private C6198b(final String str, final InterfaceC5174a.InterfaceC5176b interfaceC5176b, InterfaceC6558a<InterfaceC5174a> interfaceC6558a) {
            this.f15064a = new HashSet();
            interfaceC6558a.mo21639a(new InterfaceC6558a.InterfaceC6559a() { // from class: com.google.firebase.inappmessaging.j0.v1
                @Override // com.google.firebase.p170o.InterfaceC6558a.InterfaceC6559a
                /* renamed from: a */
                public final void mo21638a(InterfaceC6560b interfaceC6560b) {
                    C6196i3.C6198b.this.m22579b(str, interfaceC5176b, interfaceC6560b);
                }
            });
        }
    }

    public C6196i3(InterfaceC6558a<InterfaceC5174a> interfaceC6558a) {
        this.f15062a = interfaceC6558a;
        interfaceC6558a.mo21639a(new InterfaceC6558a.InterfaceC6559a() { // from class: com.google.firebase.inappmessaging.j0.u1
            @Override // com.google.firebase.p170o.InterfaceC6558a.InterfaceC6559a
            /* renamed from: a */
            public final void mo21638a(InterfaceC6560b interfaceC6560b) {
                C6196i3.this.m22582h(interfaceC6560b);
            }
        });
    }

    /* renamed from: i */
    private InterfaceC5174a m22581i() {
        Object obj = this.f15062a;
        if (obj instanceof InterfaceC5174a) {
            return (InterfaceC5174a) obj;
        }
        return null;
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    /* renamed from: a */
    public Map<String, Object> mo22589a(boolean z) {
        return Collections.emptyMap();
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    /* renamed from: b */
    public void mo22588b(InterfaceC5174a.C5177c c5177c) {
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    /* renamed from: c */
    public void mo22587c(String str, String str2, Bundle bundle) {
        InterfaceC5174a m22581i = m22581i();
        if (m22581i != null) {
            m22581i.mo22587c(str, str2, bundle);
        }
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    /* renamed from: d */
    public int mo22586d(String str) {
        return 0;
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    /* renamed from: e */
    public List<InterfaceC5174a.C5177c> mo22585e(String str, String str2) {
        return Collections.emptyList();
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    /* renamed from: f */
    public void mo22584f(String str, String str2, Object obj) {
        InterfaceC5174a m22581i = m22581i();
        if (m22581i != null) {
            m22581i.mo22584f(str, str2, obj);
        }
    }

    @Override // com.google.firebase.analytics.p111a.InterfaceC5174a
    /* renamed from: g */
    public InterfaceC5174a.InterfaceC5175a mo22583g(String str, InterfaceC5174a.InterfaceC5176b interfaceC5176b) {
        Object obj = this.f15062a;
        if (obj instanceof InterfaceC5174a) {
            return ((InterfaceC5174a) obj).mo22583g(str, interfaceC5176b);
        }
        return new C6198b(str, interfaceC5176b, (InterfaceC6558a) obj);
    }

    /* renamed from: h */
    public /* synthetic */ void m22582h(InterfaceC6560b interfaceC6560b) {
        this.f15062a = interfaceC6560b.get();
    }
}
