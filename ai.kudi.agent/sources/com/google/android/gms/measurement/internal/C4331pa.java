package com.google.android.gms.measurement.internal;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.pa */
/* loaded from: classes2.dex */
public final class C4331pa {

    /* renamed from: a */
    private final b5 f10597a;

    public C4331pa(b5 b5Var) {
        this.f10597a = b5Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m27998a(String str, Bundle bundle) {
        String uri;
        this.f10597a.a().m27823h();
        if (this.f10597a.o()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        this.f10597a.F().u.m28271b(uri);
        this.f10597a.F().v.m28403b(this.f10597a.c().currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public final void m27997b() {
        this.f10597a.a().m27823h();
        if (m27995d()) {
            if (m27994e()) {
                this.f10597a.F().u.m28271b(null);
                Bundle bundle = new Bundle();
                bundle.putString(TransactionField.TRANSACTION_CHANNEL, "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f10597a.I().m28124u("auto", "_cmpx", bundle);
            } else {
                String m28272a = this.f10597a.F().u.m28272a();
                if (TextUtils.isEmpty(m28272a)) {
                    this.f10597a.b().t().m28014a("Cache still valid but referrer not found");
                } else {
                    long m28404a = ((this.f10597a.F().v.m28404a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(m28272a);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", m28404a);
                    Object obj = pair.first;
                    this.f10597a.I().m28124u(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f10597a.F().u.m28271b(null);
            }
            this.f10597a.F().v.m28403b(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m27996c() {
        if (m27995d() && m27994e()) {
            this.f10597a.F().u.m28271b(null);
        }
    }

    /* renamed from: d */
    final boolean m27995d() {
        return this.f10597a.F().v.m28404a() > 0;
    }

    /* renamed from: e */
    final boolean m27994e() {
        return m27995d() && this.f10597a.c().currentTimeMillis() - this.f10597a.F().v.m28404a() > this.f10597a.z().r(null, C4173c3.f10106R);
    }
}
