package com.google.mlkit.common.p186b;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import java.util.UUID;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.b.n */
/* loaded from: classes2.dex */
public class C6944n {

    /* renamed from: b */
    public static final C5296n<?> f16647b;

    /* renamed from: a */
    private final Context f16648a;

    static {
        C5296n.C5298b m25229a = C5296n.m25229a(C6944n.class);
        m25229a.m25214b(C5313u.m25157j(C6939i.class));
        m25229a.m25214b(C5313u.m25157j(Context.class));
        m25229a.m25210f(C6928c0.f16620a);
        f16647b = m25229a.m25212d();
    }

    public C6944n(Context context) {
        this.f16648a = context;
    }

    /* renamed from: b */
    private final SharedPreferences m20432b() {
        return this.f16648a.getSharedPreferences("com.google.mlkit.internal", 0);
    }

    /* renamed from: a */
    public synchronized String m20433a() {
        String string = m20432b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        m20432b().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }
}
