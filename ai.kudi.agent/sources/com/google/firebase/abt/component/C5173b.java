package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.abt.C5171b;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.p170o.InterfaceC6560b;
import java.util.HashMap;
import java.util.Map;
/* compiled from: AbtComponent.java */
/* renamed from: com.google.firebase.abt.component.b */
/* loaded from: classes2.dex */
public class C5173b {

    /* renamed from: a */
    private final Map<String, C5171b> f12889a = new HashMap();

    /* renamed from: b */
    private final Context f12890b;

    /* renamed from: c */
    private final InterfaceC6560b<InterfaceC5174a> f12891c;

    /* JADX INFO: Access modifiers changed from: protected */
    public C5173b(Context context, InterfaceC6560b<InterfaceC5174a> interfaceC6560b) {
        this.f12890b = context;
        this.f12891c = interfaceC6560b;
    }

    /* renamed from: a */
    protected C5171b m25452a(String str) {
        return new C5171b(this.f12890b, this.f12891c, str);
    }

    /* renamed from: b */
    public synchronized C5171b m25451b(String str) {
        if (!this.f12889a.containsKey(str)) {
            this.f12889a.put(str, m25452a(str));
        }
        return this.f12889a.get(str);
    }
}
