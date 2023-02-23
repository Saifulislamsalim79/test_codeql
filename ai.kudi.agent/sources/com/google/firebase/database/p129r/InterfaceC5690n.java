package com.google.firebase.database.p129r;

import com.google.android.gms.tasks.j;
import java.util.List;
import java.util.Map;
/* compiled from: PersistentConnection.java */
/* renamed from: com.google.firebase.database.r.n */
/* loaded from: classes2.dex */
public interface InterfaceC5690n {

    /* compiled from: PersistentConnection.java */
    /* renamed from: com.google.firebase.database.r.n$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5691a {
        /* renamed from: a */
        void mo23545a(List<String> list, Object obj, boolean z, Long l);

        /* renamed from: b */
        void mo23543b(boolean z);

        /* renamed from: c */
        void mo23541c(Map<String, Object> map);

        /* renamed from: d */
        void mo23540d(List<String> list, List<C5709p> list2, Long l);

        void onConnect();

        void onDisconnect();
    }

    /* renamed from: a */
    void mo24127a();

    /* renamed from: b */
    j<Object> mo24125b(List<String> list, Map<String, Object> map);

    /* renamed from: c */
    void mo24123c(List<String> list, Map<String, Object> map, InterfaceC5710q interfaceC5710q);

    /* renamed from: d */
    void mo24121d(String str);

    /* renamed from: f */
    void mo24117f(String str);

    /* renamed from: h */
    void mo24113h(List<String> list, Object obj, InterfaceC5710q interfaceC5710q);

    /* renamed from: j */
    void mo24109j(List<String> list, Object obj, String str, InterfaceC5710q interfaceC5710q);

    /* renamed from: k */
    void mo24107k(String str);

    /* renamed from: l */
    void mo24105l(List<String> list, Map<String, Object> map, InterfaceC5689m interfaceC5689m, Long l, InterfaceC5710q interfaceC5710q);

    /* renamed from: m */
    void mo24103m(String str);

    /* renamed from: o */
    void mo24099o(List<String> list, Map<String, Object> map);
}
