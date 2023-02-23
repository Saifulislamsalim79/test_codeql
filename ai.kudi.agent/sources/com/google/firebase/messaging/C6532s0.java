package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
/* renamed from: com.google.firebase.messaging.s0 */
/* loaded from: classes2.dex */
public final class C6532s0 {

    /* renamed from: a */
    private final SharedPreferences f15764a;

    /* renamed from: e */
    private final Executor f15768e;

    /* renamed from: d */
    private final ArrayDeque<String> f15767d = new ArrayDeque<>();

    /* renamed from: f */
    private boolean f15769f = false;

    /* renamed from: b */
    private final String f15765b = "topic_operation_queue";

    /* renamed from: c */
    private final String f15766c = ",";

    private C6532s0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f15764a = sharedPreferences;
        this.f15768e = executor;
    }

    /* renamed from: b */
    private boolean m21709b(boolean z) {
        if (!z || this.f15769f) {
            return z;
        }
        m21702i();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C6532s0 m21708c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C6532s0 c6532s0 = new C6532s0(sharedPreferences, "topic_operation_queue", ",", executor);
        c6532s0.m21707d();
        return c6532s0;
    }

    /* renamed from: d */
    private void m21707d() {
        synchronized (this.f15767d) {
            this.f15767d.clear();
            String string = this.f15764a.getString(this.f15765b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f15766c)) {
                String[] split = string.split(this.f15766c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f15767d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m21703h() {
        synchronized (this.f15767d) {
            this.f15764a.edit().putString(this.f15765b, m21704g()).commit();
        }
    }

    /* renamed from: i */
    private void m21702i() {
        this.f15768e.execute(new Runnable() { // from class: com.google.firebase.messaging.r0
            @Override // java.lang.Runnable
            public final void run() {
                C6532s0.this.m21703h();
            }
        });
    }

    /* renamed from: e */
    public String m21706e() {
        String peek;
        synchronized (this.f15767d) {
            peek = this.f15767d.peek();
        }
        return peek;
    }

    /* renamed from: f */
    public boolean m21705f(Object obj) {
        boolean remove;
        synchronized (this.f15767d) {
            remove = this.f15767d.remove(obj);
            m21709b(remove);
        }
        return remove;
    }

    /* renamed from: g */
    public String m21704g() {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = this.f15767d.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(this.f15766c);
        }
        return sb.toString();
    }
}
